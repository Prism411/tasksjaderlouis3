package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import services.ServicesPayment;
import services.ServicesTax;

public class Contract {
	
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate start = LocalDate.now();
	private LocalDate end = start;
	private int installments; // ESSAS SÃO AS PARCELAS 
	private ServicesTax tax;
	private int contractNumber;
	private double contractValue;

	//-------------------------------------------- Getters
	public LocalDate getStart() {
		return start;
	}
	public LocalDate getEnd() {
		return end;
	}
	public int getInstallments() {
		return installments;
	}
	public ServicesTax getTax() {
		return tax;
	}
	//-------------------------------------------- Getters

	public Contract(int installments, int contractNumber, double contractValue) throws NullPointerException{
		this.installments = installments;
		this.contractNumber = contractNumber;
		this.contractValue = contractValue;
		

	}
	
	@SuppressWarnings("null")
	public double ContractMaker() {
		end = end.plusMonths(installments); //retorna a data final do contrato
		 ServicesTax st = new ServicesPayment();
		double ContractValueEnd = st.paypaltax(installments, contractValue);

		return ContractValueEnd;
	}
	
	@Override
	
	public String toString() {
		ContractMaker();
		return  "start=" + start.format(fmt) + ", end=" + end.format(fmt) + ", installments=" + installments
				+", contractNumber=" + contractNumber + ", contractValue=" + contractValue + "ContractValueEnd =" + ContractMaker() + "]";
	}
	
	
	
	

	
}
