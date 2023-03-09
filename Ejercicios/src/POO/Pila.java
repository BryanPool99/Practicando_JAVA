package POO;
/*
 	Crear una clase "Pila" que implemente una pila 
 	utilizando una estructura de datos como un array o una lista enlazada.
*/
public class Pila {
	private int[] elementos;
	private int indice;
	public Pila(int tamanhio) {
		elementos=new int[tamanhio];
		indice=-1;
	}
	public void push(int elemento) {
		if(indice==elementos.length-1) {
			System.out.println("La pila esta llena");
		}else{
			indice++;
			elementos[indice]=elemento;
		}
	}
	public int pop() {
		if(indice==-1) {
			System.out.println("La pila esta vacia");
			return-1;
		}else {
			int elemento=elementos[indice];
			indice--;
			return elemento;
		}
	}
	public boolean isEmpty(){
		return indice==-1;
	}
	public boolean isFull() {
		return indice==elementos.length-1;
	}
	public void mostrarPila() {
		if (indice == -1) {
	        System.out.println("La pila está vacía");
	    } else {
	        System.out.println("Contenido de la pila:");
	        for (int i = indice; i >= 0; i--) {
	            System.out.print(elementos[i]+" ");
	        }
	        System.out.println();
	    }
	}
	//test
	public static void main(String[] args) {
		Pila p1=new Pila(5);
		p1.push(5);
		p1.push(1);
		p1.push(8);
		p1.push(3);
		p1.mostrarPila();
		p1.push(6);
		p1.mostrarPila();
		p1.pop();
		p1.mostrarPila();
		p1.pop();
		p1.mostrarPila();
	}
}
