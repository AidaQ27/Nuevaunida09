package Test05;

public abstract class Persona {

	// Attributes

	protected String nombre;
	protected int edad;
	protected char sexo;
	protected boolean presentado;
	protected int probabilidadAbsencia;

	// Constructor

	public Persona(int edad) {
		this.nombre = generarNombreApellido();
		this.edad = edad;
		this.sexo = generarSexo();
		this.presentado = presentarse();

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
	protected boolean presentarse() {
		double num = Math.random() * 100;

		// Se presenta si el numero aleatorio del 0 al 100
		// es mayor que la probabilidad de no presentarse a clase
		if (num > this.probabilidadAbsencia)
			return true;
		return false;
	}

	/**
	 * Generar un nombre para Espectador
	 * 
	 * @return
	 */
	protected static String generarNombreApellido() {
		String[] nombres = { "Pepe", "Juan", "Maria", "Isabel", "Carlos", "David", "Cristina" };
		String[] apellido = { "Sanchez", "Perez", "Gallego", "Marin", "Martinez", "Collado", "Marquez" };

		String nombreCompleto = nombres[Helpers.random(0, 6)] + " " + apellido[Helpers.random(0, 6)];

		return nombreCompleto;
	}

	/**
	 * Generar genero aleatorio
	 * 
	 * @return
	 */
	protected char generarSexo() {
		if (Math.random() >= 0.5) {
			return 'H';
		} else {
			return 'M';
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", presentado=" + presentado
				+ ", probabilidadAbsencia=" + probabilidadAbsencia + "]";
	}
	
	

}
