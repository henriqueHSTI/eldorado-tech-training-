package org.eldorado.week.two.designpattern.prototype;

public class PalioPrototype extends CarroPrototype {

	private PalioPrototype(PalioPrototype palioPrototype) {
		this.valorCompra = palioPrototype.getValorCompra();
	}

	public PalioPrototype() {
		valorCompra = 0.0;
	}

	@Override
	public String exibirInfo() {
		return "Modelo: Palio\n" + "Montadora: Fiat\n" + "Valor: R$"
				+ getValorCompra();
	}

	@Override
	public CarroPrototype clonar() {
		return new PalioPrototype(this);
	}

}
