package lacos_condicionais;

import java.util.Scanner;

public class L2_8 {

	public static void main(String[] args) {
		// Declaração de variáveis
		int operacao;
		float saldo, valor;
		
		saldo = 1000.00f;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Operação: ");
		operacao = leia.nextInt();
		
		switch(operacao) {
		// Saldo
		case 1: 
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$%.2f" , saldo);
			break;
			
		// Saque
		case 2:
			System.out.print("Valor: R$");
			valor = leia.nextFloat();
			System.out.println("Operação - Saque");
			if (valor > saldo) {
				System.out.print("Saldo Insulficiente!");
			}
			else {
				saldo = saldo - valor;
				System.out.printf("Novo saldo: R$%.2f", saldo);
			}
			break;
		
		// Depósito
		case 3:
			System.out.print("Valor: R$");
			valor = leia.nextFloat();
			System.out.println("Operação - Depósito");
			saldo = saldo + valor;
			System.out.printf("Novo saldo: R$%.2f", saldo);
			break;
			
		default:
			System.out.print("Operação Inválida!");
		}
		
		leia.close();

	}

}
