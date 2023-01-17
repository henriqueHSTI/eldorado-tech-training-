package org.eldorado.week.two.designpattern.abstractFactory;

public interface FabricaDeCarro {
	CarroSedan criarCarroSedan();
	CarroPopular criarCarroPopular();
}
