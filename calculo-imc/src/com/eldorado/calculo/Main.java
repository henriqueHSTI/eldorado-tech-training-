package com.eldorado.calculo;

public class Main {
    public static void main(String[] args) {
        double peso = 80.00;
        double altura = 1.70;

        double imc;

        imc = peso / (altura * altura);

        System.out.println(imc);
    }


}