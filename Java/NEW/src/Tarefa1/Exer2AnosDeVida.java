package Tarefa1;

import java.util.Scanner;

public class Exer2AnosDeVida {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double anoNascimento;
		final float ANOATUAL = 2021;
		
		System.out.println("Digite o ano de nascimento :");
		anoNascimento = leia.nextInt();
		

		System.out.println("Oi sua idade aproximada � " + (ANOATUAL-anoNascimento) + " anos!!");

	}

}
