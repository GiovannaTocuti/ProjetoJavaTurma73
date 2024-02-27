package lacos_condicionais;

import java.util.Scanner;

public class L1_3 {

	public static void main(String[] args) {
		// Declaraçaõ de variáveis
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.print("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.print("Primeira doaçaõ de sangue? ");
		primeiraDoacao = leia.nextBoolean();
		
		leia.close();
		
		// Processamento e saída de dados
		if (idade >= 18 && idade < 69) {
			if (idade <= 60) {
				System.out.print(nome + " está apto/a para doar sangue!");
			}
			else {
				if (primeiraDoacao == false) {
					System.out.print(nome + " está apto/a para doar sangue!");				
				}
				else {
					System.out.print(nome + " não está apto/a para doar sangue!");
				}
			}			
		}
		else {
			System.out.print(nome + " não está apto/a para doar sangue!");
		}
	}
}
