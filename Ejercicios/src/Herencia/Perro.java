package Herencia;

public class Perro extends Animal{
	private String raza;
	//constructor
	public Perro(String especie, String nombre, int edad, String raza) {
		super(especie, nombre, edad);
		this.raza = raza;
	}
	//getter and setter
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public void ladrar() {
        System.out.println(nombre + " está ladrando.");
    }
	//metodo toString()
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		builder.append(super.toString());
		builder.append(",");
		builder.append("Perro [raza=");
		builder.append(this.raza);
		builder.append("]");
		return builder.toString();
	}
	
}
