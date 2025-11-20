package Cliente;

public class ClienteRegular extends Cliente {
    
    public ClienteRegular(String nome, double valorDaCompra ) {
        super(nome, valorDaCompra);
    }

    public double calcularPagamento() {
        return getValorDaCompra();
    }

    public String toString() {
        return String.format("Nome: %s, Valor da Compra: %.2f", this.getNome(), this.getValorDaCompra());
    }
}
