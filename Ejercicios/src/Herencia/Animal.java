package Herencia;
/*
	Crear una superclase "Animal" con atributos como especie, nombre y edad. 
	También debe tener métodos para moverse y hacer sonidos.
	Crear dos subclases de "Animal": "Perro" y "Gato". 
	Ambas deben tener atributos adicionales como raza o si es un gato doméstico o salvaje.
*/
public class Animal {
	protected String especie;
	protected String nombre;
	protected int edad;
	//constructor
	public Animal(String especie, String nombre, int edad) {
		this.especie = especie;
		this.nombre = nombre;
		this.edad = edad;
	}
	//geters and setters
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
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
	//metodo moverse;
	public void moverse() {
		System.out.println(this.nombre+" esta moviendose");
	}
	//metodo hacer sonidos;
	public void hacerSonido() {
		System.out.println(this.nombre + " está haciendo un sonido.");
	}
	//metodo toString()
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [especie=");
		builder.append(this.especie);
		builder.append(", nombre=");
		builder.append(this.nombre);
		builder.append(", edad=");
		builder.append(this.edad);
		builder.append("]");
		return builder.toString();
	}
	
}
