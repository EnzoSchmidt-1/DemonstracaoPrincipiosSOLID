package ISP;

public class ServicoPedidos implements  GerenciadorPedidos{
    @Override
    public void criarPedido(int pedido) {
        System.out.println("Pedido: " + pedido + " | Criado");
    }

    @Override
    public void cancelarPedido(int id) {
        System.out.println("Pedido: " + id + " | Cancelado");
    }
}
