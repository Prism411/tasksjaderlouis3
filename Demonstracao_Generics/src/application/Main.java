package application;
import java.util.Scanner;

import services.PrintService;

public class Main {

	public static void main(String[] args) {
	
		
		// As Generics Basicamente servem para fazer você evitar trabalho e ajudar na correção do codigo
		// pois você não precisaria mudar nada nos serviços para funcionar, apenas troca o PrintService<XXXXXX> 
		// e coloca o tipo de lista que voce quer
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Quantos Valores?");
		int n= sc.nextInt();
		PrintService<Integer> ps = new PrintService();
		for (int i = 0; i < n; i++) {
			System.out.print("Entre com o numero");
			int numero = sc.nextInt();
			ps.addValue(numero);
		}

		System.out.println(ps.first());
		sc.close();

	}

}
