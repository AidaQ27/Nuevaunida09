package Test05;

public class mainApp {

	public static void main(String[] args) {

		Aula aula = new Aula();
		Profesor profesor = aula.getProfe();

		System.out.println(aula);
		System.out.println("Aula " + aula.getId());
		System.out.print("Aula de " + aula.getMateria());
		System.out.println(" para un total de " + aula.getNrMaxEstudiantes() + " estudiantes");
		
		// String para mostrar si el profesor se presenta o no
		String sePresentaString = " no ha podido presentarse a clase. ";
		if (profesor.isPresentado()) {
			sePresentaString = " se presenta a clase.";
		}
		
		// Info Profesor
		System.out.println("El profesor de " + profesor.getMateria() + ", " + profesor.getNombre() + sePresentaString);
		
		// Alumnos presentes
		System.out.println( aula.getNrEstudiantesPresentes() + " alumnos se han presentado hoy a clase.");
		
		// Mostrar si se puede dar clase
		if (!aula.isSeEstudia()) {
			System.out.println("\n No se da clase.");
			System.out.println(aula.getMotivoNoEstudia());
		} else {
			// En el caso de que se puede dar clase entregar notas
			aula.entregarNotasAlumnos();
			// Mostrar aprobados
			System.out.println("\n Hay " + aula.cantidadHombresAprobados() + " alumnos aprobados");
			System.out.println(" Hay " + aula.cantidadMujeresAprobadas() + " alumnas aprobadas");
		}
		

	}

}
