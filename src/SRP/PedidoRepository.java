package SRP;

import java.util.ArrayList;
import java.util.List;

// Esta classe só cuida de salvar e buscar pedidos.

public class PedidoRepository {
    private List<Pedido> pedidos = new ArrayList<>();

    public void salvar(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido " + pedido.getIdPedido() + " salvo!");
    }

    public Pedido buscarPorId(int id) {
        for (Pedido p : pedidos) {
            if (p.getIdPedido() == id) {
                return p;
            }
        }
        return null;
    }
}