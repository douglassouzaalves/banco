public class CriaConta {
    public static void main(String[] args) {

        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        cliente.setNome("Douglas");
        cliente.setProfissao("Estágiario em Desenvolvimento");
        cliente.setCpf("222.222.222-22");

        conta.deposita(1000);
        System.out.println(conta.getSaldo());
        System.out.println(cliente.getNome());


    }
}
