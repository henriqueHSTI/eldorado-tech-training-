package com.eldorado.calculo;

import com.eldorado.calculo.modelo.Pessoa;
import com.eldorado.calculo.utilidades.CalculoImcFerramenta;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        var calculaImcFerramenta = new CalculoImcFerramenta();
        boolean continuar = true;

        while(continuar) {

            var pessoa = new Pessoa();

            System.out.print("Nome: ");
            pessoa.setNome(scanner.nextLine());

            System.out.print("Idade: ");
            pessoa.setIdade((short) scanner.nextInt());

            System.out.print("Peso: ");
            pessoa.setPeso(lerDoubleUsuario(scanner));

            System.out.print("Altura: ");
            pessoa.setAltura(lerDoubleUsuario(scanner));

            double imc = calculaImcFerramenta.calcularImc(pessoa);
            LOGGER.log(Level.INFO, pessoa.toString());
            calculaImcFerramenta.printInformacao(imc);
            calculaImcFerramenta.retornarNivelObesidade("Normal");

            System.out.print("Deseja continuar? C para Continuar e S para Sair");
            String line = scanner.nextLine();

            continuar = Objects.equals("C", line);
        }
        scanner.close();
    }

    private static Double lerDoubleUsuario(Scanner scanner) {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor incorreto -> %s", scanner.nextLine()));
        }
        return Double.MIN_NORMAL;
    }

    private static Integer lerIntegerUsuario(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor incorreto -> %s", scanner.nextLine()));
        }
        return Integer.MIN_VALUE;
    }
}