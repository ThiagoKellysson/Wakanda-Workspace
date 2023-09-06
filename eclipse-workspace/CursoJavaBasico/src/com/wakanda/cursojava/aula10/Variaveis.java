package com.wakanda.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//convenção Java
		int idade = 26;
		String nome = "Wakanda";
		String nomeDoMeuCachorro = "Pantera";
		
		//aceito, mas não utilizado
		int _idade;
		int $idade;
		
		//não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		idade = 36;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		// Má pratica
		int a = 10;
		String b = "Wakanda";
		

	}

}
