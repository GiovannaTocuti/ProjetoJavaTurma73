package introducao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Variáveis
		float salario, abono, novoSalario;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o salário: R$");
		salario = leia.nextFloat();
		
		System.out.print("Digite o abono: R$");
		abono = leia.nextFloat();
		
		// Processamento
		novoSalario = salario + abono;
		
		// Saída de dados
		DecimalFormat df = new DecimalFormat(); // Classe que formata decimais
		df.applyPattern("#,##0.00"); 
		
		System.out.print("Novo salário: R$" + df.format(novoSalario));

	}

}
