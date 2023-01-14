package com.eldorado.calculo.inicio;

import com.eldorado.calculo.modelo.Pessoa;
import com.eldorado.calculo.utilidades.CalculoImcFerramenta;
import com.eldorado.calculo.utilidades.Utilidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InicioCalculoImc {
    private static final Logger LOGGER = Logger.getLogger(InicioCalculoImc.class.getName());
    static Scanner scanner = new Scanner(System.in);

    public void inicio() throws IOException {
        var calculaImcFerramenta = new CalculoImcFerramenta();
        boolean continuar = true;
        List<Pessoa> pessoas = new ArrayList<>();

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("..\\relatorio.txt"));) {

            while (continuar) {
                var pessoa = new Pessoa();
                LOGGER.info("Digite seu Nome");
                pessoa.setNome(scanner.nextLine());
                LOGGER.info("Digite sua altura");
                pessoa.setAltura(Utilidades.lerValorDoubleUsuario(scanner));
                LOGGER.info("Digite seu peso");
                pessoa.setPeso(Utilidades.lerValorDoubleUsuario(scanner));
                LOGGER.info("Digite sua Idade");
                pessoa.setIdade(Utilidades.lerIntegerUsuario(scanner));
                double imc = calculaImcFerramenta.calculaImc(pessoa);
                LOGGER.log(Level.INFO, pessoa.toString());
                calculaImcFerramenta.printInformacao(imc);
                pessoas.add(pessoa);
                LOGGER.info(calculaImcFerramenta.retornaNivelObesidade("AAAA"));
                LOGGER.info("Digite C continuar e S para sair");
                String line = scanner.nextLine();

                writer.write(pessoa.toString());
                writer.newLine();

                continuar = Objects.equals("C", line);
            }
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        } finally {
            scanner.close();
            LOGGER.log(Level.INFO, String.format("Número de Cadastros: " + pessoas.size()));
        }
    }

}
