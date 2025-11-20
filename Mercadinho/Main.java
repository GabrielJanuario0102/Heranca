import Cliente.ClienteRegular;
import Cliente.ClienteVip;
import Cliente.ClienteVipOuro;

public class Main {
    public static void main(String[] args) {

        Mercadinho m1 = new Mercadinho(5);

        ClienteRegular b1 = new ClienteRegular("Manga", 100);
        ClienteVip b2 = new ClienteVip("Abacaxi", 100, "123456789");
        ClienteVipOuro b3 = new ClienteVipOuro("Nara", 100, "987654321", "Rua do Bagaço");

        m1.adicionarCliente(b1);
        System.out.println("===========================");
        m1.adicionarCliente(b2);
        System.out.println("===========================");
        m1.adicionarCliente(b3);
        System.out.println("===========================");

        m1.imprimirClientes();
        System.out.println("TOTAL: " + m1.calcularTotal());
        

    }
}