package EstructuraDeControl;
/*
	Enunciado: Obtener la suma de los primeros N n�meros naturales positivos.

	An�lisis: Para la soluci�n de este problema, se requiere que el usuario
	ingrese un n�mero y el sistema realice el proceso para devolver la 
	suma de los N primeros n�meros.
	--Entrada--
	N�mero (n).
	--Salida--
	Suma (s).
*/
import java.util.Scanner;
public class UsoDelWhile {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		//ENTRADA
		System.out.print("Ingrese un numero entero: ");
		int n=leer.nextInt();
		int i=0,sum=0;
		//PROCESO
		while (i<=n) {
			sum+=i;
			i++;
		}
		//SALIDA
		System.out.println("La suma de los "+n+" primeros numeros es : "+sum);
	}
}