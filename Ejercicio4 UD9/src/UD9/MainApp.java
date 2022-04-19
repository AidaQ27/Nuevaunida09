package UD9;

public class MainApp {

	public static void main(String[] args) {
		
		//primera raiz
		Raices raiz1=new Raices(5,-1,3);
		System.out.println("Raiz 1");
		raiz1.calcular();
		raiz1.ObtenerRaices();
		raiz1.ObtenerRaiz();
		//segunda raiz
		Raices raiz2=new Raices(-4,7,2);
		System.out.println("\nRaiz 2");
		raiz2.calcular();
		raiz2.ObtenerRaices();
		raiz2.ObtenerRaiz();
		//tercera raiz
		Raices raiz3=new Raices(4,0,-4);
		System.out.println("\nRaiz 3");
		raiz3.calcular();
		raiz3.ObtenerRaices();
		raiz3.ObtenerRaiz();

	}

}
