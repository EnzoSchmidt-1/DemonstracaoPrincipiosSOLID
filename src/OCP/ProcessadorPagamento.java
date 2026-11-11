package OCP;

public class ProcessadorPagamento {
    public void pagar(FormaPagamento formaPagamento, double valor){
        formaPagamento.pagar(valor);
    }
}