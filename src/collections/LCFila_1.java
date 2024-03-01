package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LCFila_1 {

	public static void main(String[] args) {
		// Criação da Collection Fila
		Queue<String> clientes = new LinkedList<String>();

		String nomeCliente;
		int opcao;
		boolean continua;

		Scanner leia = new Scanner(System.in);

		continua = true;
		clientes.add(null);

		System.out.println("*****************************");
		System.out.println("1 - Adicionar Cliente na Fila");
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Retirar Cliente da Fila");
		System.out.println("0 - Sair");
		System.out.println("*****************************");
		System.out.print("\n");

		while (continua != false) {
			
			System.out.println("Entre com a opção desejada:");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				nomeCliente = leia.next();
				clientes.add(nomeCliente);
				System.out.println("Fila: ");
				System.out.println(clientes);
				System.out.println("\nCliente adicionado!\n");
				break;

			case 2:
				System.out.println("\nFila:");
				System.out.println(clientes + "\n");
				break;
				
			case 3:
				clientes.remove();
				if(clientes.isEmpty() != true) {
					System.out.println(clientes);
					System.out.println("\nO cliente foi chamado!\n");
				}
				else {
					System.out.println("\nA fila está vazia!\n");
				}

				break;
				
			case 0:
				System.out.println("\nPrograma finalizado!");
				continua = false;
				break;

			}
			
		}

	}

}
