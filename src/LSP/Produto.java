package LSP;

public class Produto {
    public Produto() {

    }
    private String nome;
    private double preco;

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getDescricao(){
        return "Esse é um produto basico";
    }
}
