package com.eldorado.calculo;

import com.eldorado.calculo.inicio.InicioCalculoImc;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        LOGGER.info("Aplicação iniciada");
        final var inicio = new InicioCalculoImc();
        // inicio.inicio();
        inicio.lerArquivo();
    }
}