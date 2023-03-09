package POO;

public class Cuadrado extends FiguraGeometrica{
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public void calcularArea() {
		area=lado*lado;
		System.out.println("El cuadrado cuyo lado es "+this.lado+ " tiene una area de: "+area );
	}

	@Override
	public void calcularPerimetro() {
		perimetro=4*lado;
		System.out.println("El cuadrado cuyo lado es "+this.lado+ " tiene un perimetro de: "+perimetro );
	}
}
