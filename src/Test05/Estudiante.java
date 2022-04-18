package Test05;

public class Estudiante extends Persona {

	// Attributes
	private int calificacion;
	
	// Constructor
	public Estudiante(int edad) {
		super(edad);
		this.probabilidadAbsencia = 50;
		this.presentado = presentarse();
	}

}
