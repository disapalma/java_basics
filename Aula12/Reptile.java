package Aula12;

public class Reptile extends Animal {
	private String colour;

	@Override
	public void moving() {
		System.out.println("Crawl");
		
	}

	@Override
	public void eat() {
		System.out.println("Eating vegetables.");
		
	}

	@Override
	public void sounds() {
		System.out.println("Reptile sounds.");
		
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
