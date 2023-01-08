package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import services.ServicesTax;

public class Contract {
	
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate start = LocalDate.now();
	private LocalDate end;
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

	public Contract(int installments, int contractNumber, double contractValue) {
		this.installments = installments;
		this.contractNumber = contractNumber;
		this.contractValue = contractValue;

	}
	
	public void ContractMaker() {
		
		end = end.plusMonths(installments);
		
	}
	
	
	
	

	
}
