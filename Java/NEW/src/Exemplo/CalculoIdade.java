package Exemplo;

import java.util.Scanner;

public class CalculoIdade {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);  //instanciar = criar
		
		int a; 
		int b;
		int soma;
		
		System.out.println("digite o valor de a ");
		a = leia.nextInt();
		System.out.println("digite o valor de b ");
		b = leia.nextInt();
		
		soma = a + b;
		
		System.out.println("O soma de a + b = " + soma);

	}

}
