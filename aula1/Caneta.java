package aula1;

public class Caneta {
	String modelo;
	String cor;
	public float ponta;
	int carga;
	boolean comTampa;
	
	void status() {
		System.out.println("Uma caneta " + this.cor);
		System.out.println("A caneta tem " + this.ponta + " e carga " + this.carga + ".");
		System.out.println("A caneta está tampada? " + this.comTampa);
	}
	
	void rabiscar() {
		if (this.comTampa == true) {
			System.out.println("Não posso escrever.");
		} else {
			System.out.println("Olá!");
		}
	}
	
	void tampar() {
		this.comTampa = true;
		
	}
	
	void destampar() {
		this.comTampa = false;
		
	}
}
