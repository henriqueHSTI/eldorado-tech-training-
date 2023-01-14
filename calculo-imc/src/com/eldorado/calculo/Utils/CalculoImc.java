package com.eldorado.calculo.Utils;

import com.eldorado.calculo.models.Pessoa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculoImc {

    private static final Logger LOGGER = Logger.getLogger(CalculoImc.class.getName());
    static Scanner scanner = new Scanner(System.in);

    public List<Pessoa> lerImc() {
        boolean continuar = true;

        List<Pessoa> pessoas = new ArrayList<>();

        while (continuar) {

            var pessoa = new Pessoa();

            System.out.println("Digite seu Nome");
            pessoa.setNome(scanner.nextLine());

            System.out.println("Digite sua altura");
            pessoa.setAltura(Util.lerValorDoubleUsuario(scanner));

            System.out.println("Digite seu peso");
            pessoa.setPeso(Util.lerValorDoubleUsuario(scanner));

            System.out.println("Digite seu Gênero");
            pessoa.setGenero(scanner.nextLine().charAt(0));

            System.out.println("Digite sua Idade");
            pessoa.setIdade(Util.lerIntegerUsuario(scanner));

            LOGGER.log(Level.INFO, pessoa.toString());

            double imc = Util.calculaImc(pessoa.getAltura(), pessoa.getPeso());
            pessoa.setImc(imc);
            String resultadoImc = Util.calculaClassificacaoImc(imc);
            LOGGER.log(Level.INFO, resultadoImc);

            pessoas.add(pessoa);

            System.out.println("Digite C continuar e S para sair");
            String line = scanner.nextLine();

            continuar = Objects.equals("C", line);

        }

        scanner.close();
        LOGGER.log(Level.INFO, String.format("Número de Cadastros: " + pessoas.size()));

        return pessoas;
    }
}
