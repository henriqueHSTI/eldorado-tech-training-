package com.eldorado.calculo;

public class Main {

    public static void main(String[] args) {

        double altura = 1.77;
        double peso = 76.0;

        double imc = peso / (altura * altura);

        System.out.println(imc);
    }
}
