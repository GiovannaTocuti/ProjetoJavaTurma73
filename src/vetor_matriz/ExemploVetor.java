package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		String cachorros[] = new String[3]; 
		
		Scanner leia = new Scanner(System.in);
		int indice;
		
		for(indice = 0; indice < 3; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º nome: ");
			cachorros[indice] = leia.nextLine();
		}
		
		for(indice = 0; indice < 3; indice++) {
			System.out.println("cachorro [" + indice + "]: " + cachorros[indice]);
			
		}

	}

}
