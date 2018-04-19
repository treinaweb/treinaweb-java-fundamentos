package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Olá, mundo!");
		System.out.print("Olá mundo de novo \n");
		System.out.println("Olá mundo mais uma vez");
		System.out.println(nome);
		scanner.close();
	}

}