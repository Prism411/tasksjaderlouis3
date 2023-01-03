package entities;

import java.util.Date;

public class contrato {
	private Date date; //data de criacao do contrato
	private double salary_h; //Salario por hora do trabalhador
	private Integer hours; //horas do dia que o trabalhador trabalha.
	/**
	 * @param date
	 * @param salary_h
	 * @param hours
	 */
	public contrato(Date date, double salary_h, Integer hours) {
		this.date = date;
		this.salary_h = salary_h;
		this.hours = hours;
	}
	
	public double Valor_Total() {
		return salary_h * hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}