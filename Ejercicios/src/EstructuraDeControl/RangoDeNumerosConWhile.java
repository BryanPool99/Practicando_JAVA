package EstructuraDeControl;
/*
	Enunciado: Dado un rango de n�meros enteros, obtener la cantidad 
	de n�meros enteros que contiene.
	An�lisis: Para la soluci�n de este problema, se requiere que 
	el usuario ingrese el n�mero inicial y final, luego el sistema 
	procesa y devuelve la cantidad de n�meros enteros que contiene el rango.
	--Entrada--
	N�mero Inicial (ni).
	N�mero Final (nf).
	--Salida--
	Cantidad (c).
*/
import java.util.Scanner;
public class RangoDeNumerosConWhile {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		//VARIABLES
		int cant=0;
		//ENTRADA
		System.out.print("Ingrese numero inicial: ");
		int ni=leer.nextInt();
		System.out.print("Ingrese numero final: ");
		int nf=leer.nextInt();
		//PROCESO
		int i=ni+1;
		while (i<nf) {
			i++;
			cant++;
		}
		//SALIDA
		System.out.println("La cantidad de numeros que hay entre "+ni+" y "+nf+" es: "+(cant));
	}
}
