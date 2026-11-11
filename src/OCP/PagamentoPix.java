package OCP;
import OCP.FormaPagamento;

public class PagamentoPix implements FormaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de Pix: " + valor);

    }
}