package br.com.javaEstudosExcecao;

public class CriaConta {
    public static void main(String[] args) {

        Conta contaUm = new ContaCorrente(15, 6677);
        contaUm.deposita(1000);

        Conta contaDois = new ContaPoupanca(15, 6327);
        contaDois.deposita(500);


                //validando transferência para a contaUm
//        boolean conseguiuTransferir = contaDois.transfere(100, contaUm);
//        System.out.println(conseguiuTransferir);
//        System.out.println();


        //Cadastrando cliente
        System.out.println();
        Cliente cliente = new Cliente();
        cliente.setNome("Douglas");
        contaUm.setTitular(cliente);
        cliente.setCpf("222.222.222-22");
        contaUm.getTitular().setProfissao("Programador");
        cliente.setEndereco("Porto Alegre");


        System.out.println();
        System.out.println("Titular: " + contaUm.getTitular().getNome());
        System.out.println("Agência: " + contaUm.getAgencia());
        System.out.println("Número da conta: " + contaUm.getNumero());
        System.out.println("Saldo atualizado: " + contaUm.getSaldo());
        System.out.println("Profissão: " + contaUm.getTitular().getProfissao());
        System.out.println("Endereço: " + cliente.getEndereco());

        System.out.println();
        System.out.println("Total de Contas criadas: " + Conta.getTotal());

    }
}
