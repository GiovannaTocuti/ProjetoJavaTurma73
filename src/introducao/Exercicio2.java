package introducao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Variáveis
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Nota 4: ");
		nota4 = leia.nextFloat();
		
		// Processamento
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		// Saída
		System.out.printf("Média final: %.2f" , mediaFinal);

	}

}
