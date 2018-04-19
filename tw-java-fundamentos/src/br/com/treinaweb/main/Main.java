package br.com.treinaweb.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*System.out.print("Digite uma mensagem: ");
		String mensagem = scanner.next();
		String mensagem = scanner.nextLine();
		System.out.println(mensagem);*/
		System.out.print("Digite o primeiro número: ");
		// int numero1 = Integer.parseInt(scanner.nextLine());
		int numero1 = scanner.nextInt();	
		System.out.print("Digite a operação: ");
		char operacao = scanner.next().charAt(0);
		scanner.close();
	}

}