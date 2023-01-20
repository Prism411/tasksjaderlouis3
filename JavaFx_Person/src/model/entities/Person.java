package model.entities;

public class Person {
	
	private String name;
	private String email;
	private Integer id;
	
	public Person(String name, String email, Integer id) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
	}
	public Person() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", id=" + id + "]";
	}
	
	
	
	

}
