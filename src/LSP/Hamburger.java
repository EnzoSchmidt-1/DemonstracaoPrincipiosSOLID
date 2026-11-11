package LSP;

public class Hamburger extends Produto{
    private String adicional;


    public Hamburger(String nome, double preco, String adicional) {
        super(nome, preco);
        this.adicional = adicional;
    }
}
