package estoque;

import java.util.ArrayList;

public class Estoque {

    ArrayList<Produto> produtos = new ArrayList<>();

    public boolean insereProduto(Produto novoProduto) {
        for (Produto produto : produtos) {
            if(novoProduto.getCodigoProduto() == produto.getCodigoProduto()) {
                return false;
            }
        }
        return produtos.add(novoProduto);
    }

    public boolean adicionaQtdPordutoEstoque(int codigoProduto, int qtdAadicionar) throws Exception {
        if(qtdAadicionar < 0)
            throw new Exception("Nao eh permitido numeros negativos nessa operação!");

        for (Produto produto : produtos) {
            boolean validaProduto = produtos.get(produtos.indexOf(produto)).getCodigoProduto() == codigoProduto;
            boolean valida = qtdAadicionar > 0;

            if(validaProduto && valida) {
                produtos.get(produtos.indexOf(produto)).setQtdProdutos(produto.getQtdProdutos() + qtdAadicionar);
                return true;
            }
        }
        return false;
    }

    public boolean removeQtdProdutoEstoque(int codigoProduto, int qtdARemover) throws Exception {
        if(qtdARemover < 0)
            throw new Exception("Nao eh permitido numeros negativos nessa operação!");

        for (Produto produto : produtos) {

            boolean validaProduto = produtos.get(produtos.indexOf(produto)).getCodigoProduto() == codigoProduto;
            boolean valida = produto.getQtdProdutos() - qtdARemover > 0;

            if(validaProduto && valida) {
                produtos.get(produtos.indexOf(produto)).setQtdProdutos(produto.getQtdProdutos() - qtdARemover);
                return true;
            }
        }
        return false;
    }

    public int listaTodosProdutos() {
        int count = 0;
        for(Produto produto : produtos) {
            System.out.println(produto.toString());
            count++;
        }
        return count;
    }

    public int listaProdutosAbaixoDoMinimo() {
        int count = 0;

        for(Produto produto : produtos) {
            if(produto.getQtdMinimaProdutos() > produto.getQtdProdutos()) {
                System.out.println(produto.toString());
                count++;
            }
        }
        return count;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
