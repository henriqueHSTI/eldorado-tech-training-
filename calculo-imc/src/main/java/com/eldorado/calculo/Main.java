package com.eldorado.calculo;

import com.eldorado.calculo.model.Pessoa;
import com.eldorado.calculo.utils.CalculoImcUtils;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite sua altura: ");
        pessoa.setAltura(lerValorDoubleUsuario(scanner));

        System.out.println("Digite seu peso: ");
        pessoa.setPeso(lerValorDoubleUsuario(scanner));

        scanner.nextLine();

        System.out.println("Digite seu nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Digite seu genêro (M/F): ");
        pessoa.setGenero(scanner.next().charAt(0));

        System.out.println("Digite sua idade: ");
        pessoa.setIdade(scanner.nextInt());

        scanner.close();

        CalculoImcUtils calculoImcUtils = new CalculoImcUtils();

        printInfo(Level.INFO, pessoa.toString());
        printInfo(Level.INFO, calculoImcUtils.printarClassificacaoComBaseNoImc(calculoImcUtils.calcularImc(pessoa)));
    }

    private static void printInfo(Level level , String mensagem) {
        LOGGER.log(level, mensagem);
    }

    private static Double lerValorDoubleUsuario(Scanner scanner) {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            printInfo(Level.SEVERE, String.format("Valor digitado incorreto -> %s", scanner.nextLine()));
        }
        return Double.MIN_NORMAL;
    }
}
