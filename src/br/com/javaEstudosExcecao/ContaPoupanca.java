package br.com.javaEstudosExcecao;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }
    @Override //reescrevendo método saca
    public void saca(double valor) throws SacaException {
        double valorASacar = valor + 1.00;
        super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
