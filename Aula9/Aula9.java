package Aula9;

public class Aula9 {

	public static void main(String[] args) {
		Person p1 = new Person("Disa", 24, "f");
		Person p2 = new Person("Jes", 34, "f");
		
		Book b[] = new Book[2];
		b[0] = new Book("O Adeus", p1, 200, p2);
		b[1] = new Book("123", p2, 378, p1);
		
		b[0].details();
		b[0].forward();
	}

}
