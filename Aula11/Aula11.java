package Aula11;

public class Aula11 {

	public static void main(String[] args) {
		Visiter v1 = new Visiter();
		v1.setName("Maria");
		v1.setAge(22);
		v1.setSex("M");
		
		System.out.println(v1.toString());
		
		Student a1 = new Student();
		a1.setName("Vi");
		a1.setAge(23);
		a1.setDegree("Biomedical Engineering");
		
		Bolsa b1 = new Bolsa();
		b1.setName("Luis");
		b1.setAge(27);
		b1.setSex("M");
		b1.setScholar(27.5f);
		b1.payTuition();
		a1.payTuition();

	}

}
