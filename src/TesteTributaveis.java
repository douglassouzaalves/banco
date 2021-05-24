
public class TesteTributaveis {
    public static void main(String[] args) {

        ContaCorrente novaContaCorrente = new ContaCorrente(44, 1000);
        novaContaCorrente.deposita(100.0);

        SeguroDeVida seguroVida = new SeguroDeVida();

        CalculadorDeImposto calcula = new CalculadorDeImposto();
        calcula.registra(novaContaCorrente);
        calcula.registra(seguroVida);

        System.out.println(calcula.getTotalImposto());


    }
}

