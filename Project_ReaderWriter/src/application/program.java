package application;

import entities.Product;
import services.CSVcreation;
import services.CSVedition;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

@SuppressWarnings("unused")
public class program {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println(" EXEMPLO : " + " c:\\****\\****\\**** " + "");
		System.out.print("Insira o caminho que deseja comecar o programa: ");
		String path = sc.nextLine();
		CSVcreation pathdir = new CSVcreation(path);
		String pathtext = pathdir.Creator();
		CSVedition edittext = new CSVedition(pathtext);


		
		System.out.println("Insira quantos produtos voce deseja adicionar");
		int n = sc.nextInt();
		for (int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.print("Nome do produto: ");
			String nome =sc.nextLine();
			System.out.print("Preco do produto: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade do produto: ");
			int quant = sc.nextInt();
			Product p = new Product(nome,preco,quant);
			String textcreate = p.toString();
			edittext.TextCreate(pathtext, textcreate);
			
		}
		
		} catch(IOException e) {
			System.out.println("ERROU ALGO");
			e.printStackTrace();
			
		} catch(NullPointerException e) {
			System.out.println("O caminho está Errado!");
			e.printStackTrace();
		}
	
	}

}