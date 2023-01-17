package org.eldorado.week.two.designpattern.iteratorInterno;


import org.eldorado.week.two.designpattern.iteratorExterno.Canal;
import org.eldorado.week.two.designpattern.iteratorExterno.IteradorInterface;

public class IteradorPrint extends IteradorInterno {

    public IteradorPrint(IteradorInterface it) {
        this.it = it;
    }

    @Override
    protected void operacao(Canal canal) {
        System.out.println(canal.nome);
    }

}
