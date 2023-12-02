package javanovoprojetoteste;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Entrada= new Scanner (System.in);

	System.out.println("Digite 'F' para Feminino e 'M' Para Masculino");
	String resposta=Entrada.next();
	
	if (resposta.equals("F") || resposta.equals("f")) {
		System.out.println("Feminino.");
	}
	else if (resposta.equals("M") || resposta.equals("m")) {
		System.out.println("Masculino.");
	}
	else
		System.out.println("Resposta inválida.");
	}
}
