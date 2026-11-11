package OCP;

/*
 * Princípio Aberto/Fechado:
 * o código deve estar aberto para extensão e fechado para modificação.
 * Para criar uma nova forma de pagamento (Pix, Cartão, Dinheiro...)
 * basta criar uma classe que implemente FormaPagamento,
 * sem alterar nenhuma classe que já existe.
 */

public interface FormaPagamento {
    public void pagar(double valor);
}
