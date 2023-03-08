package EstructuraDeControl;
/*
	Enunciado: Determine si un n�mero es m�ltiplo de 3 y 5.
	An�lisis: Para la soluci�n de este problema, se requiere que el 
	usuario ingrese un n�mero entero n, luego el sistema analiza y 
	determina si es el n�mero es m�ltiplo de 3 y de 5.
	Expresi�n
	Si n Mod 3 = 0 ^ Mod 5 = 0 ==>
	    SI ES M�LTIPLO DE 3 Y 5 
	SINO
	    NO ES M�LTIPLO DE 3 Y 5 
	--Entrada--
	N�mero (n)
	--Salida--
	Resultado (r)
	ES M�LTIPLO
	NO ES M�LTIPLO
 */
import java.util.Scanner;
public class EsMultiplo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//ENTRADA DE DATOS
		System.out.print("Ingrese un numero entero: ");
		int n=scanner.nextInt();
		//OPERACION
		if(n%3==0 && n%5==0) {
			System.out.print("El numero "+n +" es multiplo.");
		}else {
			System.out.print("El numero "+n +" no es multiplo");
		}
		
	}
}
