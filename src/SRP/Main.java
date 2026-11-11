package SRP;

/**
 * Invez de criar uma so classe pedido que possui
 * todas as funções necessarios o projeto foi dividido
 * em 3 classes diferentes
 */

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setCliente(1);
        pedido.setCliente(2);

        PedidoPrinter pedidoPrinter = new PedidoPrinter();
        pedidoPrinter.imprimir(pedido);

        PedidoRepository pedidoRepository = new PedidoRepository();
        pedidoRepository.salvar(pedido);

    }
}
