package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String [] args) {
		
		Gato gato = new Gato("Fofinho", "azul", 3);
		Livros livro = new Livros();
		
		System.out.println(gato);
			
		/*
		 * int a = 5; int b = 3; System.out.println("Hello world!" + (a+b));
		 */

	}
}

class Livros {
	private String nome;
	private String npag;
}