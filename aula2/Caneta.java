package aula2;


public class Caneta {
	public String modelo;
	private String cor;
	private float ponta;
	protected int carga;
	private boolean comTampa;
	
	//metodos têm parêntesis
	//atributos não têm parêntesis
	
	public void status() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta + " e carga: " + this.carga + ".");
		System.out.println("A caneta está tampada? " + this.comTampa);
		System.out.println("Modelo: " + this.modelo);
	}
	
	public void rabiscar() {
		if (this.comTampa == true) {
			System.out.println("Não posso escrever.");
		} else {
			System.out.println("Olá!");
		}
	}
	
	public void tampar() {
		this.comTampa = true;
		
	}
	
	public void destampar() {
		this.comTampa = false;
		
	}
}
