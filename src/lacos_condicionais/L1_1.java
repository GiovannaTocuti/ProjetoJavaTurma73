package lacos_condicionais;
import java.util.Scanner;
public class L1_1 {
	public static void main(String[] args) {		
		// Declaração de variáveis
		int a, b, c, soma;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		a = leia.nextInt();
		
		System.out.print("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.print("Digite o número C: ");
		c = leia.nextInt();
		
		leia.close();
		
		// Processamento e saída de dados
		soma = a + b;
		
		// Soma maior do que C
		if (soma > c) {
			System.out.println(a + " + " + b + " = " + soma + " > " + c);
			System.out.print("A soma de A + B é maior do que C");
		}
		
		// Soma menor do que C
		else if (soma < c) {
			System.out.println(a + " + " + b + " = " + soma + " < " + c);
			System.out.print("A soma de A + B é menor do que C");
		}
		
		// Soma igual a C
		else {
			System.out.println(a + " + " + b + " = " + soma + " = " + c);
			System.out.print("A soma de A + B é igual a C");
		}
	}
}
