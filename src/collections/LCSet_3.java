package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LCSet_3 {

	public static void main(String[] args) {
		// Criando as Collections Set 
		Set<Integer> numeros = new HashSet<Integer>();
		
		int elemento, indice;
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada dos elementos no Set
		for(indice = 1; indice <= 10; indice++) {
			System.out.print("Digite o " + indice + "º inteiro da lista: ");
			elemento = leia.nextInt();
			numeros.add(elemento);
		}
		
		// Criando as Collections Set 
		Iterator<Integer> iteNumeros = numeros.iterator(); 
		
		// Processamento e saída dos elementos do Set
		System.out.println("\nListar dados do Set:");
		while(iteNumeros.hasNext()) {
			System.out.println(iteNumeros.next());
		}
		
	}

}
