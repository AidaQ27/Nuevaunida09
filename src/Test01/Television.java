package Test01;

public class Television extends Electrodomestico{ // Heredamos de la clase Electrodomestico

	// CONSTANTE	
	final int RESOLUCION_CONST = 20;
	final boolean SINTO_CONST = false; // final porque es una constante
	
	// Atributos
	private int resolucion;
	private boolean sintonizadorTDT ; //private porque es un atributo
	
	
	// Constructores from Superclass
	// Constructor por defecto
	
	public Television() {
		super();
		this.resolucion = RESOLUCION_CONST; //LO INTRODUCIMOS COMO CONSTANTE
		this.sintonizadorTDT = SINTO_CONST;
	}
	
	// Constructor con el precio y peso
	public Television(double precio, double peso) {
		super(precio, peso);
		this.resolucion = RESOLUCION_CONST; //LO INTRODUCIMOS COMO CONSTANTE
		this.sintonizadorTDT = SINTO_CONST;
		
		
	}
	
	// Constructor con todos los atributos mas los heredados
	public Television(double precio, String colorin, char letra, double peso) {
		super(precio, colorin, letra, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
		
	}

	// Getter & setters
	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	public double precioFinal() {
		
		if (resolucion > 40) {
			precio = precio + (precio * 100 /30);
		}
		if (sintonizadorTDT = true) {
			precio += 50;
		}
		
		return precio;
	}
	
	public String identificar() {
		return "Television";
	}
	
	
}
