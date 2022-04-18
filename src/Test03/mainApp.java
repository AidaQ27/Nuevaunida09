package Test03;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro1 = new Libro("56896", "El Señor de los anillos", "J.R.K Tolkien", 453);
		System.out.println(libro1.toString());
		
		Libro libro2 = new Libro("896526", "El código Da Vinci", "DanBrown", 342);
		System.out.println(libro2.toString());
		
		// Metodo para comprobar que libro tiene más paginas
		if (libro1.getNumPag()>libro2.getNumPag()) {
			System.out.println(libro1.getTitulo() + " tiene más paginas que " + libro2.getTitulo());
		}else{
			System.out.println(libro2.getTitulo() + " tiene más paginas que " + libro1.getTitulo());
			
		}

	}

}
