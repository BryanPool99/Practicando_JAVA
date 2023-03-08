package EstructuraDeControl;
/*
	Enunciado: Dado dos números enteros y un operador +, −, * y /, 
	devolver la operación de los dos números según el operador ingresado, 
	considere que si el segundo número es cero y el operador es /, 
	no es divisible con el primer número, entonces devolver como resultado 0.
	Análisis: Para la solución de este problema, se requiere 
	que el usuario ingrese un operador y dos números y el sistema 
	verifica que operación debe realizar y devuelve el resultado de la operación.
	--Entrada--
	Operador (op).
	Número (n1 y n2).
	--Salida--
	Resultado (r).
*/
import java.util.Scanner;
public class CalculadoraBasica {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		//ENTRADA
		System.out.print("Ingrese un operador valido(+,-,*,/): ");
		String operador=leer.next();
		System.out.print("Ingrese el valor de n1: ");
		int n1=leer.nextInt();
		System.out.print("Ingrese el valor de n2: ");
		int n2=leer.nextInt();
		//OPERACIONES
		int resultado=0;
		switch (operador) {
		case "+":resultado=n1+n2;break;
		case "-":resultado=n1-n2;break;
		case "*":resultado=n1*n2;break;
		case "/":resultado=n1/n2;break;
		default:
			System.out.print("Ingrese un operador valido(+,-,*,/)");
			break;
		}
		//SALIDA
		System.out.println("La rpta es : "+resultado);
	}
}
