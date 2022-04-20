package Test05;

public class Profesor extends Persona{
	
	//Constants
	private int PROBABILIDAD_ABSENCIA = 20;
	
	//Attributes
	private String materia;
	
	public Profesor(int edad) {
		super(edad);
		this.probabilidadAbsencia = PROBABILIDAD_ABSENCIA;
		this.materia = asignarMateria();
		this.presentado = presentarse();
	}

	// Getter Setters
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	// Methods
	
	/**
	 * Devolver materia disponible
	 */
	private String asignarMateria() {
		
		String[] materias = {"matematicas", "filosofia", "fisica"}; 
		
		int randomNr = Helpers.random(0, 2);
		
		return materias[randomNr];
		
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Profesor [PROBABILIDAD_ABSENCIA=" + PROBABILIDAD_ABSENCIA + ", materia=" + materia + ", nombre="
				+ nombre + ", edad=" + edad + ", sexo=" + sexo + ", presentado=" + presentado
				+ ", probabilidadAbsencia=" + probabilidadAbsencia + "]";
	}
	
	

}
