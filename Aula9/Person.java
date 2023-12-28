package Aula9;

public class Person {
	public String name;
	public int age;
	public String sex;
	
	//CONSTRUCT
	public Person(String na, int age, String sex) {
		this.name = na;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	public void birthday() {
		this.setAge(this.getAge() + 1);
		System.out.println(this.getName() + " is now " + this.getAge() + "years old.");
	}
	
	
}
