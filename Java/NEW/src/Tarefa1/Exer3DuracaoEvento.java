package Tarefa1;

import java.util.Scanner;

public class Exer3DuracaoEvento {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);		
		
		int evento;

		System.out.println("Quantos segundos durou o evento?");
		evento = leia.nextInt();
		
		System.out.println("Hora " + (evento/3600) + ", Minutos " + (evento%3600)/60 + ", Segundos " + (evento%3600)%60);
		
	}

}
