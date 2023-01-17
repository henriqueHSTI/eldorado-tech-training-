package org.eldorado.week.two.designpattern.adapter;

public class OpenGLImage {

	public void glCarregarImagem(String arquivo) {
		System.out.println("Imagem " + arquivo + " carregada.");
	}

	public void glDesenharImagem(int posicaoX, int posicaoY) {
		System.out.println("OpenGL Image desenhada");
	}
}
