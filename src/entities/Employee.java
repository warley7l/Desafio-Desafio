package entities;

import desafio.Char;

public class Employee {

	private String name, departament, email; 
	private Double salary;
	private Char Id;
	private Char birth_date; 
	
	public Employee() {
	}

	public Employee(String name, String departament, String email, Double salary, Char id, Char birth_date) {
		this.name = name;
		this.departament = departament;
		this.email = email;
		this.salary = salary;
		Id = id;
		this.birth_date = birth_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Char getId() {
		return Id;
	}

	public void setId(Char id) {
		Id = id;
	}

	public Char getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Char birth_date) {
		this.birth_date = birth_date;
	}
    
}
