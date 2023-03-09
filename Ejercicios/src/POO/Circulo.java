package POO;

public class Circulo extends FiguraGeometrica{
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public void calcularArea() {
		area=Math.PI*radio*radio;
		System.out.println("El circulo cuyo radio es "+this.radio+ " tiene una area de: "+area );
	}

	@Override
	public void calcularPerimetro() {
		perimetro=2*Math.PI*radio;
		System.out.println("El circulo cuyo radio es "+this.radio+ " tiene un perimetro de: "+perimetro );
	}

}
