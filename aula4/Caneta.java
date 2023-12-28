package aula4;

public class Caneta {
		private String modelo;
		private float ponta;
		private String cor;
		private boolean tampada;
		
		//METODO CONSTRUTOR - tem o mesmo nome da classe
		public Caneta(String m, String c, float p) {
			//this.modelo = m; equivalent to use of set
			//this.ponta = p; equivalent to use of set
			// this.cor = c; equivalent to use of set
			this.setModelo(m);
			this.setPonta(p);
			this.setCor(c);
			
			this.destampar();
			
		}
		
		
		
		// METODOS GETTER E SETTER
		
		public String getModelo() {
			return this.modelo;
		}
		
		public void setModelo(String m) {
			this.modelo=m;
		}
		
		public float getPonta() {
			return this.ponta;
		}
		
		public void setPonta(float p) {
			this.ponta=p;
		}
		
		public String getCor() {
			return this.cor;
		}
		
		public void setCor (String c) {
			this.cor = c;
		}

		public void tampar() {
			this.tampada = true;
		}
		

		public void destampar() {
			this.tampada = false;
		}
		
		public void status() {
			System.out.println("Cor: " + getCor());
			System.out.println("Modelo: " + this.ponta);
			System.out.println("Tem tampa? " + this.tampada);
			
		}
		
	

}
