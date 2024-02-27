package lacos_condicionais;

import java.util.Scanner;

public class Interativo {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite um valor para x: ");
		x = leia.nextInt();
		
		System.out.println("Digite um valor para y: ");
		y = leia.nextInt();
		
		leia.close();
		
		if(x > y) {
			System.out.println("x maior que y");
		}
		else if (x == y) {
			System.out.println("x é iagual a y");
		}
		else {
			System.out.println("x é menor que y");
		}
		
	}
}
