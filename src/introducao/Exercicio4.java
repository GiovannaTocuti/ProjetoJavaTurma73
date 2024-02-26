package introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		// Variáveis
		float n1, n2, n3, n4, produto12, produto34, diferenca;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Número 1: ");
		n1 = leia.nextFloat();
		
		System.out.print("Número 2: ");
		n2 = leia.nextFloat();
		
		System.out.print("Número 3: ");
		n3 = leia.nextFloat();
		
		System.out.print("Número 4: ");
		n4 = leia.nextFloat();
		
		// Processamento
		diferenca = (n1 * n2) - (n3 * n4);
		
		// Saída de dados
		System.out.print("Diferença: " + diferenca);

	}

}
