package com.eldorado.calculo.utils;

import com.eldorado.calculo.start.StartCalcImc;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Util {
    static final Logger logger = Logger.getLogger(Util.class.getName());
    public static double readUserValue(Scanner scanner){
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            logger.log(Level.SEVERE, String.format("Invalid type value -> %s", scanner.nextLine()));
        }
        return Double.MIN_VALUE;
    }

    public static int readIntegerValue(Scanner scanner){
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            logger.log(Level.SEVERE, String.format("Invalid type value -> %s", scanner.nextLine()));
        }
        return Integer.MIN_VALUE;
    }
}
