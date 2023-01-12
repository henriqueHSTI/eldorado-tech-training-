package com.eldorado.calculo;

public class Main {
    public static void main(String[] args) {
        double height = 1.91;
        double weight = 110;

        double imc = weight / (height * height);

        System.out.println(imc);
    }
}