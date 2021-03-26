package Tarefa1;

import java.util.Scanner;

public class Exer8ValorCarro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);				
		
		double custoFabrica, custoConsumidor;
		
		System.out.println("Qual o custo de Fabrica? ");
		custoFabrica = leia.nextDouble();

		custoConsumidor = ((custoFabrica * 0.45) + (custoFabrica*0.28)) + custoFabrica;

		System.out.println("O custo do consumidor será de R$" + custoConsumidor );

	}

}
