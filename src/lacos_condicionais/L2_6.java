package lacos_condicionais;

import java.util.Scanner;

public class L2_6 {

	public static void main(String[] args) {
		// Declaração de variáveis
		String colaborador;
		int cargo;
		float salario;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nome do colaborador: ");
		colaborador = leia.nextLine();
		
		System.out.print("Cargo: ");
		cargo = leia.nextInt();
		
		System.out.print("Salário: R$");
		salario = leia.nextFloat();
		
		leia.close();
		
		// Processamento e saída de dados
		
		System.out.println("Nome do colaborador: " + colaborador);
		
		switch(cargo) {
		case 1:
			salario = salario + (0.1f * salario);
			System.out.println("Cargo: Gerente");
			break;
			
		case 2:
			salario = salario + (0.07f * salario);
			System.out.println("Cargo: Vendedor");
			break;
			
		case 3:
			salario = salario + (0.09f * salario);
			System.out.println("Cargo: Supervisor");
			break;
			
		case 4:
			salario = salario + (0.06f * salario);
			System.out.println("Cargo: Motorista");
			break;
			
		case 5:
			salario = salario + (0.05f * salario);
			System.out.println("Cargo: Estoquista");
			break;
			
		case 6:
			salario = salario + (0.08f * salario);
			System.out.println("Cargo: Técnico de TI");
			break;
		
		default: 
			System.out.print("Digite código de cargo válido (inteiro de 1 a 6)");
		}
		
		System.out.printf("Salário atualizado: R$%.2f" , salario);
	}
}
