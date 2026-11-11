package ISP;

public class ServicoRelatorio implements GeradorRelatorio{
    @Override
    public void gerarRelatorio() {
        System.out.println("Relatorio de Vendas gerado");
    }
}
