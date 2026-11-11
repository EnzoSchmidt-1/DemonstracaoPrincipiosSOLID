package LSP;

public class Produto {
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    private String nome;
    private double preco;

    public double getPreco(){
        return preco;
    }

    public String getDescricao(){
        return "Esse é um produto basico";
    }
}
