package Herencia;

public class Coche extends Vehiculo{
	private int numPuertas;
	//constructor
	public Coche(String modelo, int año, String numSerie, int numPuertas) {
		super(modelo, año, numSerie);
		this.numPuertas = numPuertas;
	}
	//getter and setter
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	//metodo toString()
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		builder.append(super.toString());
		builder.append(", ");
		builder.append("Coche [numPuertas=");
		builder.append(numPuertas);
		builder.append("]");
		builder.append("}");
		return builder.toString();
	}
	
}
