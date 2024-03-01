package vetor_matriz;

import java.util.Scanner;

public class L1_2 {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		int indice, elemento;
		float soma, media;
		
		soma = 0.0f;
		media = 0.0f;
		
		Scanner leia = new Scanner(System.in);
		
		for(indice = 0; indice < 10; indice++) {
			System.out.print("Digite o " + (indice + 1) + "º elemento do vetor: ");
			vetor[indice] = leia.nextInt();
		}
		
		System.out.println("\nElementos nos índices ímpares:");
		
		for(indice = 0; indice < 10; indice++) {
			if(indice % 2 != 0) {
				System.out.print(vetor[indice] + " ");		
			}		
		}
		
		System.out.println("\n \nElementos pares:");
		
		for(indice = 0; indice < 10; indice++) {
			if(vetor[indice] % 2 == 0) {
				System.out.print(vetor[indice] + " ");		
			}
		}
			
		for(indice = 0; indice < 10; indice++) {
			soma = soma + vetor[indice];	
		}
		System.out.printf("\n \nSoma: %.0f" , soma);
		
		media = soma / (vetor.length);
		System.out.printf("\n \nMédia: %.2f" , media); 

	}

}
