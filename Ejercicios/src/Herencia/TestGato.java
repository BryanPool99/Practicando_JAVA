package Herencia;

public class TestGato {
	public static void main(String[] args) {
		Gato g=new Gato("Mamifero", "Gatubelo", 5, true);
		g.moverse();
		g.hacerSonido();
		g.maullar();
		System.out.println(g.toString());
	}
}
