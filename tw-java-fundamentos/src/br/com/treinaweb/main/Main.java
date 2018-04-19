package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int numero1 = Integer.parseInt(scanner.nextLine());
		System.out.println(numero1);		
		scanner.close();
	}

}