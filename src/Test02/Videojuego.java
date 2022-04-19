package Ejercicio2;

public class Videojuego implements Entregable{

	/* Constantes */
	private final static int horasEstimadas_DEF = 10;

	/* Atributos */

	private String titulo;

	private int horasEstimadas;

	private boolean entregado;

	private String genero;

	private String compa�ia;

	/* Constructores */

	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = horasEstimadas_DEF;
		this.entregado = false;
		this.genero = "";
		this.compa�ia = "";
	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.compa�ia = "";
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;
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

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	public void entregar() {
		entregado = true;
	}

	public void devolver() {
		entregado = false;
	}

	/*
	 * Condici�n de si esta entregado el valor cambiar� a true, si no seguir� siendo
	 * false
	 */
	public boolean isEntregado() {
		if (entregado) {
			return true;
		}
		return entregado;
	}

	/* M�todo para comparar el n�mero de horas estimadas y indicar si tiene m�s, las mismas o menos */
	
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
	
	/* M�todo que reescribe y muestra la informaci�n de cada atributo del videojuego*/
	
	@Override
	public String toString() {
		return "Videojuego: \n" +
				"Titulo: "+titulo + "\n" +
				"Horas Estimadas: " +horasEstimadas+ "\n" +
				"Genero: " +genero+ "\n" +
				"Creador: " + compa�ia;
	}
}
