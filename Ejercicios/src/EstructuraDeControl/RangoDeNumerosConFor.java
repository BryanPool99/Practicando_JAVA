package EstructuraDeControl;
/*
	Enunciado: Dado un rango de números enteros, obtener 
	la cantidad de números enteros que contiene.

	Análisis: Para la solución de este problema, 
	se requiere que el usuario ingrese el número inicial y 
	final, luego el sistema procesa y devuelve la cantidad 
	de números enteros que contiene el rango.
	--Entrada--
	Número Inicial (ni).
	Número Final (nf).
	--Salida--
	Cantidad (c).
*/
import java.util.Scanner;
public class RangoDeNumerosConFor {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		//variables
		int ni,nf,cant=0;
		//ENTRADA
		System.out.print("Ingrese valor inicial: ");
		ni=leer.nextInt();
		System.out.print("Ingrese valor final: ");
		nf=leer.nextInt();
		//PROCESO
		for (int i = ni+1; i < nf; i++) {
			cant++;
		}
		//SALIDA
		System.out.println("La cantidad de numeros que hay entre "+ni+" y "+nf+" es: "+(cant));
	}
}
