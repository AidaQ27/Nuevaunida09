package Test05;

public class Persona {

	// Attributes

	private String nombre;
	private int edad;
	private char sexo;
	private boolean presentado;

	// Constructor

	public Persona() {

	}

	// Setters and Getters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		// check character "H" or "M"
		if (sexo == 72 || sexo == 77) {
			this.sexo = sexo;
		}
	}

	public boolean isPresentado() {
		return presentado;
	}

	public void setPresentado(boolean presentado) {
		this.presentado = presentado;
	}

	// Methods
	
	/**
	 * 
	 * @param probabilidad - probabilidad de no presentarse
	 */
	private void presentarse(int probabilidad) {
		double num = Math.random() * 100;
		
		// Se presenta si el numero aleatorio del 0 al 100
		// es mayor que la probabilidad de no presentarse
		setPresentado(num > probabilidad);
	}

}
