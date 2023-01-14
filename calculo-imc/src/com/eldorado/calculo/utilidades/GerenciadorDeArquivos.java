package com.eldorado.calculo.utilidades;

import com.eldorado.calculo.modelo.Pessoa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class GerenciadorDeArquivos  {

    private static final Logger LOGGER = Logger.getLogger(GerenciadorDeArquivos.class.getName());

    // final static String CAMINHO = "resource/";

    public static void escreverArquivo(final List<Pessoa> pessoas, final String nomeArquivo) {

        try (final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.format("%s.txt", nomeArquivo)))) {
            bufferedWriter.append(pessoas.stream().map(Pessoa::toString).collect(Collectors.joining("\n")));
        } catch (final IOException e) {
            LOGGER.warning(String.format("Erro ao escrever arquivo, devido a: %s", e));
        }
    }

    public static List<Pessoa> lerArquivo(final String nomeArquivo) {

        final List<Pessoa> pessoas = new ArrayList<>();

        try (final BufferedReader bufferReader = new BufferedReader(new FileReader(String.format("%s.txt", nomeArquivo)))) {

            // bufferReader.readLine();

            String line = bufferReader.readLine();

            while (line != null) {

                final String[] vetor = line.split(";");
                final var pessoa = new Pessoa();
                pessoa.setNome(vetor[0]);
                pessoa.setAltura(vetor[1]);
                pessoa.setIdade(vetor[2]);
                pessoa.setPeso(vetor[3]);
                pessoa.setGenero(vetor[4]);
                pessoa.setImc(vetor[5]);
                pessoas.add(pessoa);
                line = bufferReader.readLine();
            }
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }

        return pessoas;
    }
}
