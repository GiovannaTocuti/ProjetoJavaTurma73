package laco_repeticao;

import java.util.Scanner;

public class L1_1 {

	public static void main(String[] args) {
		// Declaração de variáveis
		int primeiroNumero, ultimoNumero, auxiliar;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número do intervalo: ");
		primeiroNumero = leia.nextInt();
		
		System.out.print("Digite o último número do intervalo: ");
		ultimoNumero = leia.nextInt();
		
		leia.close();
		
		// Processamento de dados
		if(ultimoNumero > primeiroNumero) {
			
			System.out.println("No intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");
			
			for(auxiliar = primeiroNumero; auxiliar <= ultimoNumero; auxiliar++) {
				if((auxiliar % 3 == 0) && (auxiliar % 5 == 0)) {
					System.out.println(auxiliar + " é múltiplo de 3 e 5");
				}
			}
		}
		else {
			System.out.print("Intervalo inválido!");
		}
	}
}
