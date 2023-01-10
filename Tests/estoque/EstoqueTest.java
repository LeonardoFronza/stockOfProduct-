package estoque;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EstoqueTest {

    private Estoque estoque;
    private Produto produto1,produto2,produto3;

    @Before
    public void setUp() throws Exception {
        estoque = new Estoque();
        produto1 = new Produto(1,5,8,"Leite");
        produto2 = new Produto(2,10,5,"Morango");
        estoque.insereProduto(produto1);
    }

    @Test
    public void insereProduto() {
        assertEquals(1,estoque.produtos.size());
        estoque.insereProduto(produto2);
        assertEquals(2,estoque.produtos.size());
    }

    @Test
    public void adicionaQtdPordutoEstoque() throws Exception {
        estoque.adicionaQtdPordutoEstoque(1,5);
        assertEquals(10,estoque.produtos.get(0).getQtdProdutos());
    }

    @Test
    public void removeQtdProdutoEstoque() throws Exception {
        estoque.removeQtdProdutoEstoque(1,5);
        assertEquals(5,estoque.produtos.get(0).getQtdProdutos());
    }

    @Test
    public void listaTodosProdutos() {
      assertEquals(1,estoque.listaTodosProdutos());
    }

    @Test
    public void listaProdutosAbaixoDoMinimo() {
        assertEquals(1,estoque.listaProdutosAbaixoDoMinimo());
    }
}