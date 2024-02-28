package laco_repeticao;

import java.util.Scanner;

public class L2_4 {

	public static void main(String[] args) {
		// Declaraçaõ de variáveis
		int idade, genero, desenvolvedora, contadorMulherFront, contadorHomemMob40, contadorNBin30, contadorBackend, total;
		String pergunta;
		float mediaIdade, somaIdade;
		
		contadorMulherFront = 0;
		contadorHomemMob40 =0;
		contadorNBin30 = 0;
		contadorBackend = 0;
		total = 0;
		somaIdade = 0.00f;
		pergunta = "s";
		mediaIdade = 0.00f;
		
		
		// Entrada e processamento de dados
		Scanner leia = new Scanner(System.in);
		
		while(!pergunta.equals("n")) {
			System.out.print("Idade: ");
			idade = leia.nextInt();
			
			System.out.print("Identidade de Gênero: ");
			genero = leia.nextInt();
			
			System.out.print("Pessoa Desenvolvedora: ");
			desenvolvedora = leia.nextInt();
			
			switch(genero) {
			case 1: // Mulher Cis
				if(desenvolvedora == 2) {
					contadorMulherFront++;				
				}			
				break;
				
			case 2: // Homem Cis
				if(desenvolvedora == 3 && idade > 40) {
					contadorHomemMob40++;				
				}			
				break;
				
			case 3: // Não Binário
				if(desenvolvedora == 4 && idade < 30) {
					contadorNBin30++;				
				}	
				break;
				
			case 4: // Mulher Trans
				if(desenvolvedora == 2) {
					contadorMulherFront++;				
				}
				break;
				
			case 5: // Homem Trans
				if(desenvolvedora == 3 && idade > 40) {
					contadorHomemMob40++;				
				}	
				break;
				
			case 6: // Outros			
				break;		
			}
			
			if(desenvolvedora == 1) {
				contadorBackend++;		
			}
			
			total++;
			somaIdade = somaIdade + idade;
			
			System.out.print("Deseja continuar? (s/n) ");
			pergunta = leia.next();
			
		}
		
		mediaIdade = somaIdade/total;
		
		// Saída de dados
		System.out.println("Total de pessoas desenvolvedoras Backend: " + contadorBackend + "\n");
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + contadorMulherFront + "\n");
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + contadorHomemMob40 + "\n");
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + contadorNBin30 + "\n");
		System.out.println("O número total de pessoas que responderam à pesquisa: " + total + "\n");
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f " , mediaIdade);
		
		leia.close();

	}

}
