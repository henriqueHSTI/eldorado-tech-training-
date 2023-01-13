package com.eldorado.calculo.utils;

import com.eldorado.calculo.model.Pessoa;

public class CalculoImcUtils {

    public static final String MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S = "IMC = %s | Classificação: %s";

    public String printarClassificacaoComBaseNoImc(double imc) {
        if (imc <= 18.5) {
            return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, "Magreza");
        } else if (imc < 25) {
            return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, "Normal");
        } else if (imc < 30) {
            return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, "Sobrepeso");
        } else if (imc < 40) {
            return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, "Obesidade");
        } else {
            return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, "Obesidade Grave");
        }
    }

    public double calcularImc(Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }
}
