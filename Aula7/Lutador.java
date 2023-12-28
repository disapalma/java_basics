package Aula7;

public class Lutador {
	//ATRIBUTES
	private String name;
	private String nationality;
	private int age;
	private float height;
	private float weight;
	private String category; //set by weight
	private int vict;
	private int lost;
	private int tied;
	
	//CONSTRUCTOR
	
	public Lutador(String na, int age, float he, float we, int vit, int lo, int ti) {
		this.setName(na);
		this.setAge(age);
		this.setHeight(he);
		this.setWeight(we);
		this.setVict(vit);
		this.setLost(lo);
		this.setTied(ti);
	}
	
	//GETTERS AND SETTERS
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
		//defines automatically category
		this.setCategory();
	}
	public String getCategory() {
		return category;
	}
	public void setCategory() {
		if (this.getWeight() <= 52.2) {
			System.out.println("Invalid.");
		} else if (this.getWeight() <= 70.3){
			this.category="Light";
		} else if (this.getWeight() <= 83.9) {
			this.category="Medium";
		} else if (this.getWeight() <= 120.2) {
			this.category="Heavy";
		} else {
			System.out.println("Invalid.");
		}
	}
	public int getVict() {
		return vict;
	}
	public void setVict(int vict) {
		this.vict = vict;
	}
	public int getLost() {
		return lost;
	}
	public void setLost(int lost) {
		this.lost = lost;
	}
	public int getTied() {
		return tied;
	}
	public void setTied(int tied) {
		this.tied = tied;
	}
	
	
	//methods
	
	public void show() {
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.getAge());
		System.out.println("Nationality: " + this.getNationality());
		System.out.println("Height: " + this.getHeight());
		System.out.println("Weight: " + this.getWeight());
		System.out.println("Victories: " + this.getVict());
		System.out.println("Losses: " + this.getLost());
		System.out.println("Ties: " + this.getTied());
		
	}
	
	public void status() {
		System.out.println("Name: " + this.getName());
		System.out.println("Category: " + this.getCategory());
		System.out.println("Weight: " + this.getWeight());
		System.out.println("Victories: " + this.getVict());
		System.out.println("Losses: " + this.getLost());
		System.out.println("Ties: " + this.getTied());
	
	}
	
	public void win() {
		this.setVict(this.getVict() + 1);
	}
	
	public void lose() {
		this.setLost(this.getLost() + 1);
	}
	
	public void tied() {
		this.setTied(this.getTied() + 1);
		
	}

}
