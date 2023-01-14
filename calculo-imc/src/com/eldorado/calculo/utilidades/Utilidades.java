package com.eldorado.calculo.utilidades;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utilidades {

    private static final Logger LOGGER = Logger.getLogger(Utilidades.class.getName());

    public static Integer lerIntegerUsuario(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor digitado incorreto -> %s", scanner.nextLine()));
        }
        return Integer.MIN_VALUE;
    }
    public static Integer lerIntegerUsuario(String valor) {
        try {
            return Integer.parseInt(valor);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor digitado incorreto -> %s", valor));
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

    public static Double lerValorDoubleUsuario(String valor) {
        try {
            return Double.parseDouble(valor);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor digitado incorreto -> %s", valor));
        }
        return Double.MIN_NORMAL;
    }
}
