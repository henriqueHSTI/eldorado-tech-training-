package com.eldorado.calculo.inicio;

import com.eldorado.calculo.Main;
import com.eldorado.calculo.modelo.Pessoa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

class GerenciaArquivo {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    void recebeListaPessoaParaGravarArquivo(List<Pessoa> listaPessoa, final String nomeArquivo) throws IOException {
        var buffer = new BufferedWriter(new FileWriter(nomeArquivo));

        for(var pessoa: listaPessoa) {
            buffer.write(pessoa.toString());
            buffer.write("\n");
        }

        buffer.close();
    }
}
