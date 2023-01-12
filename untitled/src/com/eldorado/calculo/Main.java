package com.eldorado.calculo;

public class Main {
    public static void main(String []args) {
        double altura = 1.90;
        double peso = 130.0;

        double IMC;

        IMC = peso / (altura * altura);
        System.out.println(IMC);
    }
}
