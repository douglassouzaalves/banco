public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }
    @Override //reescrevendo método saca
    public boolean saca(double valor) {
        double valorASacar = valor + 1.00;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
