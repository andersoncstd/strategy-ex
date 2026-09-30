package Ex4;

public class PagamentoCartao implements EstrategiaPagamento {
    @Override 
    public void pagar(double valor) {
        // Lógica para fazer o pagamento no cartao
        System.out.println("Pagamento via cartão de crédito realizado!");
    }
}
