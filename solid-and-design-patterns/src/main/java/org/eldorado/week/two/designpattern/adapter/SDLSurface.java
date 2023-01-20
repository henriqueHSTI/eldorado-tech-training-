package org.eldorado.week.two.designpattern.adapter;

public class SDLSurface {

	public void SDL_CarregarSurface(String arquivo) {
		System.out.println("Imagem " + arquivo + " carregada.");
	}

	public void SDL_DesenharSurface(int largura, int altura, int posicaoX,
			int posicaoY) {
		System.out.println("SDL_Surface desenhada");
	}

}
