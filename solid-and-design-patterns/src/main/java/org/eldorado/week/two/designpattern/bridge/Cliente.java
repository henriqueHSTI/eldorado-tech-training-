package org.eldorado.week.two.designpattern.bridge;

public class Cliente {
	public static void main(String[] args) {
		JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
		janela.desenhar();
		janela = new JanelaAviso(new JanelaLinux());
		janela.desenhar();

		janela = new JanelaDialogo(new JanelaWindows());
		janela.desenhar();
	}
}
