package Ejercicio2;

public class Videojuego implements Entregable{

	/* Constantes */
	private final static int horasEstimadas_DEF = 10;

	/* Atributos */

	private String titulo;

	private int horasEstimadas;

	private boolean entregado;

	private String genero;

	private String compañia;

	/* Constructores */

	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = horasEstimadas_DEF;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
	}

	/* Getters Setters */

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public void entregar() {
		entregado = true;
	}

	public void devolver() {
		entregado = false;
	}

	/*
	 * Condición de si esta entregado el valor cambiará a true, si no seguirá siendo
	 * false
	 */
	public boolean isEntregado() {
		if (entregado) {
			return true;
		}
		return entregado;
	}

	/* Método para comparar el número de horas estimadas y indicar si tiene más, las mismas o menos */
	
	public int compareTo(Object a) {

		int resultado = 0;

		int mas = 1;
		int igual = 0;
		int menos = -1;

		Videojuego ref = (Videojuego) a;
		if (horasEstimadas > ref.getHorasEstimadas()) {
			resultado = mas;
		} else if (horasEstimadas == ref.getHorasEstimadas()) {
			resultado = igual;
		} else if (horasEstimadas < ref.getHorasEstimadas()) {
			resultado = menos;
		}

		return resultado;
	}
	
	/* Método que reescribe y muestra la información de cada atributo del videojuego*/
	
	@Override
	public String toString() {
		return "Videojuego: \n" +
				"Titulo: "+titulo + "\n" +
				"Horas Estimadas: " +horasEstimadas+ "\n" +
				"Genero: " +genero+ "\n" +
				"Creador: " + compañia;
	}
}
