package Exercicios1;

import java.util.Scanner;

public class SomaPares{

	public static void main(String args[]) {
		
		// Recebimento do valor de entrada.
		System.out.println("Informe até que número os pares devem ser somados:");
		Scanner sc = new Scanner(System.in);
		int numEntrada = sc.nextInt();
		sc.close();
		
		// Iniciação das variáveis auxiliares.
		int soma = 0;
		
		// Cálculo da soma dos pares.
		for (int contador = 0; contador <= numEntrada; contador++) {
			if (contador % 2 == 0) {
				soma += contador;
			}		
		}
		
		System.out.printf("\nResultado da soma dos números pares de 0 a %d é %d.", numEntrada, soma);
  
	}
  
}
