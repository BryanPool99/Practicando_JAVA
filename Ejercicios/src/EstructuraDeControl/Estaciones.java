package EstructuraDeControl;

/*
	Enunciado: Al ingresar un número entre 1 y 4 devolver la estación del 
	año de acuerdo a la siguiente tabla.
	| Número  | Estación  |
	| :-----: | :-------- |
	|    1    | Verano    |
	|    2    | Otoño     |
	|    3    | Invierno  |
	|    4    | Primavera |
	
	Análisis: Para la solución de este problema, se requiere que el usuario
	 ingrese un número entero y el sistema realice el proceso para devolver la estación.
	--Entrada--
	Número (n).
	--Salida--
	Estación (e).
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
		case 2:estacion="Otoño";break;
		case 3:estacion="Invierno";break;
		case 4:estacion="Primavera";break;
		default:
			System.out.println("Numero invalido(solo puede digitar numeros del 1 al 4 )");;break;
		}
		//SALIDA
		System.out.println(estacion);
	}
}
