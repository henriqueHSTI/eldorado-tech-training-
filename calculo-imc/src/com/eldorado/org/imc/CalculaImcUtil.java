package com.eldorado.org.imc;

public class CalculaImcUtil {

    public static String printInformacao(double imc) {

        if (imc < 18.5){
            return String.format("Magreza nivel 0");
        } else if (imc <25) {
            return String.format("Normal nivel 0 ");
        } else if (imc < 30) {
            return String.format("Sobrpesso  nivel I");
        } else if (imc <40) {
            return String.format("Obesidade nivel II");
        }else {
            return String.format("Obesidade nivel III");
        }

    }

    public static double calcula(double altura, double peso){
        return peso / (altura * altura);

    }
}
