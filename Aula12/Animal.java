package Aula12;

public abstract class Animal {
	protected int weight;
	protected int age;
	protected int members;
	
	public abstract void moving();
	public abstract void eat();
	public abstract void sounds();
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMembers() {
		return members;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	
	
}
