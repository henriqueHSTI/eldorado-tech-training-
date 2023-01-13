package com.eldorado.calculo.Utils;

public class Util {

    private static String calculaClassificacaoImc(double imc) {

        final String CLASSIFICACAO = "IMC: %s, Classificacao: %s, Nível de Obesidade: %s";

        if (imc < 18.5){
            return String.format(CLASSIFICACAO, imc, "Magreza", 0);
        } else if (imc <25) {
            return String.format(CLASSIFICACAO, imc, "Normal", 0);
        } else if (imc < 30) {
            return String.format(CLASSIFICACAO, imc, "Sobrpesso", 1);
        } else if (imc <40) {
            return String.format(CLASSIFICACAO, imc, "Obesidade", 2);
        }else {
            return String.format(CLASSIFICACAO, imc, "Obesidade", 3);
        }
    }

    public static String calculaImc(double altura, double peso){
        double imc = peso / (altura * altura);

        return calculaClassificacaoImc(imc);
    }
}
