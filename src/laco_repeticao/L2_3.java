package laco_repeticao;

import java.util.Scanner;

public class L2_3 {

	public static void main(String[] args) {
		// Declaração de variáveis
		int idade, menor21, maior50;
		
		menor21 = 0;
		maior50 = 0;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma idade: ");
		idade = leia.nextInt();
		
		// Processamento e saída de dados
		while(idade > 0) {
			if(idade < 21) {
				menor21++;
			}
			else if(idade > 50) {
				maior50++;
			}
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
		}
		
		// Saída de dados
		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);

	}

}
