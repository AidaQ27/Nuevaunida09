package Test05;

import java.util.ArrayList;

public class Aula {

	// Attributes

	private String id;
	private String materia;
	private int nrMaxEstudiantes;
	private int nrEstudiantesPresentes;
	private Profesor profe;
	private ArrayList<Estudiante> estudiantes;
	private boolean seEstudia;
	private String motivoNoEstudia;

	// Constructor

	public Aula() {
		this.nrEstudiantesPresentes = 0;
		this.motivoNoEstudia = "";
		this.id = generarId();
		this.materia = asignarMateria();
		this.nrMaxEstudiantes = Helpers.random(15, 22);
		this.profe = new Profesor(Helpers.random(35, 66));
		this.estudiantes = generarEstudiantes();
		this.seEstudia = verificarSeEstudia();
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the materia
	 */
	public String getMateria() {
		return materia;
	}

	/**
	 * @param materia the materia to set
	 */
	public void setMateria(String materia) {
		this.materia = materia;
	}

	/**
	 * @return the nrMaxEstudiantes
	 */
	public int getNrMaxEstudiantes() {
		return nrMaxEstudiantes;
	}

	/**
	 * @param nrMaxEstudiantes the nrMaxEstudiantes to set
	 */
	public void setNrMaxEstudiantes(int nrMaxEstudiantes) {
		this.nrMaxEstudiantes = nrMaxEstudiantes;
	}

	/**
	 * @return the seEstudia
	 */
	public boolean isSeEstudia() {
		return seEstudia;
	}

	/**
	 * @param seEstudia the seEstudia to set
	 */
	public void setSeEstudia(boolean seEstudia) {
		this.seEstudia = seEstudia;
	}

	/**
	 * @return the profe
	 */
	public Profesor getProfe() {
		return profe;
	}

	/**
	 * @param profe the profe to set
	 */
	public void setProfe(Profesor profe) {
		this.profe = profe;
	}

	/**
	 * @return the estudiantes
	 */
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	/**
	 * @param estudiantes the estudiantes to set
	 */
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	/**
	 * @return the motivoNoEstudia
	 */
	public String getMotivoNoEstudia() {
		return motivoNoEstudia;
	}

	/**
	 * @param motivoNoEstudia the motivoNoEstudia to set
	 */
	public void setMotivoNoEstudia(String motivoNoEstudia) {
		this.motivoNoEstudia = motivoNoEstudia;
	}

	/**
	 * @return the nrEstudiantesPresentes
	 */
	public int getNrEstudiantesPresentes() {
		return nrEstudiantesPresentes;
	}

	/**
	 * @param nrEstudiantesPresentes the nrEstudiantesPresentes to set
	 */
	public void setNrEstudiantesPresentes(int nrEstudiantesPresentes) {
		this.nrEstudiantesPresentes = nrEstudiantesPresentes;
	}

	// Methods

	/**
	 * Devolver materia disponible
	 */
	private String asignarMateria() {

		String[] materias = { "matematicas", "filosofia", "fisica" };

		int randomNr = Helpers.random(0, 2);

		return materias[randomNr];

	}

	/**
	 * Generar id numérico
	 * 
	 * @return
	 */
	private String generarId() {

		String id = "";
		int longitud = 2;
		// generar un id numerico con la longitud deseada
		for (int i = 0; i < longitud; i++) {
			id += Helpers.random(0, 9);
		}

		return id;
	}

	/**
	 * Generar los alumnos/estudiantes de clase
	 * 
	 * @return
	 */
	public ArrayList<Estudiante> generarEstudiantes() {
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		for (int i = 0; i < this.nrMaxEstudiantes; i++) {

			Estudiante estudiante = new Estudiante(Helpers.random(13, 26));
			estudiantes.add(estudiante);

			// Sumar estudiante presente
			if (estudiante.isPresentado()) {
				this.nrEstudiantesPresentes++;
			}
		}

		return estudiantes;

	}

	/**
	 * Comprobar si se pueden dar clase
	 * 
	 * @return
	 */
	public boolean verificarSeEstudia() {

		String motivo = "";

		// Profesor presentado
		if (!this.profe.presentado) {

			motivo = "El profesor no ha podido presentarse. No se da clase.";
			System.out.println(motivo);
			this.motivoNoEstudia = motivo;

			return false;
		}

		// Materia del profesor coincide con la materia de la aula
		if (!this.profe.getMateria().equals(this.materia)) {

			motivo = "El profesor no puede dar clase en el aula de " + this.materia;
			this.motivoNoEstudia = motivo;
			return false;

		}

		// Comprobar si hay mas de la mitad de los alumnos presentes
		if (this.nrEstudiantesPresentes < (nrMaxEstudiantes / 2)) {

			motivo = "Faltan más de la mitad de los alumnos.";
			this.motivoNoEstudia = motivo;
			return false;
		}

		// Se da clase en otro caso
		return true;

	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Aula [id=" + id + ", materia=" + materia + ", nrMaxEstudiantes=" + nrMaxEstudiantes + ", profe=" + profe
				+ ", numero estudiantes=" + estudiantes.size() + ", seEstudia=" + seEstudia + ", motivoNoEstudia="
				+ motivoNoEstudia + ",estudiantes presentes= " + this.nrEstudiantesPresentes + "]";
	}

	/**
	 * Asignar calificacion alumnos
	 */
	public void entregarNotasAlumnos() {
		for (int i = 0; i < this.estudiantes.size(); i++) {
			this.estudiantes.get(i).setCalificacion(Helpers.random(0, 10));
		}
	}

	/**
	 * Calcular y devolver la cantidad de hombres aprobados
	 * @return
	 */
	public int cantidadHombresAprobados() {
		int cantidadHombresAprobados = 0;
		for (int i = 0; i < this.estudiantes.size(); i++) {
			Estudiante estudiante = this.estudiantes.get(i);
			// Estudiantes hombres aprobados
			if (estudiante.getSexo() == 72 && estudiante.getCalificacion() >= 5) {
				cantidadHombresAprobados++;

			}
		}

		return cantidadHombresAprobados;
	}

	/**
	 * Calcular y devolver la cantidad de mujeres aprobadas
	 * @return
	 */
	public int cantidadMujeresAprobadas() {
		int cantidadMujeresAprobadas = 0;
		for (int i = 0; i < this.estudiantes.size(); i++) {
			Estudiante estudiante = this.estudiantes.get(i);
			// Estudiantes hombres aprobados
			if (estudiante.getSexo() == 77 && estudiante.getCalificacion() >= 5) {
				cantidadMujeresAprobadas++;

			}
		}

		return cantidadMujeresAprobadas;
	}

}
