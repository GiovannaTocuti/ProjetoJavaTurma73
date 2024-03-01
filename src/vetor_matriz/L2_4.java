package vetor_matriz;

import java.util.Scanner;

public class L2_4 {

	public static void main(String[] args) {
		float notas[][] = new float[10][4];
		float medias[] = new float[10];
		float soma, mediaAlune;
		int linha, coluna;
		
		mediaAlune = 0.0f;
		soma = 0.0f;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha = 0; linha < 10; linha++) {
			System.out.println("Digite as notas do " + (linha + 1) + "º alune:");
			for(coluna = 0; coluna < 4; coluna++) {
				System.out.print((coluna + 1) + "º Bimestre: ");
				notas[linha][coluna] = leia.nextFloat();			
			}
		}
		
		for(linha = 0; linha < 10; linha++) {
			for(coluna = 0; coluna < 4; coluna++) {
				soma = soma + notas[linha][coluna];
			}
			mediaAlune = soma / 4.0f;
			medias[linha] = mediaAlune;
			soma = 0;		
		}
		
		System.out.println("");
		
		for(linha = 0; linha < 10; linha++) {
			System.out.printf("Média do " + (linha + 1) + "º alune: %.1f " , (medias[linha]));
			System.out.println("");
		}
		
	}

}
