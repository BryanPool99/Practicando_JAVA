package POO;
/*
 	Crear una clase "Veh�culo" con atributos como marca, modelo y a�o, 
 	y m�todos para establecer y obtener estos atributos, 
 	as� como tambi�n para encender y apagar el veh�culo.
*/
public class Vehiculo {
	//atributos
	private String marca,modelo;
	private int anhio;
	//constructor
	public Vehiculo(String marca, String modelo, int anhio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anhio = anhio;
	}
	//metodos getters and setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnhio() {
		return anhio;
	}
	public void setAnhio(int anhio) {
		this.anhio = anhio;
	}
	//Metodo para encender vehiculo;
	public void encenderVehiculo() {
		System.out.println("Usted acaba de encender su vehiculo cuya marca es "+this.marca);
	}
	//Metodo para apagar vehiculo
	public void apagarVehiculo() {
		System.out.println("Usted acaba de apagar su vehiculo de modelo "+this.modelo);
	}
	//TestVehiculo
	public static void main(String[] args) {
		Vehiculo v1=new Vehiculo("Toyota", "AZX", 2013);
		v1.encenderVehiculo();
		v1.apagarVehiculo();
	}
}
