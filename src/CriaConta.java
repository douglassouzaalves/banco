public class CriaConta {
    public static void main(String[] args) {

        Conta contaCliente = new Conta(15, 6677);
        contaCliente.deposita(1000);


        Conta contaDois = new Conta(15, 6327);
        contaDois.deposita(500);



        //transferindo para outra conta
        boolean conseguiuTransferir = contaDois.transfere(100, contaCliente);
        System.out.println(conseguiuTransferir);
        System.out.println();


        //Cadastrando cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Douglas");
        contaCliente.setTitular(cliente);
        cliente.setCpf("222.222.222-22");

        contaCliente.getTitular().setProfissao("Programador");


        //mesmo resultado do código a cima
        Cliente titularDaConta = contaCliente.getTitular();
        titularDaConta.setProfissao("Programador");

        System.out.println("Titular: " + contaCliente.getTitular().getNome());
        System.out.println("Agência: " + contaCliente.getAgencia());
        System.out.println("Número da conta: " + contaCliente.getNumero());
        System.out.println("Saldo atualizado: " + contaCliente.getSaldo());

        System.out.println("Profissão: " + contaCliente.getTitular().getProfissao());

        System.out.println("Total de Contas criadas: " + Conta.getTotal());

    }
}
