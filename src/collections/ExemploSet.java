package collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {

		// Criando a Collection Set
		Set<String> setFrutas = new HashSet<String>();

		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		
		System.out.println("\nDados da Collecion: " + setFrutas);
		
		// For... each
		for(String fruta : setFrutas) {
			if(fruta != null) {
				System.out.println("A posição de " + fruta + " é: " + fruta.hashCode());
			}
		} 

	}

}
