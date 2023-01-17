package org.eldorado.week.two.designpattern.composite.seguro;

public abstract class ArquivoComponent {
	String nomeDoArquivo;

	public String getNomedoArquivo() {
		return this.nomeDoArquivo;
	}

	public void printNomeDoArquivo() {
		System.out.println(this.nomeDoArquivo);
	}
}
