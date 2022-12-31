package entities;

public class funcionario {

	private String name;
	private double salario;
	private int id;
	

	public funcionario(int id, String name, double salario) {
	this.name = name;
	this.salario = salario;
	this.setId(id);
} /// teste123
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
	this.salario = salario;}
	
	public double AumentaSalario(double x) {
		double result;
		result = (x*10/100);
		return result + salario;	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
	    return "ID: " + id + ", Nome: " + name + ", Salario: " + salario;
	}


}