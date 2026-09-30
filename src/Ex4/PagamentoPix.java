
package Ex4;

public class PagamentoPix implements EstrategiaPagamento {
    @Override 
    public void pagar(double valor) {
        // Lógica para fazer o pagamento no Pix
        System.out.println("Pagamento via PIX realizado!");
    }
}
