package com.eldorado.calculo;

import com.eldorado.calculo.inicio.InicioCalculoImc;

import java.io.IOException;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        LOGGER.info("Aplicação Iniciada");
        var inicio = new InicioCalculoImc();
        inicio.inicio();
    }
}