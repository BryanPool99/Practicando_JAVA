package POO;

public class Rectangulo extends FiguraGeometrica{
	private double alto,ancho;
	
	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	@Override
	public void calcularArea() {
		area=alto*ancho;
		System.out.println("El retangulo cuyo alto es "+this.alto+" y ancho es "+this.ancho +" tiene un area de: "+area);
	}

	@Override
	public void calcularPerimetro() {
		perimetro=2*(alto+ancho);
		System.out.println("El retangulo cuyo alto es "+this.alto+" y ancho es "+this.ancho +" tiene un perimetro de: "+perimetro);
	}
	
}
