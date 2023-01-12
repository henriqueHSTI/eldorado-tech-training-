package com.eldorado.calculo.utilidades;

import com.eldorado.calculo.modelo.Pessoa;

public class CalculaImcFerramenta {

    private static final String IMC_CLASSIFICACAO_NIVEL_LOG_TEMPLATE = "IMC: %s, Classificação: %s, Nível de Obesidade %s";

    public static double calculaImc(final Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

    public static String pegaInformacaoDoImc(final double imc) {

        if (imc < 18.5) {
            return String.format(IMC_CLASSIFICACAO_NIVEL_LOG_TEMPLATE, imc, "Magreza", 0);
        } else if (imc < 25) {
            return String.format(IMC_CLASSIFICACAO_NIVEL_LOG_TEMPLATE, imc, "Normal", 0);
        } else if (imc < 30) {
            return String.format(IMC_CLASSIFICACAO_NIVEL_LOG_TEMPLATE, imc, "Sobrepeso", 1);
        } else if (imc < 40) {
            return String.format(IMC_CLASSIFICACAO_NIVEL_LOG_TEMPLATE, imc, "Obesidade", 2);
        } else {
            return String.format(IMC_CLASSIFICACAO_NIVEL_LOG_TEMPLATE, imc, "Obesidade Grave", 2);
        }
    }
}
