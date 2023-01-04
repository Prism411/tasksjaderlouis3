package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	try {
	System.out.print("Entre com o ID da conta: ");
	Integer id = sc.nextInt();
	sc.nextLine();
	System.out.print("Entre com o nome: ");
	String nome = sc.nextLine();
	System.out.print("Entre com o Saldo: ");
	double saldo = sc.nextDouble();
	System.out.print("Entre com o limite: ");
	double limite = sc.nextDouble();
	
	Conta c = new Conta(id, nome,saldo,limite);
	
	System.out.println("Entre com o valor do saque");
	double saque = sc.nextDouble();
	
	c.withdrawl(saque);
	} catch (DomainException e1) {
		System.out.println("ERRO DOMAIN EXCEPTION");
	}
	catch (RuntimeException e2) {
		System.out.println("ERRO INESPERADO TIPO EXCEPTION");
	}
	catch (Exception e3) { 
		System.out.println("ERRO INESPERADO TIPO RUNTIMEEXCEPTION");
	}

	}
	

	}

