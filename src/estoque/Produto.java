package estoque;

public class Produto {
    private int codigoProduto,qtdProdutos,qtdMinimaProdutos;
    private String nomeProduto;

    public Produto() {}

    public Produto(int codigoProduto, int qtdProdutos, int qtdMinimaProdutos, String nomeProduto) {
        this.codigoProduto = codigoProduto;
        this.qtdProdutos = qtdProdutos;
        this.qtdMinimaProdutos = qtdMinimaProdutos;
        this.nomeProduto = nomeProduto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQtdProdutos() {
        return qtdProdutos;
    }

    public void setQtdProdutos(int qtdProdutos) {
        this.qtdProdutos = qtdProdutos;
    }

    public int getQtdMinimaProdutos() {
        return qtdMinimaProdutos;
    }

    public void setQtdMinimaProdutos(int qtdMinimaProdutos) {
        this.qtdMinimaProdutos = qtdMinimaProdutos;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigoProduto=" + codigoProduto +
                ", qtdProdutos=" + qtdProdutos +
                ", qtdMinimaProdutos=" + qtdMinimaProdutos +
                ", nomeProduto='" + nomeProduto + '\'' +
                '}';
    }
}
