package com.eldorado.org;

import com.eldorado.org.imc.CalculaImcUtil;
import com.eldorado.org.modelo.Pessoa;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger (Main.class.getCanonicalName());



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();



        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite seu peso");
        double peso = entrada.nextDouble();

        System.out.println("Digite seu sexo");
        char sexo = entrada.next().charAt(0);


        double resultadoImc = CalculaImcUtil.calcula(altura, peso);
        System.out.println("Seu Imc é: " + resultadoImc);

        String clasificacao = CalculaImcUtil.printInformacao(resultadoImc);
        System.out.println("Sua clasificação é: " + clasificacao);

        entrada.close();
    }



}
