package org.eldorado.week.two.designpattern.command;

public class PagamentoCartaoCredito implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		System.out.println("Compra emitida!\n" + compra.getInfoNota());
	}

}
