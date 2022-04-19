package UD9;

public class Raices {

	private double a;
	private double b;
	private double c;
	
	public Raices() {
		this(0.0, 0.0, 0.0);
	}
	public Raices(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}			
	public double getDiscriminante() {
		return ((Math.pow(this.b, 2)) - (4 * this.a * this.c));
	}		
		
		private void obtenerRaices() {
		
		double X1=(-b+Math.sqrt(getDiscriminante()))/(2*a);
        double X2=(-b-Math.sqrt(getDiscriminante()))/(2*a);
        
        System.out.println("Solucion X1");
        System.out.println(X1);
        System.out.println("Solucion X2");
        System.out.println(X2);
		
		
		}
	private void obtenerRaiz() {
		double x = 0;
		if (tieneRaiz()) {
			x = ((-this.b) + Math.sqrt(Math.pow(this.b,  2) - (4 * this.a * this.c))) / (2 * this.a);
			System.out.println("Solucion raiz:" + x);
		}
	}			
	private boolean tieneRaices() {
		return getDiscriminante()>0;
	}
	private boolean tieneRaiz() {
		return getDiscriminante()==0;			
	}
	
	
	public void calcular() {
		if (tieneRaices()) {
			System.out.println("Dos posibles soluciones: ");
			System.out.println("Primer valor: " + ((-this.b + Math.sqrt(getDiscriminante())) / (2 * this.a)));
			System.out.println("Segundo valor: " + ((-this.b - Math.sqrt(getDiscriminante())) / (2 * this.a)));
			
		} else if (tieneRaiz()) {
			System.out.println("Solucion: " + ((-this.b + Math.sqrt(getDiscriminante())) / (2 * this.a)));
			System.out.println("Una posible soluci�n");
		} else {
			System.out.println("No tiene soluci�n");
		}
	}
}
