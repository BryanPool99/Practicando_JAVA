package Clases;

public class Caja {
	private int alto;
	private int profundo;
	private int ancho;
	//constructor
	public Caja(int alto, int profundo, int ancho) {
		this.alto = alto;
		this.profundo = profundo;
		this.ancho = ancho;
	}
	//calcular volumen de caja
	public int calcularVolumen() {
		return this.alto*this.ancho*this.profundo;
	}
}
