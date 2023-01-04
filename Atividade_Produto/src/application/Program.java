package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Boolean sucess = false;
		Locale.setDefault(Locale.US);
		List<Product>Produto = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o numero de produtos: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("%nProduto %d: %n", i);
			System.out.println("O produto é Comum, usado ou Importado? (c/u/i)");
			char resposta = ' ';
			while (sucess != true) {
			String respostaString = sc.nextLine();
			resposta = Character.toLowerCase(respostaString.charAt(0));
			if ((respostaString.length() > 0) && (resposta == 'c') || (resposta == 'u') || (resposta == 'i') ) {
			    resposta = Character.toLowerCase(respostaString.charAt(0));
			    System.out.println("sucesso!");
			    sucess = true;
			} else {
				System.out.println("invalido!");
			} }
			sucess = false;
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.println("Preco: ");
			double preco = sc.nextDouble();
			Date date = null;

			switch (resposta) {

			case 'c':
				Produto.add(new Product(name, preco)); 

				break;

			case 'u':

				System.out.print("Insira a data: (dd/MM/yyyy)");
				String data = sc.nextLine();

				while (sucess != true) {
					try {
						date = sdf.parse(data);
						sucess = true;
					} catch (ParseException e) {
						sucess = false;
						System.out.println("Invalido!");
					}
				}
				Produto.add(new UsedProduct(name, preco, date));
				break;

			case 'i':
				System.out.print("Insira a taxa: ");
				double taxa = sc.nextDouble();
				Produto.add(new ImportedProduct(name, preco, taxa));
				break;

			}
			}
		
			
		
		for (Product c : Produto) {
			System.out.println(c.priceTag());
		sc.close();

		} 
	} }
	


