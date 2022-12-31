package application;

import java.util.Locale;
import java.util.Scanner;

import entities.conta;

public class Main {

	public static void main(String[] args) {
		conta x;
		double c=0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira Codigo");
		int d = sc.nextInt();
		
		System.out.println("Insira nome");
		String a = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Tem um saldo de saque inciial? (s/n)");
		char sn;
		sn = sc.nextLine().charAt(0);
		
		if (sn == 's') {
		System.out.println("Insira deposito");
		c = sc.nextDouble(); }

		System.out.println("Insira withdrawl");
		double b = sc.nextDouble();
		x = new conta(d, a, b, c);
		x.doDeposit();
		System.out.println("Insira deposito");
		c = sc.nextDouble(); 
		x.setDeposit(c);
		x.doDeposit();
		x.doWithdrawl();
		System.out.println(x.toString());
		sc.close();
		

	}

}
