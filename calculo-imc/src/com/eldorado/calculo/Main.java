package com.eldorado.calculo;

import com.eldorado.calculo.Utils.Util;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean continuaCalculo = true;

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Digite seu peso");
            double peso = scanner.nextDouble();

            System.out.println("Digite seu sexo");
            char sexo = scanner.next().charAt(0);

            String resultadoImc = Util.calculaImc(altura, peso);
            System.out.println(resultadoImc);

        scanner.close();
    }

}