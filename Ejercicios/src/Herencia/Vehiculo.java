package Herencia;
/*
	Crear una superclase "Vehículo" con atributos básicos como modelo, año y número de serie.
	También debe tener métodos para acelerar y frenar.
	Crear dos subclases de "Vehículo": "Coche" y "Moto". 
	Ambas deben tener atributos adicionales como número de puertas o cilindrada, respectivamente.
*/
public class Vehiculo {
	protected String modelo;
	protected int año;
	protected String numSerie;
	//constructor
	public Vehiculo(String modelo, int año, String numSerie) {
		this.modelo = modelo;
		this.año = año;
		this.numSerie = numSerie;
	}
	//getter and setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
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
		builder.append(", Año=");
		builder.append(this.año);
		builder.append(", numSerie=");
		builder.append(this.numSerie);
		builder.append("]");
		return builder.toString();
	}
	
}
