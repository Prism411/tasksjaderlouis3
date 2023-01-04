package entities;

import exceptions.DomainException;

public class Conta {

	private static Integer number;
	private String holder;
	private double balance;
	private double limit;
	
	public Conta(Integer number, String holder, double balance, double limit) {
		super();
		Conta.number = number;
		this.holder = holder;
		this.balance = balance;
		this.limit = limit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		Conta.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	public void withdrawl(double amount) {
		if ((amount > balance) || (amount > limit)){
			System.out.println("deu erro jader");
			throw new DomainException("Erro");
		} else {
			
			balance -= amount;
			System.out.println("Valor depois do withdrawl: " + balance);
			
		}
		
	}
	
	
}
