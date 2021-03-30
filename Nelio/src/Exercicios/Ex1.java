package Exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int valor1, valor2,soma;
		
		System.out.println("Declarar valores 1 e 2: ");
		valor1 = leia.nextInt();
		valor2 = leia.nextInt();
		
		soma = valor1 + valor2;
		
		System.out.println("A soma dos valores é: "+ soma);
		

	}

}
	