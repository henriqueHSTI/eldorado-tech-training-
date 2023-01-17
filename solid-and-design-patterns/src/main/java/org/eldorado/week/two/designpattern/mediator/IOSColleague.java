package org.eldorado.week.two.designpattern.mediator;

public class IOSColleague extends Colleague {

	public IOSColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("iOs recebeu: " + mensagem);
	}

}
