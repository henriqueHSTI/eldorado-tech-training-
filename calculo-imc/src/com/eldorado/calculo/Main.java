package com.eldorado.calculo;

import com.eldorado.calculo.modelo.Pessoa;
import com.eldorado.calculo.utilidades.CalculoImcFerramenta;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        var pessoa = new Pessoa();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura:");
        pessoa.setAltura(Double.parseDouble(scanner.nextLine()));
        System.out.print("Digite a Genero:");
        char auxGenero = (scanner.next(".").charAt(0));
        System.out.print("Digite a Peso:");
        double auxPeso = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite a Idade:");
        short auxIdade = Short.parseShort(scanner.nextLine());
        System.out.print("Digite a Nome:");
        var auxNome = (scanner.nextLine());

        var calculaImcFerramenta = new CalculoImcFerramenta();

        pessoa.setGenero(auxGenero);
        pessoa.setPeso(auxPeso);
        pessoa.setIdade(auxIdade);
        pessoa.setNome(auxNome);
        double imc = calculaImcFerramenta.calculaImc(pessoa);
        LOGGER.log(Level.INFO, pessoa.toString());

        calculaImcFerramenta.printInformacao(imc, pessoa);
    }


}