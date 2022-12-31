package application;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<funcionario> ID = new ArrayList<>();
		System.out.println("Quantos usuarios deseja cadastrar?");
		int cad = sc.nextInt();
		int usu = 0;

		funcionario func;
		
		for (int i = 0; i < cad; i++) {
			 
			while (true) {
			try {
			System.out.printf("Informe o CODIGO %d: %n", i);
			usu = sc.nextInt(); break; } 
			catch (InputMismatchException e) {
				System.out.println("o valor digitado não é um inteiro");	
				sc.nextLine();
				}
			}
			  
			  while (ID.contains(usu)) {
			    System.out.println("insira outro valor esse ja existe");
			    usu = sc.nextInt();
			  }

			  System.out.println("Informe o nome do usuario");
			  sc.nextLine();
			  String name = sc.nextLine();
			  System.out.println("Informe o salario do usuario");
			  double salario = sc.nextDouble();
			  func= new funcionario(usu, name, salario);

			  ID.add(func);
			}

			for (funcionario e : ID) {
			System.out.println(e);
			ID.get(0);
			}

			System.out.println("em quem deseja realizar um aumento de 10%?");

			int pick = sc.nextInt();


			func = ID.stream().filter(x -> x.getId() == pick).findFirst().orElse(null);
			
			if (func == null) {
				System.out.println("id nao existe");
			}
			else {
				System.out.print("feito");
				double salary = func.getSalario();
				//list.get(pos).increaseSalary(percent);
				func.setSalario(func.AumentaSalario(salary));
			}
			System.out.println();
			System.out.println("List of employees:");
			for (funcionario e : ID) {
					System.out.println(e);
			}
		
		sc.close();
	} }
