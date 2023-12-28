package Aula10;

public class Student extends Pessoa {
	private int mat;
	private String degree;
	
	public void cancelMat() {
		System.out.println("Degree canceled.");
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	
	
}
