package com.eldorado.calculo.utilidades;

import com.eldorado.calculo.modelo.Pessoa;

public class CalculoImcFerramenta {

    public static final String IMC_S_CLASSIFICACAO_S_OBESIDADE_S = "IMC: %s, Classificação: %s, Nível de Obesidade: %s";
    public String printInformacao(double imc) {
        if(imc < 18.5) {
            return String.format(IMC_S_CLASSIFICACAO_S_OBESIDADE_S, imc, "Magreza", 0);
        } else if(imc < 25) {
            return String.format(IMC_S_CLASSIFICACAO_S_OBESIDADE_S, imc, "Normal", 0);
        } else if(imc < 30) {
            return String.format(IMC_S_CLASSIFICACAO_S_OBESIDADE_S, imc, "Sobrepeso", 1);
        } else if(imc < 40) {
            return String.format(IMC_S_CLASSIFICACAO_S_OBESIDADE_S, imc, "Obesidade", 2);
        } else {
            return String.format(IMC_S_CLASSIFICACAO_S_OBESIDADE_S, imc, "Obesidade Grave", 3);
        }
    }

    public String retornarNivelObesidade(String classificacao) {
        String nivelObesidade;

        switch (classificacao) {
            case "Magreza", "Normal": nivelObesidade = "0"; break;
            case "Sobrepeso": nivelObesidade = "I"; break;
            case "Obesidade": nivelObesidade = "II"; break;
            default: nivelObesidade = "III";
        }

        return nivelObesidade;
    }

    public double calcularImc(Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }
}
