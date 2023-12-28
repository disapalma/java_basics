package Aula12;

public class Fish extends Animal {
	private String colour;

	@Override
	public void moving() {
		System.out.println("Swimming.");
		
	}

	@Override
	public void eat() {
		System.out.println("Substances.");
		
	}

	@Override
	public void sounds() {
		System.out.println("There's no sound");
		
	}
	
	public void releaseBubble() {
		System.out.println("Bubbles!!!");
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
