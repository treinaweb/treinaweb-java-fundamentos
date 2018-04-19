package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*System.out.print("Digite uma mensagem: ");
		String mensagem = scanner.next();
		String mensagem = scanner.nextLine();
		System.out.println(mensagem);*/
		// int numero1 = Integer.parseInt(scanner.nextLine());
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();	
		System.out.print("Digite a operação: ");
		char operacao = scanner.next().charAt(0);
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		// Você quer fazer a operação 9 + 2
		System.out.println(String.format("Você quer fazer a operação %d %c %d", numero1, operacao, numero2));
		int resultado = 0;
//		if (operacao == '+') {
//			resultado = numero1 + numero2;
//		} else if (operacao == '-') {
//			resultado = numero1 - numero2;
//		} else if (operacao == '*') {
//			resultado = numero1 * numero2;
//		} else if (operacao == '/') {
//			resultado = numero1 / numero2;
//		} else {
//			System.out.println("Operação inválida.");
//		}
		switch (operacao) {
		case '+':
			resultado = numero1 + numero2;
			break;
		case '-':
			resultado = numero1 - numero2;
			break;
		case '*':
			resultado = numero1 * numero2;
			break;
		case '/':
			resultado = numero1 / numero2;
			break;
		default:
			System.out.println("Operação inválida");
		}
		ArrayList<String> historico = new ArrayList<String>();
		String entradaHistorico = String.format("%d %c %d = %d", numero1, operacao, numero2, resultado);
		historico.add(entradaHistorico);
		System.out.println(entradaHistorico);
		scanner.close();		
	}

}