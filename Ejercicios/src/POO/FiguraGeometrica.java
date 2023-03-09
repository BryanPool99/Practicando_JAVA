package POO;
/*
 	Crear una clase "Figura geom�trica" con atributos como �rea y per�metro, y 
 	m�todos para calcular estos valores para diferentes formas como cuadrados, rect�ngulos y c�rculos.
*/
public abstract class FiguraGeometrica {
	protected double area;
	protected double perimetro;

	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}
	public abstract void calcularArea();
	public abstract void calcularPerimetro();
	
	public static void main(String[] args) {
		Cuadrado cuadrado=new Cuadrado(5);
		cuadrado.calcularArea();
		cuadrado.calcularPerimetro();
		Circulo circulo=new Circulo(3);
		circulo.calcularArea();
		circulo.calcularPerimetro();
		Rectangulo rectangulo=new Rectangulo(8, 6);
		rectangulo.calcularArea();
		rectangulo.calcularPerimetro();
	}
}
