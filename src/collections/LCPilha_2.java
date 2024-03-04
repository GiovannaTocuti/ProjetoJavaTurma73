package collections;

import java.util.Scanner;
import java.util.Stack;

public class LCPilha_2 {

	public static void main(String[] args) {
		// Criação da Collection Stack
		Stack<String> livros = new Stack<String>();
		
		int opcao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("*****************************");
		System.out.println("1 - Adicionar Livro na Pilha");
		System.out.println("2 - Listar todos os Livros");
		System.out.println("3 - Retirar Livro da Pilha");
		System.out.println("0 - Sair");
		System.out.println("*****************************");
		System.out.print("\n");
		
		System.out.print("Entre com a opção desejada: ");
		opcao = leia.nextInt();
		
		while(opcao != 0) {
			
			switch(opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				leia.skip("\\R?");
				livros.push(leia.nextLine());
				System.out.println("\nPilha:");
				System.out.println(livros);
				System.out.println("Livro adicionado!");
				break;
				
			case 2:
				System.out.println("Lista de Livros na Pilha:");
				System.out.println(livros);
				break;
				
			case 3:
				if(livros.isEmpty() != true) {
					livros.pop();
					System.out.println("Lista de Livros na Pilha:");
					System.out.println(livros);
				}
				else {
					System.out.println("\nA Pilha está vazia!");
				}
				break;
			
			}
			System.out.print("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();
		}
		
		System.out.println("\nPrograma Finalizado!");
		
		
	}

}
