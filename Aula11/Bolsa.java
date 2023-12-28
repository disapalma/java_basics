package Aula11;

public class Bolsa extends Student {
	private float scholar;
	
	public void renovate() {
		System.out.println("Renovation" + this.getName());
	}
	
	public void payTuition() {
		System.out.println(this.getName() + " has a scholarship.");
	}

	public float getScholar() {
		return scholar;
	}

	public void setScholar(float scholar) {
		this.scholar = scholar;
	}

	@Override
	public String toString() {
		return "Bolsa [scholar=" + scholar + "]";
	}
	
	

}
