public class TesteGetSet {
    public static void main(String[] args) {
        //estancioando objeto
        Conta conta = new Conta();
        conta.setNumero(100);
        System.out.println(conta.getNumero());

        Cliente cliente = new Cliente();

        cliente.setNome("Douglas Alves");
        conta.setTitular(cliente);

        cliente.setProfissao("Desenvolvedor");

        Cliente clienteDois = new Cliente();

        cliente.setNome("João");
    }
}
