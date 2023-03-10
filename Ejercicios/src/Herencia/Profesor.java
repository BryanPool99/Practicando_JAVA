package Herencia;

public class Profesor extends Persona{
	private String cursoDictado;
	//constructor
	public Profesor(String nombre, int edad, String direccion, String cursoDictado) {
		super(nombre, edad, direccion);
		this.cursoDictado = cursoDictado;
	}
	//getter and setter
	public String getCursoDictado() {
		return cursoDictado;
	}
	public void setCursoDictado(String cursoDictado) {
		this.cursoDictado = cursoDictado;
	}
	//metodo toString()
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Profesor [cursoDictado=");
		builder.append(cursoDictado);
		builder.append(", ").append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
