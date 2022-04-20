package Test04;

public class mainApp {

	public static void main(String[] args) {
		
		//primera raiz
		Raices raiz1=new Raices(4,5,3);
		System.out.println("Raiz 1");
		raiz1.calcular();
		raiz1.obtenerRaices();
		raiz1.obtenerRaiz();
		//segunda raiz
		Raices raiz2=new Raices(-4,7,2);
		System.out.println("\nRaiz 2");
		raiz2.calcular();
		raiz2.obtenerRaices();
		raiz2.obtenerRaiz();
		//tercera raiz
		Raices raiz3=new Raices(4,0,-4);
		System.out.println("\nRaiz 3");
		raiz3.calcular();
		raiz3.obtenerRaices();
		raiz3.obtenerRaiz();

	}

}
