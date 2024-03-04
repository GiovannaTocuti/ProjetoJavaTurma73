package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LCList_2 {

	public static void main(String[] args) {
		// Criando a Collection ArrayList
		List<Integer> numeros = new ArrayList<Integer>();
		
		int numProcurado;
		
		Scanner leia = new Scanner(System.in);
		
		// Adicionando números a lista
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		// Entrada de dados
		System.out.print("Digite o número que você deseja encontrar: ");
		numProcurado = leia.nextInt();
		
		// Verificando a existência do número
		if(numeros.contains(numProcurado) == true) {
			System.out.println("O número " + numProcurado + " está localizado na posição: " + numeros.indexOf(numProcurado));
		}
		else {
			System.out.println("O número " + numProcurado + " não foi encontrado!");
		}
		
	}

}
