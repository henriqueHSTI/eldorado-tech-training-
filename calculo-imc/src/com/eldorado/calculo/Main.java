package com.eldorado.calculo;

import com.eldorado.calculo.start.StartCalcImc;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        LOGGER.info("Application started");
        var start = new StartCalcImc();
        start.start();
    }





}