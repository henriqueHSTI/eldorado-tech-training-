package com.eldorado.calculo.inicio;

import com.eldorado.calculo.modelo.Pessoa;
import com.eldorado.calculo.utilidades.CalculaImcFerramenta;
import com.eldorado.calculo.utilidades.GerenciadorDeArquivos;
import com.eldorado.calculo.utilidades.Utilidades;

import java.util.*;
import java.util.logging.Logger;

import static java.util.stream.Collectors.groupingBy;

public class InicioCalculoImc {

    private static Logger LOGGER = Logger.getLogger(InicioCalculoImc.class.getName());

    private static final Scanner entrada = new Scanner(System.in);

    public void inicio() {

        final var calculaImcFerramenta = new CalculaImcFerramenta();
        boolean continuar = true;

        final List<Pessoa> pessoas = new ArrayList<>();

        while(continuar == true) {

            final var pessoa = new Pessoa();

            System.out.println("Digite seu nome: ");
            pessoa.setNome(entrada.nextLine());

            System.out.println("Digite sua altura: ");
            pessoa.setAltura(Utilidades.lerValorDoubleUsuario(entrada));

            System.out.println("Digite sua idade: ");
            pessoa.setIdade(entrada.nextInt());

            System.out.println("Digite seu peso: ");
            pessoa.setPeso(Utilidades.lerValorDoubleUsuario(entrada));

            System.out.println("Digite seu gênero: ");
            pessoa.setGenero(entrada.next());

            LOGGER.info(pessoa.toString());

            final double imc = calculaImcFerramenta.calculaImc(pessoa);
            pessoa.setImc(imc);

            LOGGER.info(calculaImcFerramenta.pegaInformacoes(imc));

            pessoas.add(pessoa);

            LOGGER.info(calculaImcFerramenta.retornaNivelObesidade("Magreza"));

            entrada.nextLine();
            System.out.println("Digite C para continuar e S para sair");
            final String line = entrada.nextLine();

            continuar = Objects.equals("C", line);
        }

        entrada.close();

        LOGGER.info(String.format("Número de Cadastros: " + pessoas.size()));

        GerenciadorDeArquivos.escreverArquivo(pessoas, "pessoas");
    }

    public void lerArquivo() {

        final var gerenciadorArquivos = new GerenciadorDeArquivos();
        final var pessoas = gerenciadorArquivos.lerArquivo("pessoas");

        pessoas.stream()
                .filter(mulher -> Objects.equals(mulher.getGenero(), "F"))
                .sorted(Comparator.comparing(Pessoa::getNome))
                .forEach(mulher -> LOGGER.info(mulher.getNome()));

        final var mediaPeso = pessoas.stream()
                .mapToDouble(Pessoa::getPeso)
                .sum() / pessoas.size();

        Map<String, List<Pessoa>> mapPessoasGenero = pessoas.stream().collect(groupingBy(Pessoa::getGenero));

        LOGGER.info("Quantidade de pessoas do gênero \"M\": " + mapPessoasGenero.get("M").size());
        LOGGER.info("Quantidade de pessoas do gênero \"F\": " + mapPessoasGenero.get("F").size());

        LOGGER.info("Média dos pesos das mulheres: " + mediaPeso);

        for (final Pessoa pessoa : pessoas) {
            LOGGER.info(pessoa.toString());
        }
    }
}
