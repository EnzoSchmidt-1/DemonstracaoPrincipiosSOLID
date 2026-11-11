package ISP;

import DIP.Notificador;

public class ServicoNotificacao implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Notificação enviada: " + mensagem);
    }
}
