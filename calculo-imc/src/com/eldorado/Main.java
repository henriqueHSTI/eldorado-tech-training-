package com.eldorado;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        double altura = 1.83;
        double peso = 78.0;
        double imc;

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            LOGGER.log(Level.INFO, String.format("IMC: %s, Classificacao: %s, Nível de Obesidade: %s", imc, "Magreza", "0"));
        } else if (imc < 25) {
            LOGGER.log(Level.INFO, String.format("IMC: %s, Classificacao: %s, Nível de Obesidade: %s", imc, "Normal", "0"));
        } else if (imc < 30) {
            LOGGER.log(Level.INFO, String.format("IMC: %s, Classificacao: %s, Nível de Obesidade: %s", imc, "Sobrepeso", "I"));
        } else if (imc < 40) {
            LOGGER.log(Level.INFO, String.format("IMC: %s, Classificacao: %s, Nível de Obesidade: %s", imc, "Obesidade", "II"));
        } else {
            LOGGER.log(Level.INFO, String.format("IMC: %s, Classificacao: %s, Nível de Obesidade: %s", imc, "Obesidade grave", "III"));
        }
    }
}