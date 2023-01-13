package com.eldorado.calculo;

import com.eldorado.calculo.exceptions.WrongAgeException;
import com.eldorado.calculo.exceptions.WrongGenderException;
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

            setNomePessoa(pessoa);

            setGeneroPessoa(pessoa);

            setAlturaPessoa(pessoa);

            setPesoPessoa(pessoa);

            setIdadePessoa(pessoa);

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

    private static void setIdadePessoa(Pessoa pessoa) {
        while (true) {
            try {
                System.out.println("Digite sua idade");
                Integer idade = Integer.parseInt(scanner.nextLine());
                if (idade < 0.0) {
                    throw new WrongAgeException("Idade inválida");
                } else {
                    pessoa.setIdade(idade);
                    break;
                }
            } catch (WrongAgeException e) {

                LOGGER.log(Level.SEVERE, "Idade Inválida");
            }

        }
    }

    private static void setPesoPessoa(Pessoa pessoa) {
        while (true) {
            try {
                System.out.println("Digite seu peso");
                Double peso = Double.parseDouble(scanner.nextLine());
                if (peso < 0.0) {

                    throw new WrongWeightException("Peso inválido");
                } else {
                    pessoa.setPeso(peso);
                    break;
                }

            } catch (WrongWeightException e) {

                LOGGER.log(Level.SEVERE, "Peso Inválido");
            }

        }
    }

    private static void setAlturaPessoa(Pessoa pessoa) {
        while (true) {
            try {
                System.out.println("Digite sua altura");
                Double altura = Double.parseDouble(scanner.nextLine());
                if (altura < 0.0) {

                    throw new WrongHeightException("Altura inválida");

                } else {
                    pessoa.setAltura(altura);
                    break;
                }

            } catch (WrongHeightException e) {

                LOGGER.log(Level.SEVERE, "Altura Inválida");
            }

        }

    }

    private static void setGeneroPessoa(Pessoa pessoa) {
        while (true) {
            try {
                System.out.println("Digite seu genero");
                String genero = scanner.nextLine();
                if (!genero.equals("M") && !genero.equals("F")) {

                    throw new WrongGenderException("Altura inválida");

                } else {
                    pessoa.setGenero(genero);
                    break;
                }

            } catch (WrongGenderException e) {

                LOGGER.log(Level.SEVERE, "Genero Inválido");
            }

        }
    }

    private static void setNomePessoa(Pessoa pessoa) {
        while (true) {
            try {
                System.out.println("Digite seu nome");
                String nome = scanner.nextLine();
                pessoa.setNome(nome);
                break;

            } catch (Exception e) {

                LOGGER.log(Level.SEVERE, "Nome Inválido");
            }

        }
    }

}