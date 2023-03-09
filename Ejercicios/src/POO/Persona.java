package POO;
/*
 	Crear una clase "Persona" con atributos como nombre, edad y género, y
  	métodos para establecer y obtener estos atributos. 
*/
public class Persona {
	private String nombre;
	private int edad;
	private String genero;
	//Constructor
	public Persona(String nombre, int edad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	//Metodos getters and setters
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void mostrarInfo() {
		System.out.println("Hola mi nombre es "+getNombre()+" y tengo "+getEdad()+" años.");
	}
	//Metodo main
	public static void main(String[] args) {
		Persona p1=new Persona("Bryan", 23, "Masculino");
		Persona p2=new Persona("Ana", 25, "Femenino");
		p1.mostrarInfo();
		p2.mostrarInfo();
	}
}
