package EstructuraDeControl;
/*
	Enunciado: Determine si un número es múltiplo de 3 y 5.
	Análisis: Para la solución de este problema, se requiere que el 
	usuario ingrese un número entero n, luego el sistema analiza y 
	determina si es el número es múltiplo de 3 y de 5.
	Expresión
	Si n Mod 3 = 0 ^ Mod 5 = 0 ==>
	    SI ES MÚLTIPLO DE 3 Y 5 
	SINO
	    NO ES MÚLTIPLO DE 3 Y 5 
	--Entrada--
	Número (n)
	--Salida--
	Resultado (r)
	ES MÚLTIPLO
	NO ES MÚLTIPLO
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
