package javanovoprojetoteste;

import java.util.Scanner;


public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada=new Scanner (System.in);
		System.out.println("Digite um número");
		double pergunta=entrada.nextInt();
		System.out.println(pergunta==0 ? "Nulo" : pergunta>0 ? "Numero positivo" : "Numero negativo.");
	}

}
