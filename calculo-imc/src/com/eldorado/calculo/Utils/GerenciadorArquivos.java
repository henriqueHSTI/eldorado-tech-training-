package com.eldorado.calculo.Utils;

import com.eldorado.calculo.models.Pessoa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorArquivos {

    public void gravaListaPessoas(List<Pessoa> pessoasList) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("resource/pessoas.txt"));
            for (Pessoa pessoa: pessoasList) {
                bufferedWriter.append(pessoa.toString() + " \n");
                bufferedWriter.flush();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Pessoa> lerArquivoPessoasCsv() {

        List<Pessoa> pessoas = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("resource/base-teste.csv"));
            bufferedReader.readLine();

            String arquivo = bufferedReader.readLine();

            while(arquivo != null){
                System.out.println("leu linha");
                String[] pessoaArquivo = arquivo.split(";");
                if (pessoaArquivo[4].equals("F")) {
                    Pessoa pessoa = new Pessoa();
                    pessoa.setNome(pessoaArquivo[0]);
                    pessoa.setIdade(pessoaArquivo[1]);
                    if (!pessoaArquivo[2].equalsIgnoreCase(null)) {
                        pessoa.setAltura(tratarValoresToDouble(pessoaArquivo[2]));
                    }
                    if (!pessoaArquivo[3].equalsIgnoreCase(null) && !pessoaArquivo[3].isEmpty()) {
                        pessoa.setPeso(pessoaArquivo[3]);
                    }
                    pessoa.setGenero(pessoaArquivo[4]);

                    pessoas.add(pessoa);
                }
                arquivo = bufferedReader.readLine();
            }

            return pessoas;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private String tratarValoresToDouble(String s) {
        return s.replace(",", ".");
    }
}
