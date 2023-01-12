package com.eldorado;

public class Main {
    public static void main(String[] args) {

        double altura = 1.83;
        double peso = 78.0;
        double imc;

        imc = peso / (altura * altura);

        System.out.println(imc);
    }
}