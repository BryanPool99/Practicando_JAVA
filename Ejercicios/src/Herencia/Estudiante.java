package Herencia;

public class Estudiante extends Persona{
	private double promedioDeNotas;
	//constructor
	public Estudiante(String nombre, int edad, String direccion, double promedioDeNotas) {
		super(nombre, edad, direccion);
		this.promedioDeNotas = promedioDeNotas;
	}
	//getter and setter
	public double getPromedioDeNotas() {
		return promedioDeNotas;
	}
	public void setPromedioDeNotas(double promedioDeNotas) {
		this.promedioDeNotas = promedioDeNotas;
	}
	//metodo toString()
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estudiante [promedioDeNotas=");
		builder.append(this.promedioDeNotas);
		builder.append(", ").append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
