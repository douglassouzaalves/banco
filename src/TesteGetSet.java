public class TesteGetSet {
    public static void main(String[] args) {
        //estancioando objeto
        Conta conta = new Conta(13, 6727);

        Cliente cliente = new Cliente();

        cliente.setNome("Fulano");

        conta.setAgencia(-5);

    }
}
