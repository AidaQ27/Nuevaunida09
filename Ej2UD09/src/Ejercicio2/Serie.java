package Ejercicio2;

public class Serie implements Entregable{

	/* Constantes */
	private final static int numeroTemporadas_DEF = 3;
	
	
	
	/* Atributos */
	
	private String titulo;
	
	private int numeroTemporadas;
	
	private boolean entregado;
	
	private String genero;
	
	private String creador;

	
	/* Constructores */
	
	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = numeroTemporadas_DEF;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	
	public Serie(String titulo,String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numeroTemporadas = numeroTemporadas_DEF;
		this.entregado = false;
		this.genero = "";
	}
	
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas_DEF;
		this.genero = genero;
		this.creador = creador;
	}

	/* Getters Setters */

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}


	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public void entregar() {
        entregado=true;
    }
  
    public void devolver() {
        entregado=false;
    }
	
	/* Condición de si esta entregado el valor cambiará a true, si no seguirá siendo false */
	public boolean isEntregado() {
	if(entregado) {
		return true;
	}
		return entregado;
	}
	
	public int compareTo(Object a) {
		
		int resultado = 0;
		
		int mas = 1;
		int igual = 0;
		int menos = -1;
		
		Serie ref=(Serie)a;
        if (numeroTemporadas>ref.getNumeroTemporadas()){
            resultado=mas;
        }else if(numeroTemporadas==ref.getNumeroTemporadas()){
            resultado=igual;
        }else if (numeroTemporadas<ref.getNumeroTemporadas()) {
        	resultado=menos;
        }
  
        return resultado;
	}
	
	@Override
	public String toString() {
		return "Serie: \n" +
				"Titulo: "+titulo + "\n" +
				"Numero de temporadas: " +numeroTemporadas+"\n" +
				"Genero: " +genero+ "\n" +
				"Creador: " + creador;
	}

}
