package com.eldorado.calculo.utilidades;

import com.eldorado.calculo.modelo.Pessoa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GerenciadorDeArquivos {

    private static final Logger LOGGER = Logger.getLogger(GerenciadorDeArquivos.class.getName());

    static final String CAMINHO = "resource/";

    public void escreverArquivo(List<Pessoa> pessoas, String nomeDoArquivo) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.format("%s/%s.txt", CAMINHO, nomeDoArquivo), true))) {
            for (Pessoa pessoa : pessoas) {
                bufferedWriter.append(pessoa.toString()).append("\n");
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    public List<Pessoa>  lerArquivo(String nomeArquivo) {
        List<Pessoa> pessoas = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.format("%s/%s.txt", CAMINHO, nomeArquivo)))) {
            bufferedReader.readLine();
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] vetor = line.split(";");
                var pessoa = new Pessoa();
                pessoa.setNome(vetor[0]);
                pessoa.setAltura(vetor[1]);
                pessoa.setIdade(vetor[2]);
                pessoa.setPeso(vetor[3]);
                pessoa.setGenero(vetor[4]);
                pessoa.setImc(vetor[5]);
                pessoas.add(pessoa);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        return pessoas;
    }
}
