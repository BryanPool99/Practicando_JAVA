package Clases;

public class TestCaja {
	public static void main(String[] args) {
		Caja caja1=new Caja(2, 3, 6);
		int c1=caja1.calcularVolumen();
		Caja caja2=new Caja(5, 8, 1);
		int c2=caja2.calcularVolumen();
		System.out.println("El volumen de la caja 1 es : "+c1);
		System.out.println("El volumen de la caja 2 es : "+c2);
	}
}
