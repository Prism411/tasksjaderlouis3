package services;

public class ServicesPayment implements ServicesTax  {

	public double paypaltax(int parcelas, double valor) {
		
		double ValuePerMonth = valor/parcelas; 
		
		double payment = ValuePerMonth ;
		double tax = 0.01;
		double paymentTax = 0.02;
		for (int i = 0; i<parcelas; i++) {
		payment = ValuePerMonth + ((tax * ValuePerMonth )* i);
		ValuePerMonth = payment;
		payment = ValuePerMonth + (paymentTax*ValuePerMonth);
		}
		
		return payment;
		
		

	}


}


