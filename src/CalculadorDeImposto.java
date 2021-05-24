public class CalculadorDeImposto {

    private double totalImposto;

    //tudo que é assinado pelo tributavel pode ser usado nesse método.
    public void registra(Tributavel tributavel) {
        double valor = tributavel.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
