package com.wakanda.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 1 + 2;
		
		System.out.println("O resultado da soma é: " + resultado);
		
		resultado = resultado - 1;
		
		System.out.println("O resultado da subtração é: " + resultado);
		
		resultado = resultado * 2;
		
		System.out.println("O resultado da multiplicação é: " + resultado);
		
		resultado = resultado / 2;
		
		System.out.println("O resultado da divisão é: " + resultado);
		
		resultado = resultado + 8;
		
		System.out.println("O resultado da soma é: " + resultado);
		
		resultado = resultado % 7;
		
		System.out.println("O resultado do módulo/resto é: " + resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println("O resultado é: " + resultado);
		
		resultado++;
		System.out.println("O resultado é: " + resultado);
		
		// imprime para depois adicionar o incremento
		System.out.println("O resultado é: " + resultado++);
		
		// incrementa para depois imprimir o resultado
		System.out.println("O resultado é: " + ++resultado);
		
		System.out.println("O resultado é: " + resultado--);
		System.out.println("O resultado é: " + --resultado);

	}

}
