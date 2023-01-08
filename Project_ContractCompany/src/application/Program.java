package application;

import java.text.Format;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import services.ServicesPayment;

public class Program {

	public static void main(String[] args) {
		
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);

	 System.out.print("Quantos Contratos deseja acrescentar?");
	 int n = sc.nextInt();
	 for (int i = 0; i<n; i++) {
		 System.out.println("Em quantos meses deseja terminar de pagar este contrato?");
		 int mes = sc.nextInt();
		 System.out.println("Numero do contrato: ");
		 int number = sc.nextInt();
		 System.out.println("Preço do contrato: ");
		 double price = sc.nextDouble();
		 Contract c = new Contract(mes,number,price);
		 
	 }


	}

}
