package org.eldorado.calculo;


public class Main {
    public static void main(String[] args) {

        double altura = 1.75;
        double peso = 85.8;

        double imc;

        imc = peso / (altura * altura);

        System.out.println(imc);

    }
}