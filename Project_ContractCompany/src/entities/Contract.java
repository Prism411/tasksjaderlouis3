package entities;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import services.ServicesPayment;
import services.ServicesTax;
import services.ServicesWriter;

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

	public Contract(int installments, int contractNumber, double contractValue) throws IOException{
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
	
	public void ContractSaver() throws IOException {
		String txt = ("start=" + start.format(fmt) + ", end= " + end.format(fmt) + ", installments= " + installments + ", contractNumber= " + contractNumber + "Contract Value End ="+ ContractMaker()+ 
				"Contract Value = " + contractValue);
		ServicesWriter sw = new ServicesWriter(txt);

		
	}
	
	@Override
	
	public String toString() {
	
		return  "start=" + start.format(fmt) + ", end=" + end.plusMonths(installments).format(fmt) + ", installments=" + installments
				+", contractNumber=" + contractNumber + ", contractValue=" + contractValue + "ContractValueEnd =" + ContractMaker() + "]";
	}
	
	
	
	

	
}
