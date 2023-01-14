package com.eldorado.calculo.inicio;

import com.eldorado.calculo.modelo.Pessoa;
import com.eldorado.calculo.utilidades.CalculoImcFerramenta;
import com.eldorado.calculo.utilidades.GerenciadorDeArquivos;
import com.eldorado.calculo.utilidades.Utilidades;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class InicioCalculoImc {
    private static final Logger LOGGER = Logger.getLogger(InicioCalculoImc.class.getName());
    static Scanner scanner = new Scanner(System.in);

    public void inicio() {
        var calculaImcFerramenta = new CalculoImcFerramenta();
        boolean continuar = true;

        List<Pessoa> pessoas = new ArrayList<>();

        while (continuar) {

            var pessoa = new Pessoa();

            System.out.println("Digite seu Nome");
            pessoa.setNome(scanner.nextLine());

            System.out.println("Digite sua altura");
            pessoa.setAltura(Utilidades.lerValorDoubleUsuario(scanner));

            System.out.println("Digite seu peso");
            pessoa.setPeso(Utilidades.lerValorDoubleUsuario(scanner));

            System.out.println("Digite sua Idade");
            pessoa.setIdade(Utilidades.lerIntegerUsuario(scanner));

            System.out.println("Digite sue Genero");
            pessoa.setGenero(scanner.nextLine());

            double imc = calculaImcFerramenta.calculaImc(pessoa);

            pessoa.setImc(imc);

            LOGGER.log(Level.INFO, pessoa.toString());

            calculaImcFerramenta.printInformacao(imc);

            pessoas.add(pessoa);

            LOGGER.info(calculaImcFerramenta.retornaNivelObesidade("AAAA"));

            System.out.println("Digite C continuar e S para sair");
            String line = scanner.nextLine();

            continuar = Objects.equals("C", line);

        }
        var gerenciadorDeArquivo = new GerenciadorDeArquivos();
        gerenciadorDeArquivo.escreverArquivo(pessoas, "pessoas");

        scanner.close();

        LOGGER.log(Level.INFO, String.format("Número de Cadastros: " + pessoas.size()));
    }

    public void lerArquivo() {
        var calculaImcFerramenta = new CalculoImcFerramenta();

        var gerenciadoArquivos = new GerenciadorDeArquivos();
        var pessoas = gerenciadoArquivos.lerArquivo("base-teste");

        var pessoasF = pessoas.stream()
                .filter(pessoa -> Objects.equals(pessoa.getGenero(), "F"))
                .collect(Collectors.toList());

        Map<String, List<Pessoa>> mapPessoasGenero = pessoas.stream().collect(groupingBy(Pessoa::getGenero));

        LOGGER.info(String.format("Número de Genero Masculino %s\nNúmero de Genero Feminino %s",
                mapPessoasGenero.get("M").size(), mapPessoasGenero.get("F").size()));


        var mediaPeso = pessoasF.stream().mapToDouble(Pessoa::getPeso).sum() / pessoasF.size();

        LOGGER.info(String.format("Peso Medio %s", mediaPeso));

        pessoas.stream().parallel().forEach(pessoa -> {
            pessoa.setImc(calculaImcFerramenta.calculaImc(pessoa));
            LOGGER.info("Calculo IMC WORKER -->" + Thread.currentThread().getName());
        });
        gerenciadoArquivos.escreverArquivo(pessoas, "pessoas");

    }
}
