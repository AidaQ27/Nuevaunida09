package Test01;

public class Lavadora extends Electrodomestico { // Heredamos de la clase Electrodomestico
	
	//Por defecto la carga es de 5kg. Usamos una constante.
	
	//Constante
	final int CARGA_CONST = 5;  //Final porque es una constante
	
	//Atributos
	private int carga;		// Private porque es un atributo

	// Constructor from SuperClass
	// Constructor por defecto
	public Lavadora() {
		super();
		this.carga = CARGA_CONST; //Se lo pasamos como constante, no por el constructor
		
	}

	// Constructor con precio y peso
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = CARGA_CONST; // Se lo pasamos como constante no por el constructor
		
	}

	//Constructor con la carga y el resto de atributos.
	public Lavadora(double precio, String colorin, char letra, double peso, int carga) {
		super(precio, colorin, letra, peso);
		this.carga = carga;
	}

	// GETTER & SETTERS de carga.
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	
	
	// Metodo precio final de lavadora
	public double precioFinal() {
		int precio = 0;
		if(carga > 30) {//si carga es mayor que 30 
			precio += 50;
			
		}
		precio += sumaLetraConsumo(letra);
		precio += sumaTamaño(carga);
		System.out.println(precio);
		
		return precio;
	}
	
	public double sumaLetraConsumo(Consumo letra) {
		switch (letra) {
		case A:
			 precio += 100;
			 break;
		case B:
			precio += 80;
			break;
		case C:
			precio += 60;
			break;
		case D:
			precio += 50;
			break;
		case E:
			precio += 30;
			break;
		case F:
			precio += 10;
			break;
	
		}
		return precio;
	}
	
	public double sumaTamaño (double peso) {
		if (peso <= 19) {//si es cierto
			precio += 10;
		}else if (peso >= 20 && peso <= 49 ) {
			precio += 50;
		}else if (peso >= 50 && peso <= 79) {
			precio += 80;
		}else if (peso >= 80) {
			precio+=100;
		}
		return precio;
		
	}
	
}
