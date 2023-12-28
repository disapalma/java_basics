package Aula12;

public class Mammal extends Animal{
	private String colour;
	
	@Override
	public void moving() {
		System.out.println("Running.");
		
	}

	@Override
	public void eat() {
		System.out.println("Eating.");
		
	}

	@Override
	public void sounds() {
		System.out.println("Sounds.");
		
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
