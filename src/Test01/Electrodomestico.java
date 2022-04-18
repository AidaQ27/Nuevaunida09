package Test01;
// Creamos una clase llamada Electrodomestico
// Con los Atributos precio base, color, consumo energetico (a-f) y peso. 
//Indica que se podran heredar.



public abstract class Electrodomestico {
	
	// Por defecto creamos las constantes en modo final
	final double PRECIO_CONST = 100;
	final Color COLOR_CONST = Color.blanco;
	final Consumo LETRA_CONST = Consumo.F;
	final double PESO_CONST = 5;
	
	enum Consumo {
		A, B, C, D, E, F
	}
	
	enum Color {
		blanco, negro, rojo, azul, gris
		
	}
	// Atributo de electrodomestico protected --> porque es el padre
	protected double precio;
	protected Color colorin;
	protected Consumo letra;
	protected double peso;
	
	//Constructor por defecto
	public Electrodomestico() {
		this.precio= PRECIO_CONST;
		this.colorin = COLOR_CONST;
		this.letra = LETRA_CONST;
		this.peso = PESO_CONST;
		
	}
	// Constructor con el precio y el peso. El resto por defecto
	public Electrodomestico(double precio, double peso) {
		super();
		this.precio = precio;
		this.peso = peso;
		this.colorin = COLOR_CONST;
		this.letra = LETRA_CONST;
		
	}
	// Constructor con todos los atributos
	public Electrodomestico(double  precio, String colorin, char letra, double peso) {
		super();
		this.precio = precio;
		this.colorin = comprobarColor(colorin);
		this.letra = comprobarConsumoEnergetico(letra);
		this.peso = peso;
	}

	// Metodos 
	public Consumo comprobarConsumoEnergetico(char letra) { //Comprueba que la letra es la correcta con el switch
		switch (letra) {
		case 'A':
			return Consumo.A;
		case 'B':
			return Consumo.B;
		case 'C':
			return Consumo.C;
		case 'D':
			return Consumo.D;
		case 'E':
			return Consumo.E;
		case 'F':
			return Consumo.F;
		default:
			return LETRA_CONST; //Sino se utilizará la letra por defecto
			
		}
	}
	
	public Color comprobarColor(String color) { // Comprobamos que los colores sean correcctos, sino se usa el color por defecto
		switch (color) {
		case "NEGRO":
			return Color.negro;
		case "AZUL":
			return Color.azul;
		case "ROJO":
			return Color.rojo;
		case "GRIS":
			return Color.gris;
		default:
			return COLOR_CONST;
		}
	}
	//metodo sin definir --> los hijos lo desarrollaran por separado
	public abstract double precioFinal();
	
	public abstract String identificar();
		
	
	
	
	// Getter & Setters
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Color getColorin() {
		return colorin;
	}

	public void setColorin(Color colorin) {
		this.colorin = colorin;
	}

	public Consumo getLetra() {
		return letra;
	}

	public void setLetra(Consumo letra) {
		this.letra = letra;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// Para imprimir
	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + colorin + ", letra=" + letra + ", peso=" + peso
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
