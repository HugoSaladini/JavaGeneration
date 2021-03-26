package Tarefa1;

import java.util.Scanner;

public class Exer1AnosEmDias {
		
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int ano, mes, dia,soma;
		
		System.out.println("Quantos anos você tem ?");
		ano = leia.nextInt();
		System.out.println("Quantos meses você tem ?");
		mes = leia.nextInt();
		System.out.println("Quantos dias você tem ?");
		dia = leia.nextInt();
		
		soma = ((ano * 365) + (mes*30) + (dia));
		
		System.out.println("Voce esta vivo a aproximadamente " + soma + " dias");
				
	}

}


