package com.eldorado.calculoimc;

public class CalculoImc {
    public static void main(String[] args) {
        double peso = 65.6;
        double altura = 1.7;
        double imc;

        imc = peso / (altura * altura);

        System.out.printf("O seu imc é : %f",imc);
    }
}
