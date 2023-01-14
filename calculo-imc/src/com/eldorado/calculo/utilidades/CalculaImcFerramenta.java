package com.eldorado.calculo.utilidades;

import com.eldorado.calculo.modelo.Pessoa;

public class CalculaImcFerramenta {

    private static final String IMC_CLASSIFICACAO_NIVEL_LOG_TEMPLATE = "IMC: %s, Classificação: %s, Nível de Obesidade %s";

    public static double calculaImc(final Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

    public static String pegaInformacoes(final double imc) {

        if (imc < 18.5) {
            return String.format(IMC_CLASSIFICACAO_NIVEL_LOG_TEMPLATE, imc, "Magreza", "0");
        } else if (imc < 25) {
            return String.format(IMC_CLASSIFICACAO_NIVEL_LOG_TEMPLATE, imc, "Normal", "0");
        } else if (imc < 30) {
            return String.format(IMC_CLASSIFICACAO_NIVEL_LOG_TEMPLATE, imc, "Sobrepeso", "I");
        } else if (imc < 40) {
            return String.format(IMC_CLASSIFICACAO_NIVEL_LOG_TEMPLATE, imc, "Obesidade", "II");
        } else {
            return String.format(IMC_CLASSIFICACAO_NIVEL_LOG_TEMPLATE, imc, "Obesidade Grave", "III");
        }
    }

    public String retornaNivelObesidade(final String classificacao) {

        String nivelObesidade;

        switch (classificacao) {
            case "Magreza", "Normal" -> nivelObesidade = "0";
            case "Sobrepeso" -> nivelObesidade = "I";
            case "Obesidade" -> nivelObesidade = "II";
            case "Obesiddade Grave" -> nivelObesidade = "III";
            default -> throw new IllegalArgumentException(String.format("Classificação inválida: %s", classificacao));
        }

        return nivelObesidade;
    }
}
