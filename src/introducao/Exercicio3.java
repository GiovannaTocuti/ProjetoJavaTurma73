package introducao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Variáveis
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		// leia.useLocale(Locale.US); // Coloca o "." como separador
		
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
		DecimalFormat df = new DecimalFormat(); // Classe que formata decimais
		df.applyPattern("#,##0.00"); 
		
		System.out.print("Salário líquido: R$" + df.format(salarioLiquido));
		
		

	}

}
