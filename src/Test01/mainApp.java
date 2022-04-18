package Test01;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Electrodomestico ele = new Electrodomestico();
		Lavadora lava = new Lavadora();
		Lavadora lava2 = new Lavadora(23,23);
		Lavadora lava3 = new Lavadora(23,"hola", 's',22, 10);
		System.out.println(lava3.precioFinal());
		lava.precioFinal();
		
		
		//Television tele = new Television();
		//tele.precioFinal();
		//lava3.precioFinal();
	
	}
}

