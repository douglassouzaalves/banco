public class ContaCorrente  extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);//chamando o construtor da classe mãe
    }

    @Override //reescrevendo método saca
    public boolean saca(double valor) {
        return super.saca(valor);
    }
}
