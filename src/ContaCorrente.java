public class ContaCorrente  extends Conta {

    public ContaCorrente(int agencia, int numero) {

        super(agencia, numero);//chamando o construtor da classe mãe
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
