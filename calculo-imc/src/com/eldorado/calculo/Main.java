package com.eldorado.calculo;

import com.eldorado.calculo.inicio.InicioCalculoImc;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        LOGGER.info("Aplicação Iniciada");

        var inicio = new InicioCalculoImc();

        while (true) {
            System.out.println("Digite 1 para Ler arquivo \n2 para inserir dados \n3 para sair");
            var opcao = SCANNER.nextLine();

            if (Objects.equals(opcao, "1")) {
                inicio.inicio();
            } else if (Objects.equals(opcao, "2")) {
                inicio.lerArquivo();
            } else if (Objects.equals(opcao, "3")) {
                break;
            } else {
                LOGGER.info("Valor Digitado Invalido");
            }
        }
    }
}