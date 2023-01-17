package org.eldorado.week.two.designpattern.decorator;

public class Refrigerante extends CoquetelDecorator {

	public Refrigerante(Coquetel umCoquetel) {
		super(umCoquetel);
		nome = "Refrigerante";
		preco = 1.0;
	}

}
