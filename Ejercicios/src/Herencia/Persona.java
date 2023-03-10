package Herencia;
/*
	Crear una clase "Persona" que contenga información básica como 
	nombre, edad, dirección y método para imprimir su información.
	Crear dos subclases de "Persona": "Estudiante" y "Profesor". 
	Ambas deben tener información adicional específica de cada uno, 
	como la materia que enseña el profesor o el promedio del estudiante.
*/
public class Persona {
	protected String nombre;
    protected int edad;
    protected String direccion;
    //constructor
	public Persona(String nombre, int edad, String direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}
    //getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//metodo toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(this.nombre);
		builder.append(", edad=");
		builder.append(this.edad);
		builder.append(", direccion=");
		builder.append(this.direccion);
		builder.append("]");
		return builder.toString();
	}
	
	
}
