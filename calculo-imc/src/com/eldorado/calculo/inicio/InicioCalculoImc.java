package com.eldorado.calculo.inicio;

import com.eldorado.calculo.Main;
import com.eldorado.calculo.modelo.Pessoa;
import com.eldorado.calculo.utilidades.CalculoImcFerramenta;
import com.eldorado.calculo.utilidades.Utilidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InicioCalculoImc {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
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

            double imc = calculaImcFerramenta.calculaImc(pessoa);

            LOGGER.log(Level.INFO, pessoa.toString());

            calculaImcFerramenta.printInformacao(imc);

            pessoas.add(pessoa);

            LOGGER.info(calculaImcFerramenta.retornaNivelObesidade("AAAA"));

            System.out.println("Digite C continuar e S para sair");
            String line = scanner.nextLine();

            continuar = Objects.equals("C", line);

        }

        scanner.close();

        LOGGER.log(Level.INFO, String.format("Número de Cadastros: " + pessoas.size()));
    }

}
