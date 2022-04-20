package Test05;

public class Estudiante extends Persona {

	// Constants
	private int PROBABILIDAD_ABSENCIA = 50;

	// Attributes
	private int calificacion;

	// Constructor
	public Estudiante(int edad) {
		super(edad);
		this.probabilidadAbsencia = PROBABILIDAD_ABSENCIA;
		this.presentado = presentarse();
		this.setCalificacion(0);
	}

	// Getters Setters
	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Estudiante [PROBABILIDAD_ABSENCIA=" + PROBABILIDAD_ABSENCIA + ", calificacion=" + calificacion
				+ ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", presentado=" + presentado
				+ ", probabilidadAbsencia=" + probabilidadAbsencia + "]";
	}

}
