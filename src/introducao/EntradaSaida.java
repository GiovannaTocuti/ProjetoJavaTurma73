package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variáveis
		String nome;
		int idade;
		
		// Entrada de Dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Insira o seu nome: ");
		nome = leia.next();
		
		System.out.print("Insira a sua idade: ");
		idade = leia.nextInt();
		
		
		// Saída de Dados
		System.out.println("Bom dia, " + nome+ "!");
		System.out.println("A sua idade é " + idade + " anos.");

	}

}
