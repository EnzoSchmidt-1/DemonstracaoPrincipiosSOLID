package DIP;

public class WhatsAppNotificador implements Notificador{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem de WhatsApp: " + mensagem);
    }
}
