package ISP;

public class ServicoPedidos implements  GerenciadorPedidos{
    @Override
    public void criarPedido(String pedido) {
        System.out.println("Pedido: " + pedido + " | Criado");
    }

    @Override
    public void cancelarPedido(int id) {
        System.out.println("Pedido: " + id + " | Cancelado");
    }
}
