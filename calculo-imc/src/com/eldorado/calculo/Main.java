package com.eldorado.calculo;

public class Main {
    public static void main(String[] args) {

        double altura = 1.63;
        double peso = 60;

        double imc;

        imc = peso/ (altura * altura);

        System.out.println(imc);
    }
}