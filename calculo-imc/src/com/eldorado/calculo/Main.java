package com.eldorado.calculo;

public class Main {
    public static void main(String[] args) {

        double altura = 1.75;
        double peso = 85.8;
        double imc;

        imc = peso / Math.pow(altura, 2);

        System.out.println(imc);
    }
}