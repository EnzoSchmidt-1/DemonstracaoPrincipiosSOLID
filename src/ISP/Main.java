package ISP;

/**
 * Em vez de utilizar somente uma interface gigante
 * invez disso existem quatro pequenas interfaces
 * cada uma sendo implementada por uma classe,
 * somente com o necessario para cada sem gastos desnecessarias
 */

public class Main {
    public static void main(String[] args) {
        ServicoEntregas servicoEntregas = new ServicoEntregas();
        servicoEntregas.iniciarEntrega(1);

        ServicoNotificacao servicoNotificacao = new ServicoNotificacao();
        servicoNotificacao.enviar("Mensagem enviada");

        ServicoPedidos servicoPedidos = new ServicoPedidos();
        servicoPedidos.criarPedido(2);

        ServicoRelatorio servicoRelatorio = new ServicoRelatorio();
        servicoRelatorio.gerarRelatorio();

        servicoEntregas.finalizarEntrega(1);
        servicoPedidos.cancelarPedido(2);
    }
}
