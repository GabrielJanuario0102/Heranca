package Cliente;

public class ClienteVipOuro extends ClienteVip{
    private String endereco;

    public ClienteVipOuro(String nome, double valorDaCompra, String numeroCartao, String endereco) {
        super(nome, valorDaCompra, numeroCartao);
        this.endereco = endereco;
    }

    public double calcularPagamento() {
        return getValorDaCompra()*85/100;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String toString() {
        return String.format("Nome: %s, Valor da Compra: %.2f, Valor com Desconto: %.2f, Numero Cartao: %s, Endereço: %s",this.getNome(), this.getValorDaCompra(), this.calcularPagamento() ,this.getNumeroDoCartao(), this.getEndereco());
    }
}
