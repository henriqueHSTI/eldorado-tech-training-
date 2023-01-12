package com.eldorado.calculo;

import com.eldorado.calculo.modelo.Pessoa;
import com.eldorado.calculo.utilidades.CalculaImcFerramenta;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private static final String IMC_CLASSIFICACAO_NIVEL_LOG_TEMPLATE = "IMC: %s, Classificação: %s, Nível de Obesidade %s";

    public static void main(String[] args) {

        final var calculaImcFerramenta = new CalculaImcFerramenta();

        final var pessoa = new Pessoa();
        pessoa.setAltura(1.68);
        pessoa.setPeso(60);
        pessoa.setNome("Kaibin");
        pessoa.setGenero('M');
        pessoa.setIdade((short) 23);

        LOGGER.info(pessoa.toString());

        final double imc = calculaImcFerramenta.calculaImc(pessoa);

        LOGGER.info(calculaImcFerramenta.pegaInformacaoDoImc(imc));
    }
}