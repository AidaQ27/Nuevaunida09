package Test03;

public class Libro {
	//ATRIBUTOS
	private String ISBN;
	private String titulo;
	private String autor;
	private int numPag;
	
	//Constructor con todos los parametros
	public Libro(String iSBN, String titulo, String autor, int numPag) {
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}
	
	//Getters & Setters
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPag() {
		return numPag;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	
	// Crea el metodo toString()
	@Override
	public String toString() {
		return "El libro con ISBN " + ISBN + " " + titulo + " creado por el autor " + autor + " tiene " + numPag + " paginas.";
	}

	

}
