package DIP;

public class SistemaDelivery {
    private Notificador notificador;

    public SistemaDelivery(Notificador notificador){
        this.notificador = notificador;
    }

    public void finalizarPedido(){
        System.out.println("Pedido finalizado!");
        notificador.enviar("Seu pedido foi finalizado!");
    }
}
