package laco_repeticao;

import java.util.Scanner;

public class L3_6 {

	public static void main(String[] args) {
		// Declaração das variáveis
		int numero, total;
		float soma, media;
		
		total = 0;
		soma = 0.0f;
		media = 0.0f;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		do {
			if(numero % 3 == 0) {
				soma = soma + numero;
				total++;
			}		
			System.out.print("Digite um número: ");
			numero = leia.nextInt();		
		} while(numero != 0);
		
		media = soma / total;
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f" , media);
		
		leia.close();

	}

}
