package com.eldorado.calculo;

import com.eldorado.calculo.Utils.CalculoImc;
import com.eldorado.calculo.models.Pessoa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LOGGER.info("Aplicação Iniciada");
        var imc = new CalculoImc();
        List<Pessoa> pessoasList = imc.lerImc();
        imc.gravaListaPessoas(pessoasList);

    }

}