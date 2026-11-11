package SRP;

public class PedidoPrinter {
    public void imprimir(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getIdPedido());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Itens:");
        for (String[] item : pedido.getItens()) {
            System.out.println(" - " + item[0] + " (R$ " + item[1] + ")");
        }
        System.out.println("Total: R$ " + pedido.getTotal());
    }
}