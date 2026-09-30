
package Ex4;

public class Main {
    public static void main(String[] args) {
        double valor = 150;
        EstrategiaPagamento pagamento;
        String pag = "PIX";
       
        if(pag.equals("PIX")) {
            pagamento = new PagamentoPix();
        } else if(pag.equals("cartao")) {
            pagamento = new PagamentoCartao();
        } else {
             pagamento = new PagamentoPix();
        }
        
        Pedido pedido = new Pedido(1, 150.00, pagamento);
        pedido.finalizar();
        
        
    }
}
