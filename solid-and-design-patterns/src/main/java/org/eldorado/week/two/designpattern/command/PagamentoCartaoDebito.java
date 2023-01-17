package org.eldorado.week.two.designpattern.command;

public class PagamentoCartaoDebito implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		System.out.println("Compra debitada!\n" + compra.getInfoNota());
	}

}
