package javanovoprojetoteste;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero =  new Scanner (System.in);
		System.out.println("Digite o numero correspondente ao dia da semana:");
		double numerosemana=numero.nextInt();
		
		if (numerosemana==1) {
			System.out.println("Domingo");
		}
		else if (numerosemana==2) {
			System.out.println("Segunda");
			
		}
		else if (numerosemana==3) {
			System.out.println("Terça");
			
		}
		else if (numerosemana==4) {
			System.out.println("Quarta");
			
		}
		else if (numerosemana==5) {
			System.out.println("Quinta");
			
		}
		else if (numerosemana==6) {
			System.out.println("Sexta");
			
		}
		else if (numerosemana==7) {
			System.out.println("Sabado");
			
		}
		else
			System.out.println("Numero invalido.");		
	}

}
