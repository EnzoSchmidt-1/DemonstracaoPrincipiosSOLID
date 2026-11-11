package DIP;

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
