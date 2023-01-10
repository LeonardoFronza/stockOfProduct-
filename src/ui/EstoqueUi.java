package ui;

import estoque.Estoque;
import estoque.Produto;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EstoqueUi {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        FileWriter arq = new FileWriter("d:\\logEstoque.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        Estoque estoque = new Estoque();
        Produto produto;

        int codigoProduto,qtdProduto,qtdMinimaProduto;
        String nomeProduto;

        boolean rodaDeNovo = true;
        while (rodaDeNovo) {

            System.out.println("\n[1] Cadastrar Produto\n" +
                    "[2] Adicionar quantidade de produto no estoque\n" +
                    "[3] Remover quantidade de produto do estoque\n" +
                    "[4] Listar todos os produtos\n" +
                    "[5] Listar produtos com o abaixo do minimo\n" +
                    "[6] Sair");

            System.out.println("Escolha uma das opções:");
            int respotaUser = sc.nextInt();

            while (respotaUser > 6) {
                System.out.println("Você digitou um valor invalido, digite novamente:");
                respotaUser = sc.nextInt();
            }

            switch (respotaUser) {
                case 1:
                    System.out.println("CADASTRAR UM PRODUTO");

                    System.out.println("Digite o codigo do produto:");
                    codigoProduto = sc.nextInt();

                    System.out.println("Digite a quantidade do produto:");
                    qtdProduto = sc.nextInt();

                    System.out.println("Digite a quantidade minima do produto:");
                    qtdMinimaProduto = sc.nextInt();

                    System.out.println("Digite o nome do produto:");
                    nomeProduto = sc.next();

                    produto = new Produto(codigoProduto, qtdProduto, qtdMinimaProduto, nomeProduto);

                    if(estoque.insereProduto(produto)) {
                        System.out.println("Você inseriu com sucesso!\n");
                    }else{
                        System.out.println("O codigo deste produto já existe no sistema, tente adiconar com outro codigo.");
                    }

                    break;
                case 2:
                    System.out.println("ADICIONAR QUANTIDADE DE PRODUTO NO ESTOQUE");

                    System.out.println("Digite o codigo do produto a ser alterado:");
                    codigoProduto = sc.nextInt();

                    System.out.println("Digite a quantidade do produto:");
                    qtdProduto = sc.nextInt();

                    if(estoque.adicionaQtdPordutoEstoque(codigoProduto, qtdProduto)){
                        System.out.println("Você inseriu com sucesso!\n");
                    }else{
                        System.out.println("O valor inserido é um valor abaixo de zero, tente de novo, com um valor acima de 0!\n");
                    }

                    break;
                case 3:
                    System.out.println("REMOVER QUANTIDADE DE PRODUTO NO ESTOQUE");

                    System.out.println("Digite o codigo do produto a ser alterado:");
                    codigoProduto = sc.nextInt();

                    System.out.println("Digite a quantidade do produto:");
                    qtdProduto = sc.nextInt();

                    if(estoque.removeQtdProdutoEstoque(codigoProduto, qtdProduto)){
                        System.out.println("Você removeu com sucesso!\n");
                    }else {
                        System.out.println("Não foi possivel remover a quantidade desejada, verifique se é possivel essa operação.\n");
                    }

                    break;
                case 4:
                    System.out.println("LISTA TODOS OS PRODUTOS");

                    estoque.listaTodosProdutos();
                    break;
                case 5:
                    System.out.println("LISTA PRODUTOS ABAIXO DO MINIMO");

                    if (estoque.listaProdutosAbaixoDoMinimo() == 0)
                        System.out.println("Não há produtos abaixo do minimo.");
                    break;
                default:
                    System.out.println("VOCÊ SAIU!");
                    rodaDeNovo = false;
                    break;
            }
        }
        gravarArq.println(estoque.getProdutos());
        arq.close();
    }
}
