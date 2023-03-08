package EstructuraDeControl;

/*
	Enunciado: Dado dos n�meros enteros diferentes, devolver el n�mero Mayor.
	An�lisis: Para la soluci�n de este problema, se requiere que el 
	usuario ingrese dos n�meros enteros diferentes y el sistema realice el proceso 
	para devolver el n�mero mayor.
	Expresi�n
	Si  n1>n2 ==>n1 es Mayor
	Si n2>n1 ==>n2 es Mayor
	--Entrada--
	Dos n�meros (n1 y n2).
	--Salida--
	N�mero Mayor (m).

*/
import java.util.Scanner;
public class MayorNum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//ingreso de datos
		System.out.print("Ingrese num 1: ");
		int n1=scanner.nextInt();
		System.out.print("Ingrese num 2: ");
		int n2=scanner.nextInt();
		//operacion
		if(n1>n2) {
			System.out.println("El numero "+n1+" es el mayor numero");
		}else if(n1<n2) {
			System.out.println("El numero "+n2+" es el mayor numero");
		}else {
			System.out.println("Los numero son iguales");
		}
	}
}
