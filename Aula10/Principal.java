package Aula10;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Student p2 = new Student();
		Professor p3 = new Professor();
		Worker p4 = new Worker();
		
		p1.setName("Pedro"); //heranca de implementação. heranca pobre
		p2.setName("Claudio"); //heranla de diferenca, nao e pobre
		p3.setName("Maria");
		p4.setName("Jose");
		
		p1.setSex("M");
		p2.setSex("M");
		p3.setSex("F");
		p4.setSex("F");
		
		p2.setDegree("Law");
		p3.setField("Robotics");
		p1.setAge(30);
		
		p3.raise(300);

		System.out.println(p1.toString());
		
		
		
	}

}
