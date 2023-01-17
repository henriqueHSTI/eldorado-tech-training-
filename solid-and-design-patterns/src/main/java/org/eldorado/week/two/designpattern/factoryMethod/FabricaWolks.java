package org.eldorado.week.two.designpattern.factoryMethod;

public class FabricaWolks implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Gol();
	}

}
