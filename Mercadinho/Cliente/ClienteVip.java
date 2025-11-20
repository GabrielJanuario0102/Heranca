package Cliente;

public class ClienteVip extends Cliente{
    private String numeroDoCartao;

    public ClienteVip(String nome, double valorDaCompra, String numeroDoCartao) {
        super(nome, valorDaCompra);
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getNumeroDoCartao() {
        return this.numeroDoCartao;
    }
    
    public double calcularPagamento() {
        return getValorDaCompra()*90/100;
    }

    public String toString() {
        return String.format("Nome: %s, Valor da Compra: %.2f, Valor Com Desconto: %.2f Numero Cartao: %s",this.getNome(), this.getValorDaCompra(),this.calcularPagamento(), this.getNumeroDoCartao());
    }
}