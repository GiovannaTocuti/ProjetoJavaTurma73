package lacos_condicionais;

import java.util.Scanner;

public class L2_7 {

	public static void main(String[] args) {
		// Declaração de variáveis
		float numero1, numero2;
		int operacao;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		numero1 = leia.nextFloat();
		
		System.out.print("Digite o 2º número: ");
		numero2 = leia.nextFloat();
		
		System.out.print("Operação: ");
		operacao = leia.nextInt();
		
		leia.close();
		
		// Processamento e saída de dados
		switch (operacao) {
		
		// Soma
		case 1:
		System.out.print(numero1 + " + " + numero2 + " = "+ (numero1 + numero2));
		break;
			
		// Subtração
		case 2:
		System.out.print(numero1 + " - " + numero2 + " = "+ (numero1 - numero2));
		break;

		// Multiplicação
		case 3:
		System.out.print(numero1 + " * " + numero2 + " = "+ (numero1 * numero2));
		break;
		
		// Divisão
		case 4:
		System.out.print(numero1 + " / " + numero2 + " = "+ (numero1 / numero2));
		break;
		
		default:
		System.out.print("Operação inválida");
		
		}
	}

}
