package EstructuraDeControl;

/*
	Enunciado: Al ingresar un n�mero entre 1 y 4 devolver la estaci�n del 
	a�o de acuerdo a la siguiente tabla.
	| N�mero  | Estaci�n  |
	| :-----: | :-------- |
	|    1    | Verano    |
	|    2    | Oto�o     |
	|    3    | Invierno  |
	|    4    | Primavera |
	
	An�lisis: Para la soluci�n de este problema, se requiere que el usuario
	 ingrese un n�mero entero y el sistema realice el proceso para devolver la estaci�n.
	--Entrada--
	N�mero (n).
	--Salida--
	Estaci�n (e).
 */
import java.util.Scanner;

public class Estaciones {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//ENTRADA
		System.out.print("Ingrese un numero(entre 1 y 4): ");
		int n=scanner.nextInt();
		String estacion="";
		//OPERACION
		switch (n) {
		case 1:estacion="Verano";break;
		case 2:estacion="Oto�o";break;
		case 3:estacion="Invierno";break;
		case 4:estacion="Primavera";break;
		default:
			System.out.println("Numero invalido(solo puede digitar numeros del 1 al 4 )");;break;
		}
		//SALIDA
		System.out.println(estacion);
	}
}
