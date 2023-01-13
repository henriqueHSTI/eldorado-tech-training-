package org.eldorado.calculo;


import org.eldorado.calculo.models.Person;
import org.eldorado.calculo.utils.CalculatorIMC;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        var imcTool = new CalculatorIMC();
        var person = new Person();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your name: ");
        person.setName(scanner.nextLine());

    }
}