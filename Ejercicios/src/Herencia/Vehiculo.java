package Herencia;
/*
	Crear una superclase "Veh�culo" con atributos b�sicos como modelo, a�o y n�mero de serie.
	Tambi�n debe tener m�todos para acelerar y frenar.
	Crear dos subclases de "Veh�culo": "Coche" y "Moto". 
	Ambas deben tener atributos adicionales como n�mero de puertas o cilindrada, respectivamente.
*/
public class Vehiculo {
	protected String modelo;
	protected int a�o;
	protected String numSerie;
	//constructor
	public Vehiculo(String modelo, int a�o, String numSerie) {
		this.modelo = modelo;
		this.a�o = a�o;
		this.numSerie = numSerie;
	}
	//getter and setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public String getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}
	//metodo toString()
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [modelo=");
		builder.append(this.modelo);
		builder.append(", A�o=");
		builder.append(this.a�o);
		builder.append(", numSerie=");
		builder.append(this.numSerie);
		builder.append("]");
		return builder.toString();
	}
	
}
