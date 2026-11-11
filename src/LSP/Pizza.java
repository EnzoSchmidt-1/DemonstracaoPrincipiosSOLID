package LSP;

public class Pizza extends Produto{
    private int quantFatias;

    public Pizza(String nome, double preco, int quantFatias) {
        super(nome, preco);
        this.quantFatias = quantFatias;
    }
}
