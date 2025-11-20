import Cliente.Cliente;

public class Mercadinho {
    private Cliente[] clientes;

    public Mercadinho(int tamanhoListaClientes) {
        this.clientes = new Cliente[tamanhoListaClientes];
    }

    public void adicionarCliente(Cliente cliente) {
        for(int i = 0;i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                System.out.println("Cliente Adicionado.");
                return;
            }
        }
        System.out.println("Lista cheia.");
        return;
    }

    public double calcularTotal() {
        double valorTotal = 0;
        for (Cliente cliente : clientes) {
            if(cliente != null) {
            valorTotal += cliente.calcularPagamento();
            }
        }
        return valorTotal;
    }
    

    public void imprimirClientes() {
        for (Cliente cliente : clientes) {
            if (cliente != null) {
            System.out.println(cliente.toString());
            }
        }
    }
}
