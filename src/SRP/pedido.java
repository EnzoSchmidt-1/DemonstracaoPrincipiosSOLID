package SRP;

public class pedido {
    private int idPedido;

    private int cliente;

    private String[][] itens;

    private double total;



    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }


    public String[][] getItens() {
        return itens;
    }
    public void setItens(String[][] itens) {
        this.itens = itens;
    }


    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }


    public int getCliente() {
        return cliente;
    }
    public void setCliente(int cliente) {
        this.cliente = cliente;
    }



}