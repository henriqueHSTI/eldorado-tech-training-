package org.eldorado.week.two.designpattern.chain;

public class BancoC extends BancoChain {

	public BancoC() {
		super(IDBancos.bancoC);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco C");
	}

}
