package entities;

public class conta {
	private static double TAXA = 5;
	private static int ACCOUNT_NUMBER;
	private String name;
	private double withdrawl;
	private double deposit;
	private double balance = 0;

	//Construtores e Getters e setters
	@SuppressWarnings("static-access")
	public conta(int aCCOUNT_NUMBER, String name, double withdrawl, double deposit) {
		this.ACCOUNT_NUMBER = aCCOUNT_NUMBER;
		this.name = name;
		this.withdrawl = withdrawl;
		this.deposit = deposit;
	}


	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setWithdrawl(double withdrawl) {
		this.withdrawl = withdrawl;
	}

	public double getWithdrawl() {
		return withdrawl;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	//fim Construtores e Getters e setters
	
	public double doWithdrawl() {
		
		if (withdrawl < 0) {
			return 0;
		} else 
		return balance -=  withdrawl;
	}
	
	public double doDeposit() {
		if (deposit < 0) {
			return 0;
		} else
		deposit -= TAXA;
		
		double x;
		x = balance += deposit;
		return x;
	}
	
	public String toString() {
		String text = "";
		return text
				+ String.format("Codigo da conta : %d", ACCOUNT_NUMBER)
				+ String.format("%nNome do Usuario %s ", name)
				+ String.format("%nValor do Withdrawl %f ", withdrawl)
				+ String.format("%nValor do deposito %f ", deposit)
				+ String.format("%nDinheiro na Conta %f ", balance);
		
	}

	}
	
	
