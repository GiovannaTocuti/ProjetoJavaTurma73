package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LCList_1 {

	public static void main(String[] args) {
		
		// Criação da Collection ArrayList
		List<String> cores = new ArrayList<String>();
		
		int indice;
		String cor;
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de dados
		for(indice = 1; indice <= 5; indice++) {
			System.out.println("Digite a " + indice + "ª cor:");
			cor = leia.next();
			cores.add(cor);
		}
		
		leia.close();
		
		// Processamento e saída de dados
		System.out.println("\nListar todas as cores:");
		System.out.println(cores);
		
		System.out.println("\nOrdenar as cores:");
		cores.sort(null);
		System.out.println(cores);

	}

}
