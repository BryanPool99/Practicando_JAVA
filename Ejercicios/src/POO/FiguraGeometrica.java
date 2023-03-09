package POO;
/*
 	Crear una clase "Figura geométrica" con atributos como área y perímetro, y 
 	métodos para calcular estos valores para diferentes formas como cuadrados, rectángulos y círculos.
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
