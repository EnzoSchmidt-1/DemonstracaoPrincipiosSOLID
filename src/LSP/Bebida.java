package LSP;

public class Bebida extends Produto {
    private int volumeMls;

    public Bebida(String nome, double preco, int volumeMls) {
        super(nome, preco);
        this.volumeMls = volumeMls;
    }
}
