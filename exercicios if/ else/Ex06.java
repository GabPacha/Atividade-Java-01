package javanovoprojetoteste;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTelefone1= new Scanner (System.in);
		Scanner localDoCrime1= new Scanner (System.in);
		Scanner moraPerto1= new Scanner (System.in);
		Scanner divida1= new Scanner (System.in);
		Scanner trabalhouComVitima1= new Scanner (System.in);
		int totalRespostasSim=0;
		int totalRespostasNao=0;
		System.out.println("Responda 1 para sim e 2 para não.");
		System.out.println("Telefonou para a vítima?");
		int telefone = entradaTelefone1.nextInt();
		System.out.println(telefone);
		if (telefone == 1) {
			totalRespostasSim=totalRespostasSim + 1;
		
		}
		if (telefone > 2) {
			System.out.println("Número Inválido.");
		}
		
		System.out.println("Esteve no local do crime? ");
		int localDoCrime= localDoCrime1.nextInt();
		System.out.println(localDoCrime);
		if (localDoCrime==1) {
			totalRespostasSim=totalRespostasSim + 1;
		}
		if (localDoCrime >2) {
			System.out.println("Número Inválido.");
		}
		System.out.println("Mora perto da vítima?");
		int moraPerto= moraPerto1.nextInt()	;
		System.out.println(moraPerto);
		if (moraPerto==1) {
			totalRespostasSim= totalRespostasSim + 1;
		}
		if (moraPerto >2) {
			System.out.println("Número Inválido.");
		}
		
		System.out.println("Devia para a vítima?");
		int divida = divida1.nextInt();
		System.out.println(divida);
		if (divida==1) {
			totalRespostasSim = totalRespostasSim + 1;
		}
		if (divida > 2) {
			System.out.println("Número Inválido.");
		}
		
		System.out.println("Já trabalhou com a vítima?");
		int trabalhouComVitima= trabalhouComVitima1.nextInt();
		System.out.println(trabalhouComVitima);
		if (trabalhouComVitima == 1) {
			totalRespostasSim = totalRespostasSim + 1;
		}
		if (trabalhouComVitima > 2) {
			System.out.println("Número Inválido.");
		}
		
		
	
		if (totalRespostasSim== 2) {
			System.out.println("Você é suspeito.");
		}
		if (totalRespostasSim > 2  && totalRespostasSim<5 ) {
			System.out.println("Você é cúmplice.");
		}
		if (totalRespostasSim==5) {
			System.out.println("ASSASSINO!");
		}
			
	}
	

}
