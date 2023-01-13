package com.eldorado.calculo;

import com.eldorado.calculo.modelo.Pessoa;
import com.eldorado.calculo.utilidades.CalculoImcFerramenta;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        var calculaImcFerramenta = new CalculoImcFerramenta();

        for (int i = 0; i < 3; i++) {
            var pessoa = new Pessoa();

            System.out.println("Digite seu Nome");
            pessoa.setNome(scanner.nextLine());

            System.out.println("Digite sua altura");
            pessoa.setAltura(lerValorDoubleUsuario(scanner));

            System.out.println("Digite seu peso");
            pessoa.setPeso(lerValorDoubleUsuario(scanner));

            System.out.println("Digite sua Idade");
            pessoa.setIdade(lerIntegerUsuario(scanner));

            double imc = calculaImcFerramenta.calculaImc(pessoa);

            LOGGER.log(Level.INFO, pessoa.toString());

            calculaImcFerramenta.printInformacao(imc);

            LOGGER.info(calculaImcFerramenta.retornaNivelObesidade("AAAA"));

        }
        scanner.close();
    }

    private static Integer lerIntegerUsuario(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor digitado incorreto -> %s", scanner.nextLine()));
        }
        return Integer.MIN_VALUE;
    }

    private static Double lerValorDoubleUsuario(Scanner scanner) {
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor digitado incorreto -> %s", scanner.nextLine()));
        }
        return Double.MIN_NORMAL;
    }


}