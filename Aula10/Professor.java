package Aula10;

public class Professor extends Pessoa {
	private String field;
	private float salary;
	
	public void raise(float aum) {
		this.salary = aum;
		System.out.println("The salary is now " + this.getSalary() + ".");
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
