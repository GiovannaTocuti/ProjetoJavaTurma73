package laco_repeticao;

import java.util.Scanner;

public class L3_5 {

	public static void main(String[] args) {
		// Declaração de variáveis
		int numero, soma;
		soma = 0;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		do {
			if(numero > 0) {
				soma = soma + numero;				
			}
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
		} 
		while(numero != 0);
		
		// Saída de dados
		System.out.print("A soma dos números positivos é: " + soma);
	}
}
