package EstructuraDeControl;
/*
	Enunciado: Dado un rango de n�meros enteros, obtener 
	la cantidad de n�meros enteros que contiene.

	An�lisis: Para la soluci�n de este problema, 
	se requiere que el usuario ingrese el n�mero inicial y 
	final, luego el sistema procesa y devuelve la cantidad 
	de n�meros enteros que contiene el rango.
	--Entrada--
	N�mero Inicial (ni).
	N�mero Final (nf).
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
