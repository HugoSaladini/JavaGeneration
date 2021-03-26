package Tarefa1;

import java.util.Scanner;

public class Exer4EquacNumero {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, r, s;
		
		System.out.println("Determine o valor de A: ");
		a = leia.nextInt();
		System.out.println("Determine o valor de B: ");
		b = leia.nextInt();
		System.out.println("Determine o valor de C: ");
		c = leia.nextInt();
		
		r = (a + b) * 2;
		s = (b + c) * 2;
		d = (r + s) / 2;
		
		System.out.println("Resultado da equanção soliciada: " + d);
		
	}

}
