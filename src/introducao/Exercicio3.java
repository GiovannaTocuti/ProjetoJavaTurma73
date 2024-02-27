package introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Variáveis
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Salário bruto: R$ ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Adicional noturno: R$ ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Horas extras: R$ ");
		horasExtras = leia.nextFloat();
		
		System.out.print("Descontos: R$ ");
		descontos = leia.nextFloat();
		
		// Processamento
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		// Saída de dados
		System.out.printf("Salário líquido: R$ %.2f" , salarioLiquido);
		
	
	}

}
