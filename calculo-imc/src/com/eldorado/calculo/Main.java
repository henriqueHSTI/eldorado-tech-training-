package com.eldorado.calculo;

import com.eldorado.calculo.Utils.CalculoImc;
import com.eldorado.calculo.Utils.GerenciadorArquivos;
import com.eldorado.calculo.models.Pessoa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LOGGER.info("Aplicação Iniciada");
        var imc = new CalculoImc();
        var gerenciadorArquivos = new GerenciadorArquivos();
        // List<Pessoa> pessoasList = imc.lerImc();
        //gerenciadorArquivos.gravaListaPessoas(pessoasList);

        List<Pessoa> pessoasList = gerenciadorArquivos.lerArquivoPessoasCsv();
        pessoasList = pessoasList.stream()
                .filter(a -> a.getGenero() == 'F')
                .collect(Collectors.toList());


        System.out.println(pessoasList.toString());
    }

}