package com.eldorado.calculo;

import com.eldorado.calculo.inicio.InicioCalculoImc;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Aplicação Iniciada");
        var inicio = new InicioCalculoImc();
        try{
            inicio.inicio();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }
}