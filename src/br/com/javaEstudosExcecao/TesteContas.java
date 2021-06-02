package br.com.javaEstudosExcecao;

public class TesteContas {
    public static void main(String[] args) throws SacaException {
        ContaCorrente novaContaCorrendo = new ContaCorrente(42, 666);
        novaContaCorrendo.deposita(3000);

        ContaPoupanca novaContaPoupanca = new ContaPoupanca(66, 1111);
        novaContaPoupanca.deposita(1000);

        novaContaPoupanca.transfere(500, novaContaCorrendo);

        System.out.println("Saldo br.com.javaEstudosExcecao.Conta Poupança: " + novaContaPoupanca.getSaldo());
        //checando se a transferência foi efetuada com sucesso.
        System.out.println("Saldo br.com.javaEstudosExcecao.Conta Corrente: " + novaContaCorrendo.getSaldo());
    }
}
