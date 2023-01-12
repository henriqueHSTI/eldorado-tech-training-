package br.org.eldorado.calculoimc;

public class Main {
    public static void main(String[] args) {

        double height = 1.70;
        double weight = 80.0;

        double imc;

        imc = weight / (height * height);

        System.out.println(imc);
    }
}