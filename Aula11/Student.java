package Aula11;

public class Student extends Person{
	protected int mat;
	protected String degree;
	
	public void payTuition() {
		//public final void payTuition() - is not possible to override
		System.out.println("Tuition payed");
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

	@Override
	public String toString() {
		return "Student [mat=" + mat + ", degree=" + degree + "]";
	}
	
}
