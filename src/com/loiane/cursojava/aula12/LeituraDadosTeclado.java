package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Lendo uma linha inteira
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo e: " + nomeCompleto);
		
		//Lendo um tipo de dado especifico
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome e: " + primeiroNome);
		
		//Lendo um inteiro
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade e: " + idade);
		
		//Lendo um double
		System.out.println("Informe sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura e: " + altura);
		
		System.out.println("Digite o seu primeiro, idade, quantidade de filhos, altura, e se tem pet");
		String nome = scan.next();
		int idade1 = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura1 = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		
		System.out.println("Voce digitou os seguintes valores: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade1);
		System.out.println("Filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura1);
		System.out.println("Tem Pet: " + temPet);
		
	}

}
