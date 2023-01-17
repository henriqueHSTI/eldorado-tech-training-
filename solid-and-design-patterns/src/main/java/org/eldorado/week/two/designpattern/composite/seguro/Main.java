package org.eldorado.week.two.designpattern.composite.seguro;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// O cliente precisa conhecer a implementa��o das classes concretas,
		// pois a interface de um ArquivoVideo � diferente de um
		// ArquivoComposite
		ArquivoComponent meuVideo = new ArquivoVideo("meu video.rmvb");
		ArquivoComponent meuOutroVideo = new ArquivoVideo("novo video.rmvb");
		// No entanto previne que o usu�rio possa fazer esse tipo de chamada:
		// meuVideo.adicionar(meuOutroVideo);

		ArquivoComponent minhaPasta = new ArquivoComposite("minha pasta/");

		// Para utilizar os m�todos espec�ficos de um composite � necess�rio
		// realizar um cast. Mas � preciso ter certeza que o objeto pode ser
		// convertido, caso contr�rio uma exce��o ser� disparada
		((ArquivoComposite) minhaPasta).adicionar(meuVideo);
		((ArquivoComposite) minhaPasta).adicionar(meuOutroVideo);
		minhaPasta.printNomeDoArquivo();

	}

}
