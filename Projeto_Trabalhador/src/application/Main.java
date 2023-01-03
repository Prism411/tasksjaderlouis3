package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.contrato;
import entities.trabalhador;
import entities.enums.LevelWorker;

public class Main {

	public static void main(String[] args){
		
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat sdf2= new SimpleDateFormat("MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o departamento");
		String departamento = sc.nextLine();
		
		System.out.println("Insira os dados do trabalhador");
		System.out.println("Entre com o nome do trabalhador");
		String name = sc.nextLine();
		
		System.out.println("Entre com o level do trabalhador");
		System.out.println("Entre Junior, Mid_Level ou Senior");
		
		String level_worker = null;
		Boolean sucess = false;
		
		while (sucess != true) {
			level_worker = sc.nextLine(); 
			level_worker = level_worker.toUpperCase();
			System.out.println(level_worker);
		try { LevelWorker.valueOf(level_worker);
			sucess = true;
		} catch (IllegalArgumentException e) {
		    System.out.println("Nível inválido. Por favor, digite um nível válido.");
		    sucess = false;
		}}
		
		System.out.println("Informe o Salario");
		double salary = sc.nextDouble();
		
		
		@SuppressWarnings("unused")
		trabalhador worker = new trabalhador(name, LevelWorker.valueOf(level_worker), salary, new Departamento(departamento));
		

		
		//Inicio do setContrato
		System.out.println("Quantos contratos serão feitos?");
		int n = sc.nextInt();		
		sc.nextLine();
		Date data_92 = null;
		for (int i = 0; i < n; i++) {
			System.out.printf("%nEntre com o contrato %d%n", i);
			boolean sucess2 = false;
	
			while (sucess2 != true) {
		
				   System.out.println("Insira a data (DD/MM/YYYY)");
				   String date = sc.nextLine();
				   try {
					   sdf.setLenient(false);
				     @SuppressWarnings("unused")
					Date data = sdf.parse(date); 				     
				      sucess2 = true;
				      data_92 = data;
				   } catch (ParseException e) {
				      System.out.println("Data Invalida!");
				      sucess2 = false;
				   }}
			System.out.println("Entre com o salario por hora do contrato");
			double salary_h = sc.nextDouble();
			System.out.println("A duração do contrato por horas ao dia");
			Integer horas_d = sc.nextInt();
			@SuppressWarnings("unused")
			contrato contract = new contrato(data_92, salary_h, horas_d);
			worker.addContrato(contract);
		}
		

		/*while (sucess != true) {
			
				System.out.println("Insira o mês e o ano (MM/YYYY):");;
				String dateString = sc.nextLine();
			   try {
				   sdf.setLenient(false);
				   date_f = sdf2.parse(dateString);
			      sucess = true;
			   } catch (ParseException e) {
			      System.out.println("Data Invalida!");
			      sucess = false;
			   }}
		
		*/
	System.out.println("Insira o ano");
	int ano = sc.nextInt();
	System.out.println("Insira o mes");
	int mes = sc.nextInt();
		worker.Income(ano, mes);
	
	System.out.println(worker.Income(ano,mes));
	
	

		
		sc.close();	
		
	}
}
		// fim do setContrato
	

	
	
