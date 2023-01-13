package com.eldorado.calculo.utilidades;

import com.eldorado.calculo.modelo.Pessoa;

public class CalculoImcFerramenta {
    public static double calculaImc(Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

    public String printInformacao(double imc, Pessoa pessoa) {
        if (imc < 18) {
            return String.format("IMC: %s, Classificação: %s, Nivel de Obesidade %s", imc, "`MAGRESA`", "0");
        } else if (imc < 25) {
            return String.format("IMC: %s, Classificação: %s, Nivel de Obesidade %s", imc, "NORMAL", "0");
        } else if (imc < 30) {
            return String.format("IMC: %s, Classificação: %s, Nivel de Obesidade %s", imc, "SOBREPESO", "I") ;
        } else if (imc < 40) {
            return String.format("IMC: %s, Classificação: %s, Nivel de Obesidade %s", imc, "OBESIDADE", "II");
        } else {
            return String.format("IMC: %s, Classificação: %s, Nivel de Obesidade %s", imc, "OBESIDADE GRAVE", "III");
        }
    }

    public String calculaImc(String classificacao){
        String nivelObesidade = "III";

        switch(classificacao){
            case "MAGRESA":
                nivelObesidade = "0";
                break;
            case "NORMAL":
                nivelObesidade = "0";
                break;
            case "SOBREPESO":
                nivelObesidade = "1";
                break;
            case "OBESIDADE":
                nivelObesidade = "2";
                break;
            default:
                nivelObesidade = "III";

        }
    return nivelObesidade;
    }

}
