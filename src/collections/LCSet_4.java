package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LCSet_4 {

	public static void main(String[] args) {
		// Criando a Collection Set
		Set<Integer> numeros = new HashSet<Integer>();
		
		int numProcurado;
		
		Scanner leia = new Scanner(System.in);
		
		// Adicionando os Objetos na Collection Set
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
		
		// Número procurado
		System.out.print("Digite o número que você deseja encontrar: ");
		numProcurado = leia.nextInt();
		
		if(numeros.contains(numProcurado) == true) {
			System.out.println("O número " + numProcurado + " foi encontrado!");
		}
		else {
			System.out.println("O número " + numProcurado + " não foi encontrado!");
		}

	}

}
