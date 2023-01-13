package com.eldorado.imc;

import com.eldorado.model.Pessoa;

public class CalculoIMC {

    public static final String CLASSIFICACAO_OBESIDADE = "IMC: %s, Classificacao: %s, Nível de Obesidade: %s";

    public String imprimeClassificacao(Double imc) {

        if (imc < 18.5) {
            return String.format(CLASSIFICACAO_OBESIDADE, imc, "Magreza", "0");
        } else if (imc < 25) {
            return String.format(CLASSIFICACAO_OBESIDADE, imc, "Normal", "0");
        } else if (imc < 30) {
            return String.format(CLASSIFICACAO_OBESIDADE, imc, "Sobrepeso", "I");
        } else if (imc < 40) {
            return String.format(CLASSIFICACAO_OBESIDADE, imc, "Obesidade", "II");
        } else {
            return String.format(CLASSIFICACAO_OBESIDADE, imc, "Obesidade Grave", "III");
        }
    }

    public String defineNivelDeObesidade(String classificacao) {

        return switch (classificacao) {
            case "Magresa", "Normal" -> "0";
            case "Sobrepeso" -> "I";
            case "Obesidade" -> "II";
            default -> "III";
        };
    }

    public double calcula(Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }
}
