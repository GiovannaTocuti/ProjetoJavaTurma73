package lacos_condicionais;

import java.util.Scanner;

public class L1_4 {

	public static void main(String[] args) {
		// Declaração de variáveis
		String classificacao1, classificacao2, classificacao3;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		classificacao1 = leia.next();
		classificacao2 = leia.next();
		classificacao3 = leia.next();
		
		leia.close();
		
		// Processamento e saída de dados
		if (classificacao1.equals("vertebrado")) {
			if (classificacao2.equals("ave")) {
				if (classificacao3.equals("carnívoro")) {
					System.out.print("Águia");
				}
				else {
					System.out.print("Pomba");
				}
			}
			else {
				if (classificacao3.equals("onivoro")) {
					System.out.print("Homem");
				}
				else {
					System.out.print("Vaca");
				}
			}		
		}
		
		else {
			if (classificacao2.equals("inseto")) {
				if (classificacao3.equals("hematofago")) {
					System.out.print("Pulga");
				}
				else {
					System.out.print("Lagarta");
				}
			}
			else {
				if (classificacao3.equals("hematofago")) {
					System.out.print("Sanguessuga");
				}
				else {
					System.out.print("Minhoca");
				}
			}		
		}
	}
}
