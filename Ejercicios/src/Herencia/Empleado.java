package Herencia;

public class Empleado extends Persona{
	private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    //constructor
	public Empleado(String nombre,double sueldo) {
		super(nombre);
		this.idEmpleado = ++Empleado.contadorEmpleado;
		this.sueldo = sueldo;
	}
    //getters and setters
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	//metodo toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");
		builder.append(this.idEmpleado);
		builder.append(", sueldo=");
		builder.append(this.sueldo);
		builder.append(", ").append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
