package com.eldorado.calculo;

import com.eldorado.calculo.modelo.Pessoa;
import com.eldorado.calculo.utilidades.CalculoImcFerramenta;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        var calculaImcFerramenta = new CalculoImcFerramenta();
        var pessoa = new Pessoa();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Nome");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Digite sua altura");
        pessoa.setAltura(scanner.nextDouble());

        System.out.println("Digite seu peso");
        pessoa.setPeso(scanner.nextDouble());

        System.out.println("Digite susa Idade");
        pessoa.setIdade(scanner.nextInt());


        double imc = calculaImcFerramenta.calculaImc(pessoa);

        LOGGER.log(Level.INFO, pessoa.toString());

        calculaImcFerramenta.printInformacao(imc);

        LOGGER.info(calculaImcFerramenta.retornaNivelObesidade("AAAA"));
    }


}