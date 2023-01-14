package com.eldorado.calculo.utilidades;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utilidades {

    private static Logger LOGGER = Logger.getLogger(Utilidades.class.getName());

    public static Integer lerIntegerUsuario(final Scanner scanner) {

        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (final Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor digitado incorreto -> %s", scanner.nextLine()));
        }

        return Integer.MIN_VALUE;
    }

    public static Integer lerIntegerUsuario(final String valor) {

        try {
            return Integer.parseInt(valor);
        } catch (final Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor digitado incorreto -> %s", valor));
        }

        return Integer.MIN_VALUE;
    }

    public static Double lerValorDoubleUsuario(final Scanner scanner) {

        try {
            return scanner.nextDouble();
        } catch (final Exception e) {
            LOGGER.log(Level.WARNING, String.format("Valor digitado incorreto -> %s", scanner.nextLine()));
        }

        return Double.MIN_NORMAL;
    }

    public static Double lerValorDoubleUsuario(final String valor) {

        try {
            return Double.parseDouble(valor);
        } catch (final Exception e) {
            LOGGER.log(Level.WARNING, String.format("Valor digitado incorreto -> %s", valor));
        }

        return Double.MIN_NORMAL;
    }
}
