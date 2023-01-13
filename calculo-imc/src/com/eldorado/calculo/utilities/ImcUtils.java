package com.eldorado.calculo.utilities;

import com.eldorado.calculo.model.Person;

public class ImcUtils {

    public static final String MC_C_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S = "MC: %s\\n Classificação: %s\\n Nivel de Obesidade: %s";

    public String printInformacao(double imc) {

        if (imc < 18.5) {
            return String.format(MC_C_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Magresa", "0");
        } else if (imc < 25) {
            return String.format(MC_C_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Normal", "0");
        } else if (imc < 30) {
            return String.format(MC_C_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Sobrepeso", "I");
        } else if (imc < 40) {
            return String.format(MC_C_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Obesidade ", "II");
        } else {
            return String.format(MC_C_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Obesidade Grave", "III");
        }
    }
    public String retornaNivelObesidade(String classificao) {
        String nivelObsidade;

        switch (classificao) {
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

    public double calculaImc(Person person) {
        return person.getWeight() / (person.getHeight() * person.getHeight());
    }

}
