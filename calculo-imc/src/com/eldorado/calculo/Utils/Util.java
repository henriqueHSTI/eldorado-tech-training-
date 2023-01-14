package com.eldorado.calculo.Utils;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Util {
    private static final Logger LOGGER = Logger.getLogger(Util.class.getName());

    public static String calculaClassificacaoImc(double imc) {

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

    public static double calculaImc(double altura, double peso){
        return  peso / (altura * altura);
    }

    public static Integer lerIntegerUsuario(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor digitado incorreto -> %s", scanner.nextLine()));
        }
        return Integer.MIN_VALUE;
    }

    public static Double lerValorDoubleUsuario(Scanner scanner) {
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor digitado incorreto -> %s", scanner.nextLine()));
        }
        return Double.MIN_NORMAL;
    }
}
