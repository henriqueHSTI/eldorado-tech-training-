package com.eldorado.calculo.inicio;

import com.eldorado.calculo.Main;
import com.eldorado.calculo.modelo.Pessoa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

class GerenciaArquivo {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    protected void recebeListaPessoaParaGravarArquivo(List<Pessoa> listaPessoa, final String nomeArquivo) throws IOException {
        var buffer = new BufferedWriter(new FileWriter(nomeArquivo));

        for(var pessoa: listaPessoa) {
            buffer.write(pessoa.toString());
            buffer.write("\n");
        }
        buffer.close();
    }

    protected List<Pessoa> leListaPessoa(final String pathArquivo) throws IOException {
        List<Pessoa> listaPessoa = new ArrayList<>();
        var bufferRead = new BufferedReader(new FileReader(pathArquivo));
        var linha =  bufferRead.readLine();
        while (linha  != null){
            try{
                String vetor[] = linha.split(";");
                var pessoa = new Pessoa();
                pessoa.setNome(vetor[0]);
                pessoa.setAltura(vetor[2].replace(",", "."));
                pessoa.setIdade(vetor[1]);
                pessoa.setPeso(Double.valueOf(vetor[3]));
                pessoa.setGenero(vetor[4]);
                listaPessoa.add(pessoa);

                linha =  bufferRead.readLine();
            }catch (NumberFormatException e) {
                LOGGER.info("ERRO: " + e.getMessage());
                linha = bufferRead.readLine();
            }
        }
        bufferRead.close();
        return listaPessoa;
    }
}
