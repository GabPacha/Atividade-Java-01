package javanovoprojetoteste;

import java.util.Scanner;

public class EX002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner n1 = new Scanner (System.in);
			System.out.println("Digite um número");
			double numero1= n1.nextInt();
			
			Scanner n2 = new Scanner (System.in);
			System.out.println("Digite um número");
			double numero2= n2.nextInt();
			
			Scanner n3 = new Scanner (System.in);
			System.out.println("Digite um número");
			double numero3 = n3.nextInt();
			
			if (numero1> numero2 && numero1>numero3) {
			System.out.println("O maior número e " +numero1);
			}else if (numero2>numero1 && numero2>numero3) {
				System.out.println("O maior número e" +numero2);
			}else if	(numero3>numero2 && numero3>numero1) {
				System.out.println("O maior numero e" +numero3);
		}

	
		
	
	}

}
