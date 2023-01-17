package org.eldorado.week.two.designpattern.proxy;

public class Cliente {
	public static void main(String[] args) {
		System.out.println("Hacker acessando >(");
		BancoUsuarios banco = new BancoProxy("Hacker", "1234");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());

		System.out.println("\nAdministrador acessando :)");
		banco = new BancoProxy("admin", "admin");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());
	}
}
