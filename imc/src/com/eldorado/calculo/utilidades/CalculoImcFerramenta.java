package com.eldorado.calculo.utilidades;

import com.eldorado.calculo.modelo.Pessoa;

public class CalculoImcFerramenta {

    public static final String MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S = "MC: %s\n Classificação: %s\n Nivel de Obesidade: %s";

    public String printInformacao(double imc) {

        if (imc < 18.5) {
            return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Magresa", "0");
        } else if (imc < 25) {
            return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Normal", "0");
        } else if (imc < 30) {
            return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Sobrepeso", "I");
        } else if (imc < 40) {
            return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Obesidade ", "II");
        } else {
            return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Obesidade Grave", "III");
        }
    }

    public String retornaNivelObesidade(String classificacao) {

        String nivelObsidade;

        switch (classificacao) {
            case "Magresa":
                nivelObsidade = "0";
                break;
            case "Normal":
                nivelObsidade = "0";
                break;
            case "Sobrepeso":
                nivelObsidade = "I";
                break;
            case "Obesidade":
                nivelObsidade = "II";
                break;

            default:
                nivelObsidade = "III";
        }

        return nivelObsidade;

    }

    public double calculaImc(Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

}
