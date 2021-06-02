package br.com.javaEstudosExcecao;

import br.com.interfaceTributavel.Tributavel;

public class SeguroDeVida  implements Tributavel {

    @Override
    public double getValorImposto() {
        return 50;
    }
}
