package ISP;

public class ServicoEntregas implements GerenciadorEntregas{

    @Override
    public void iniciarEntrega(int idPedido) {
        System.out.println("Entrega: " + idPedido + " | Iniciado");
    }

    @Override
    public void finalizarEntrega(int idPedido) {
        System.out.println("Entrega: " + idPedido +" | Finalizada");
    }
}
