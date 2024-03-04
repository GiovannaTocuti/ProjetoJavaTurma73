package metodos_Exemplo;

public class ExemploMetodo01 {

	public static void main(String[] args) {
		
		int resultado = ExemploMetodo02.somar(2, 5);
		System.out.println("O primeiro resultado é: " + resultado);
		
		System.out.println("O segundo resultado é: " + ExemploMetodo02.somar(8, 3));
		
		ExemploMetodo02.mensagem(); // Método sem retorno
		
		ExemploMetodo02.saudacao("Oi, sei lá"); // Método sem retorno

	}
	


}
