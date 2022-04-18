package Test05;

public class Persona {

	// Attributes

	private String nombre;
	private int edad;
	private char sexo;
	private boolean presentado;
	private int probabilidadAbsencia;

	// Constructor

	public Persona(int edad) {
		this.nombre = generarNombreApellido();
		this.edad = edad;
		this.sexo = generarSexo();
		this.probabilidadAbsencia = 0;
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
	private boolean presentarse() {
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
	private static String generarNombreApellido() {
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
	private char generarSexo() {
		if (Math.random() >= 0.5) {
			return 'H';
		} else {
			return 'M';
		}
	}

}
