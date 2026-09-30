
package Ex4;

public class Pedido {

    private int id;
    private double valor;
    private EstrategiaPagamento estrategiaPagamento;
    // private Itens[] itens; 
    //....

    public Pedido(int id, double valor, EstrategiaPagamento estrategiaPagamento) {
        this.id = id;
        this.valor = valor;
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public void finalizar() {
        System.out.println("Finalizando pedido #" + id);
        estrategiaPagamento.pagar(valor);
        System.out.println("Pedido finalizado.");
    }
    
    // getter e setters 
}
