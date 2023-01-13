package com.eldorado.calculo;

import com.eldorado.calculo.exceptions.WrongHeightException;
import com.eldorado.calculo.exceptions.WrongWeightException;
import com.eldorado.calculo.modelo.Pessoa;
import com.eldorado.calculo.utilidades.CalculoImcFerramenta;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        var calculaImcFerramenta = new CalculoImcFerramenta();
        boolean continuar = true;
        while (continuar) {

            var pessoa = new Pessoa();

            System.out.println("Digite seu Nome");
            pessoa.setNome(scanner.nextLine());

            while(true){
                try {
                    System.out.println("Digite sua altura");
                    Double altura = lerValorDoubleUsuario(scanner);
                    if (altura < 0.0){

                        throw new WrongHeightException("Altura inválida");
                    }else{
                        pessoa.setAltura(altura);
                        break;
                    }

                }catch (WrongHeightException e){

                    e.printStackTrace();
                }

            }

            while(true){
                try {
                    System.out.println("Digite seu peso");
                    Double peso = lerValorDoubleUsuario(scanner);
                    if (peso < 0.0){

                        throw new WrongWeightException("Peso inválido");
                    }else{
                        pessoa.setPeso(peso);
                        break;
                    }

                }catch (WrongWeightException e){

                    e.printStackTrace();
                }

            }

            while(true){
                try {
                    System.out.println("Digite seu peso");
                    Integer idade = lerIntegerUsuario(scanner);
                    if (idade < 0.0){

                        throw new WrongWeightException("Idade inválida");
                    }else{
                        pessoa.setIdade(idade);
                        break;
                    }

                }catch (WrongWeightException e){

                    e.printStackTrace();
                }

            }

            double imc = calculaImcFerramenta.calculaImc(pessoa);

            LOGGER.log(Level.INFO, pessoa.toString());

            calculaImcFerramenta.printInformacao(imc);

            LOGGER.info(calculaImcFerramenta.retornaNivelObesidade("AAAA"));

            System.out.println("Digite C continuar e S para sair");
            String line = scanner.nextLine();

            continuar = Objects.equals("C", line);

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