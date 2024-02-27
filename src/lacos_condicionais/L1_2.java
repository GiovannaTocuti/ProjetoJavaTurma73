package lacos_condicionais;

import java.util.Scanner;

public class L1_2 {

	public static void main(String[] args) {
		
		// Declaração de variáveis
		int num;
		boolean par, positivo;
		
		// Entrada de dados 
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		
		leia.close();
		
		// Processamento e saída de dados
		if (num % 2 == 0) {
			par = true;
			System.out.print("O número " + num + " é par");
		}
		
		else {
			par = false;
			System.out.print("O número " + num + " é ímpar");
		}
		
		if (num >= 0)  {
			positivo = true;
			System.out.print(" e positivo!");
		}
		else {
			positivo = false;
			System.out.print(" e negativo!");
		}
	}
}
