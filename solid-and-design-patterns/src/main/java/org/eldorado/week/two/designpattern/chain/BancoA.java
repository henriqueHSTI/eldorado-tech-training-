package org.eldorado.week.two.designpattern.chain;

public class BancoA extends BancoChain {

	public BancoA() {
		super(IDBancos.bancoA);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco A");
	}
}
