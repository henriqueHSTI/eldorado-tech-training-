package org.eldorado.week.two.designpattern.abstractFactory;

public class FiestaSedan implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Fiesta\nFábrica:Ford\nCategoria:Sedan");
	}

}
