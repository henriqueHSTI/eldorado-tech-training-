package com.eldorado.calculo;

import com.eldorado.calculo.Utils.LeituraImc;
import com.eldorado.calculo.Utils.Util;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LOGGER.info("Aplicação Iniciada");
        var leituraImc = new LeituraImc();
        leituraImc.lerImc();
        
    }

}