package application;

import java.text.Format;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import services.ServicesPayment;

public class Program {

	public static void main(String[] args) throws NullPointerException {
		
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);

		try {
	 System.out.print("Quantos Contratos deseja acrescentar?");
	 int n = sc.nextInt();
	 for (int i = 0; i<n; i++) {
		 System.out.print("Em quantos meses deseja terminar de pagar este contrato?");
		 int mes = sc.nextInt();
		 System.out.println("Numero do contrato: ");
		 int number = sc.nextInt();
		 System.out.print("Preço do contrato: ");
		 double price = sc.nextDouble();
		 Contract c = new Contract(mes,number,price);
		 System.out.println(c);
		 
	 }

	 } catch (NullPointerException e) {
		 System.out.println("VALOR NULO!!");
		 e.printStackTrace();

	 }catch (InputMismatchException e) {
		 System.out.println("Digite um numero!");
	
	 }
	}
	}

