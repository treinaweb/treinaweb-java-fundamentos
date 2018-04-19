package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int acao = 1; // 0 = sair; 1 = operação matemática; 2 = histórico
		ArrayList<String> historico = new ArrayList<String>();
		while (acao > 0) {			
			if (acao == 1) {
				System.out.println(" === Operação matemática ===");
				System.out.print("Digite o primeiro número: ");
				int numero1 = 0;
				try {
					numero1 = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println(String.format("Ocorreu um erro de formato: %s. O primeiro número assumirá o valor 1.", e.getMessage()));
					scanner.nextLine();
					numero1 = 1;
				} catch (Exception e) {
					System.out.println("Erro desconhecido.");
				}
				System.out.print("Digite a operação: ");
				char operacao = scanner.next().charAt(0);
				System.out.print("Digite o segundo número: ");
				int numero2 = scanner.nextInt();
				System.out.println(String.format("Você quer fazer a operação %d %c %d", numero1, operacao, numero2));
				int resultado = 0;
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
				String entradaHistorico = String.format("%d %c %d = %d", numero1, operacao, numero2, resultado);
				historico.add(entradaHistorico);
				System.out.println(entradaHistorico);
			} else if (acao == 2) {
				System.out.println(" === Histórico ===");
				System.out.println(String.format("- Você já fez %d operações", historico.size()));
				historico.forEach(itemHistorico -> System.out.println(itemHistorico));
			}
			System.out.println("=== O que você deseja fazer? === ");
			System.out.println("1. Realizar outra operação matemática");
			System.out.println("2. Visualizar histórico");
			System.out.println("0. Sair");
			System.out.print("Sua opção: ");
			acao = scanner.nextInt();
		}
		scanner.close();
	}

}
