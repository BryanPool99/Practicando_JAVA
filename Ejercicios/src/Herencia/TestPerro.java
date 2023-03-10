package Herencia;

public class TestPerro {
	public static void main(String[] args) {
		Perro p=new Perro("mamifero", "Logan", 3, "Doberman");
		p.moverse();
		p.hacerSonido();
		p.ladrar();
		System.out.println(p);
	}
}
