package org.eldorado.week.two.designpattern.abstractFactory;

public class FabricaFord implements FabricaDeCarro {

    @Override
    public CarroSedan criarCarroSedan() {
        return new FiestaSedan();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Fiesta();
    }

}
