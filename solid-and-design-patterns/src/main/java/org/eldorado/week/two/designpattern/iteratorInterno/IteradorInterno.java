package org.eldorado.week.two.designpattern.iteratorInterno;


import org.eldorado.week.two.designpattern.iteratorExterno.Canal;
import org.eldorado.week.two.designpattern.iteratorExterno.IteradorInterface;

public abstract class IteradorInterno {

    IteradorInterface it;

    public void percorrerLista() {
        for (it.first(); !it.isDone(); it.next()) {
            operacao(it.currentItem());
        }
    }

    protected abstract void operacao(Canal canal);
}
