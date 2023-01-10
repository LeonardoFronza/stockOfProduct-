package main;

import estoque.Estoque;
import estoque.Produto;

public class Main {
    public static void main(String[] args) throws Exception {
        Estoque ce = new Estoque();
        Produto prod = new Produto(1,25,10,"ArthurGay");
        Produto prod2 = new Produto(2,5,10,"Leite");

        ce.insereProduto(prod);
        ce.insereProduto(prod2);
        ce.adicionaQtdPordutoEstoque(1,1);
        ce.removeQtdProdutoEstoque(1,5);

        ce.listaTodosProdutos();
        ce.listaProdutosAbaixoDoMinimo();
    }
}
