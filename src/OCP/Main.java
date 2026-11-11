package OCP;


public class Main {
    public static void main(String[] args) {
        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.pagar(10);

        PagamentoDinheiro pagamentoDinheiro = new PagamentoDinheiro();
        pagamentoDinheiro.pagar(10);

        PagamentoPix pagamentoPix = new PagamentoPix();
        pagamentoPix.pagar(10);
    }
}
