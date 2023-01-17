package org.eldorado.week.two.designpattern.iteratorInterno;

import org.eldorado.week.two.designpattern.iteratorExterno.AgregadoDeCanais;
import org.eldorado.week.two.designpattern.iteratorExterno.CanaisEsportes;
import org.eldorado.week.two.designpattern.iteratorExterno.CanaisFilmes;

public class Main {
    public static void main(String[] args) {
        AgregadoDeCanais canaisDeEsportes = new CanaisEsportes();
        System.out.println("Canais de Esporte:");
        IteradorInterno it = new IteradorPrint(canaisDeEsportes.criarIterator());
        it.percorrerLista();

        AgregadoDeCanais canaisDeFilmes = new CanaisFilmes();
        System.out.println("\nCanais de Filmes:");
        it = new IteradorPrint(canaisDeFilmes.criarIterator());
        it.percorrerLista();
    }
}
