package javanovoprojetoteste;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner n1= new Scanner (System.in);
		
		System.out.println("Insira a primeira nota:");
		double nota1=n1.nextDouble();
		
		System.out.println("Insira a segunda nota:");
		double nota2=n1.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if (media >= 7) {
			System.out.println("O aluno foi aprovado.");
		}
		else if (media <7 && media >=4) {
			System.out.println("O aluno esta de recuperacao");
		}
		else
			System.out.println("Aluno reprovado");
	}

}
