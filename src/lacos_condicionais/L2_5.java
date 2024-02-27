package lacos_condicionais;
import java.util.Scanner;
public class L2_5 {
	public static void main(String[] args) {
		// Declação de variáveis
		int codigo, quantidade;
		float valorTotal;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Código do Produto: ");
		codigo = leia.nextInt();
		
		System.out.print("Quantidade: ");	
		quantidade = leia.nextInt();
		
		leia.close();
		
		// Processamento e saída de dados
		switch(codigo) {
		
		case 1:
			valorTotal = quantidade * 10;
			System.out.println("Produto: Cachorro Quente");
			System.out.printf("Valor total: R$%.2f" , valorTotal);
			break;
			
		case 2:
			valorTotal = quantidade * 15;
			System.out.println("Produto: X-Salada");
			System.out.printf("Valor total: R$%.2f" , valorTotal);
			break;
			
		case 3:
			valorTotal = quantidade * 18;
			System.out.println("Produto: X-Bacon");
			System.out.printf("Valor total: R$%.2f" , valorTotal);
			break;
			
		case 4:
			valorTotal = quantidade * 12;
			System.out.println("Produto: Bauru");
			System.out.printf("Valor total: R$%.2f" , valorTotal);
			break;
			
		case 5:
			valorTotal = quantidade * 8;
			System.out.println("Produto: Refrigerante");
			System.out.printf("Valor total: R$%.2f" , valorTotal);
			break;
			
		case 6:
			valorTotal = quantidade * 13;
			System.out.println("Produto: Suco de laranja");
			System.out.printf("Valor total: R$%.2f" , valorTotal);
			break;	
			
		default:
			System.out.println("Digite um código válido (inteiro de 1 a 6)");
		}
	}
}
