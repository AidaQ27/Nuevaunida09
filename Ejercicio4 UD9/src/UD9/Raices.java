package UD9;

public class Raices {

	private double a;
	private double b;
	private double c;
	
	//COnstructores
	public Raices() {
		this(0.0, 0.0, 0.0);
	}
	public Raices(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	//Método para el valor del discriminante
	public double getDiscriminante() {
		return ((Math.pow(this.b, 2)) - (4 * this.a * this.c));
	}		
	//Muestra de soluciones en caso de tener dos raices	
		private void obtenerRaices() {
		
		double X1=(-b+Math.sqrt(getDiscriminante()))/(2*a);
        double X2=(-b-Math.sqrt(getDiscriminante()))/(2*a);
        
        System.out.println("Solucion X1");
        System.out.println(X1);
        System.out.println("Solucion X2");
        System.out.println(X2);
		
		
		}
	// Muestra de la solucion en caso de tener una raiz
	private void obtenerRaiz() {
		double x = 0;
		if (tieneRaiz()) {
			x = ((-this.b) + Math.sqrt(Math.pow(this.b,  2) - (4 * this.a * this.c))) / (2 * this.a);
			System.out.println("Solucion raiz:" + x);
		}
	}			
	//Si el discriminante es mayor a cero tiene dos raices
	private boolean tieneRaices() {
		return getDiscriminante()>0;
	}
	//Si el discriminante es igual a cero tiene una sola raiz	
	private boolean tieneRaiz() {
		return getDiscriminante()==0;			
	}
	
	//Calculamos la ecuación de 2º grado
	public void calcular() {
		if (tieneRaices()) {
			System.out.println("Dos posibles soluciones: ");
			System.out.println("Primer valor: " + ((-this.b + Math.sqrt(getDiscriminante())) / (2 * this.a)));
			System.out.println("Segundo valor: " + ((-this.b - Math.sqrt(getDiscriminante())) / (2 * this.a)));
			
		} else if (tieneRaiz()) {
			System.out.println("Solucion: " + ((-this.b + Math.sqrt(getDiscriminante())) / (2 * this.a)));
			System.out.println("Una posible solución");
		} else {
			System.out.println("No tiene solución");
		}
	}
}
