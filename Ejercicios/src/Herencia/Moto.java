package Herencia;

public class Moto extends Vehiculo{
	private int cantCilindradas;
	//constructor
	public Moto(String modelo, int a�o, String numSerie, int cantCilindradas) {
		super(modelo, a�o, numSerie);
		this.cantCilindradas = cantCilindradas;
	}
	//getter and setter
	public int getCantCilindradas() {
		return cantCilindradas;
	}
	public void setCantCilindradas(int cantCilindradas) {
		this.cantCilindradas = cantCilindradas;
	}
	//metodo toString()
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		builder.append(super.toString());
		builder.append(", ");
		builder.append("Moto [cantCilindradas=");
		builder.append(this.cantCilindradas);
		builder.append("]");
		builder.append("}");
		return builder.toString();
	}
	
}
