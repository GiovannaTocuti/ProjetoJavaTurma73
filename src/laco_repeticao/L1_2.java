package laco_repeticao;

import java.util.Scanner;

public class L1_2 {

	public static void main(String[] args) {
		// Declaração de variáveis
		int numero, contador, pares, impares;
		pares = 0;
		impares = 0;
		
		// Entrada e processamento de dados		
		Scanner leia = new Scanner(System.in);
		
		for(contador = 1; contador <= 10; contador++) {
			System.out.print("Digite o " + contador + "º número: ");
			numero = leia.nextInt();
			if(numero % 2 == 0) {
				pares++;
			}
			else {
				impares++;
			}
		}
		// Saída de dados
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números impares: " + impares);
		
		leia.close();
		
	}

}
