package com.eldorado.calculo.utilidades;

import com.eldorado.calculo.Main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utilidades {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

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

    public static Double lerValorDoubleUsuario(String string) {
        try {
            return Double.parseDouble(string);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor digitado incorreto -> %s", string));
        }
        return Double.MIN_NORMAL;
    }
}
