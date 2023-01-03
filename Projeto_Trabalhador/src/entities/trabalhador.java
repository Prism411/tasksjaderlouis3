package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.LevelWorker;

public class trabalhador {
	
	private String name;  // nome do trabalhador
	private LevelWorker level;  // O nivel de emprego do trabalhador
	private double salary; // O salario do trabalhador
	private List<contrato> contract = new ArrayList<>(); // A lista que possui os contratos do trabalhador
	private Departamento department; // String que diz qual é o departamento do trabalhador
	contrato contracto;
	
	public trabalhador(String name, LevelWorker level, double salary, Departamento department) {
		this.name = name;
		this.level = level;
		this.salary = salary;
		this.department = department;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLevelWorker(LevelWorker level) {
		this.level = level;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setDepartment(Departamento department) {
		this.department = department;	
	}
	
	
	public String getName() {
		return name;
	}
	
	public Departamento getDepartment() {
		return department;
	}
	
	public LevelWorker getLevel() {
		return level;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void addContrato(contrato contracto) {
		contract.add(contracto);
	}
	
	public void removeContrato(contrato contracto) {
		contract.remove(contracto);
	}
	
	public double Income(int year, int month) {
		double sum = salary;
		Calendar cal = Calendar.getInstance();
		for (contrato c : contract) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year &&  month == c_month ) {
			sum += c.Valor_Total();
			}

		}
		return sum;
	}
}
	
