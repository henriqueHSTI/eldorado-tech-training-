package com.imc;

public class Imc {
    public static void main(String[] args) {

        double altura = 1.68;
        double peso = 60;

        double imc;

        imc = peso / (altura * altura);

        System.out.println(imc);
    }
}