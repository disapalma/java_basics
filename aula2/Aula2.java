package aula2;

public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta c1 = new Caneta();
		c1.modelo = "bic";
		c1.cor = "preto";
		//c1.ponta = 0.5f;
		c1.carga = 80; //funciona porque está dentro da classe
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
	}

}
