package Herencia;

public class Gato extends Animal{
	private boolean esDomestico;

    public Gato(String especie, String nombre, int edad, boolean esDomestico) {
        super(especie, nombre, edad);
        this.esDomestico = esDomestico;
    }
    //getter and setter
    public boolean isDomestico() {
		return esDomestico;
	}

	public void setEsDomestico(boolean esDomestico) {
		this.esDomestico = esDomestico;
	}
    public void maullar() {
        System.out.println(nombre + " está maullando.");
    }
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		builder.append(super.toString());
		builder.append(",");
		builder.append("Gato [esDomestico=");
		builder.append(this.esDomestico);
		builder.append("]");
		return builder.toString();
	}
    
}
