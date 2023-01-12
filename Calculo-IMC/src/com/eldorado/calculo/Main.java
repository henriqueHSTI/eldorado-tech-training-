package com.eldorado.calculo;

public class Main {
    public static void main(String[] args) {
        double altura = 1.95;
        double peso = 138.5;
        double imc;

        imc = peso / (altura * altura);

        System.out.println(imc);
    }
}