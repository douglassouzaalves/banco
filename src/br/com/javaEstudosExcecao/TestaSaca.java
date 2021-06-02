package br.com.javaEstudosExcecao;

public class TestaSaca {
    public static void main(String[] args) {
        Conta novaConta = new ContaPoupanca(42, 7777);

        novaConta.deposita(200);

        try {
            novaConta.saca(200);
        } catch (SacaException ex) { //tratamento
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println(novaConta.saldo);
    }
}
