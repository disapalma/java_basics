package Aula5a;

public class Aula5a {

	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		c1.openAcc("1", "cp", "Disa");
		c1.deposit(20);
		c1.payMonth();
		
		ContaBanco c2 = new ContaBanco();
		c1.openAcc("2", "cc", "Lili");
	}

}
