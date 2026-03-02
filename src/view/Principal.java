package view;

import java.util.Scanner;

import controller.OcorrenciaNumeroController;

public class Principal {

	public static void main(String[] args) {
		OcorrenciaNumeroController ocNum = new OcorrenciaNumeroController();
		Scanner leia = new Scanner(System.in);

		int a, b;

		while (true) {
			System.out.println("Digite um valor entre 10 e 999999: ");
			
			while(!leia.hasNextInt()) {
				System.out.println("Valor inválido! Digite um valor inteiro!\n");
				System.out.println("Digite um número inteiro: ");
				leia.next();
			}
			
			a = leia.nextInt();

			if (a < 10 || a > 999999) {
				System.out.println("Número inválido!");
			} else {
				break;
			}

		}

		while (true) {
			System.out.println("Digite um valor entre 0 e 9: ");
			
			while(!leia.hasNextInt()) {
				System.out.println("Valor inválido! Digite um valor inteiro!\n");
				System.out.println("Digite um número inteiro: ");
				leia.next();
			}
			
			b = leia.nextInt();

			if (b < 1 || b > 9) {
				System.out.println("Número inválido!");
			} else {
				break;
			}
		}
		
		int res = ocNum.ocorrencia(a, b);
		
		System.out.println("O algarismo "+b+" aparece "+res+" vezes no número "+a);
		
		leia.close();
	}

}
