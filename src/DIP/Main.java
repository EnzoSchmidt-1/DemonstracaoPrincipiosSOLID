package DIP;

/**
 * O sistema de delivery não cria
 * nem interaje com as outras notificadoras
 * ele depende somente da interface Notificador
 * dessa forma a Main decide qual das formas utilizar
 */

public class Main {
    public static void main(String[] args) {
        SistemaDelivery Email = new SistemaDelivery(new EmailNotificador());
        Email.finalizarPedido();

        SistemaDelivery Sms = new SistemaDelivery(new SmsNotificador());
        Sms.finalizarPedido();

        SistemaDelivery Whats = new SistemaDelivery(new WhatsAppNotificador());
        Whats.finalizarPedido();
    }
}
