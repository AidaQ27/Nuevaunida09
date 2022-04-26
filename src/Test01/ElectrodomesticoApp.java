package Test01;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CREA UN ARRAY DE 10 POSICIONES
		Electrodomestico listaElectrodomestico[] = new Electrodomestico[10];
		
		// Asigna a cada posicion un objeto de las clases anteriores con los valores que desees.
		listaElectrodomestico[0] = new Lavadora(50, 25);
		listaElectrodomestico[1] = new Lavadora(550, 12);
		listaElectrodomestico[2] = new Lavadora (560, "rojo", 'A', 32.02, 22);
		listaElectrodomestico[3] = new Lavadora (235, "azul", 'B', 35.03, 12);
		listaElectrodomestico[4] = new Lavadora(540, 15);
		listaElectrodomestico[5] = new Lavadora (580, "rojo", 'A', 16, 22);
		listaElectrodomestico[6] = new Lavadora (695, "azul", 'B', 15, 12);
		listaElectrodomestico[7] = new Television (235, "azul", 'B', 12, 22, true);
		listaElectrodomestico[8] = new Television(540, 15);
		listaElectrodomestico[9] = new Television(580, "rojo", 'A', 16, 22, true);
		
		
		// Recorre este array y jecuta el metodo precioFinal()
		String lavadora = "";
		String television = "";
		int sumaLavadora = 0;
		int sumaTelevisor = 0;
		int sumatotal = 0;
		
		// Recorre la lista 
		for (int i = 0; i < listaElectrodomestico.length; i++) {
			// Si la iteracion de la lista electrodomestico coincide con el nombre television se añade a television
			if (listaElectrodomestico[i].identificar().equals("Television")) {
				television += "television tiene el precio: " + listaElectrodomestico[i].precioFinal() +" \n";
				sumaTelevisor += listaElectrodomestico[i].precioFinal();
			}else{
				lavadora += "lavadora tiene el precio: " +  listaElectrodomestico[i].precioFinal() +" \n";
				sumaLavadora += listaElectrodomestico[i].precioFinal();
			}
			
		}sumatotal = sumaLavadora +  sumaTelevisor;		
		
		System.out.println(television);
		System.out.println("El total del importe de los televisores es: " + sumaTelevisor + " €\n");
		System.out.println(lavadora);
		System.out.println("\nEl total del importe de las lavadoras es : " + sumaLavadora +" €\n");
		
		System.out.println("El total de todos los electrodomesticos es: " + sumatotal + " €");
	
	}
}

