package OCP;
import OCP.FormaPagamento;

public class PagamentoCartao implements FormaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento em Cartão: " + valor);
    }
}
