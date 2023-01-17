package org.eldorado.week.two.designpattern.composite.transparente;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// O usu�rio do c�digo n�o precisa saber detalhes das implementa��es dos
		// objetos. Consegue manipular os objetos a partir da interface comum:
		// ArquivoComponent.
		ArquivoComponent minhaPasta = new ArquivoComposite("Minha Pasta/");
		ArquivoComponent meuVideo = new ArquivoVideo("meu video.avi");
		ArquivoComponent meuOutroVideo = new ArquivoVideo("serieS01E01.mkv");

		try {
			// Como a interface define opera��es comuns a todos os arquivo �
			// poss�vel tentar inserir um arquivo em um arquivo
			meuVideo.adicionar(meuOutroVideo);
		} catch (Exception e) {
			// No entanto voc� deve tratar este tipo de comportamento com
			// exce��es ou outros m�todos
			System.out.println(e.getMessage());
		}

		try {
			minhaPasta.adicionar(meuVideo);
			minhaPasta.adicionar(meuOutroVideo);
			minhaPasta.printNomeDoArquivo();
		} catch (Exception e) {
			// N�o ser� executado pois minha pasta � um ArquivoComposite e
			// possui todas as opera��es de gerenciamento dos arquivos
			// implementadas.
			System.out.println(e.getMessage());
		}

		try {
			// O problema dessa implementa��o � que o usu�rio do c�digo precisa
			// sempre verificar se pode realizar as opera��es, pois n�o se tem
			// certeza sobre o tipo do objeto utilizado
			System.out.println("\nPesquisando arquivos:");
			minhaPasta.getArquivo(meuVideo.getNomeDoArquivo())
					.printNomeDoArquivo();
			System.out.println("\nRemover arquivos");
			minhaPasta.remover(meuVideo.getNomeDoArquivo());
			minhaPasta.printNomeDoArquivo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
