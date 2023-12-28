package aula4;

public class Aula4 {

	public static void main(String[] args) {
		Caneta c1= new Caneta("BIC", "vermelho", 0.5f);
		
		//c1.setModelo("BIC"); //equivalente a c1.modelo="BIC" difere nas privacidades dos atributos
		//c1.setPonta(0.5f);
		c1.status();
		
		Caneta c2 = new Caneta("KK", "amarela", 0.3f);
		c2.status();

	}

}
