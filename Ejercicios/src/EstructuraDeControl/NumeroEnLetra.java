package EstructuraDeControl;
/*
 	Enunciado: Dado un número entero de un dígito (0 al 9), devolver el número en letras.
	Análisis: Para la solución de este problema, se requiere que el 
	usuario ingrese un número entero y el sistema verifica y devuelve el número en letras.
	--Entrada--
	Número (n).
	--Salida--
	Resultado (r).
 */
import java.util.Scanner;

public class NumeroEnLetra {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//ENTRADA
		System.out.print("Digite un numero (del 0 al 9): ");
		int n=scanner.nextInt();
		String num="";
		//OPERACION
		switch (n) {
		case 0:num="cero";break;
		case 1:num="uno";break;
		case 2:num="dos";break;
		case 3:num="tres";break;
		case 4:num="cuatro";break;
		case 5:num="cinco";break;
		case 6:num="seis";break;
		case 7:num="siete";break;
		case 8:num="ocho";break;
		case 9:num="nueve";break;
		default:
			System.out.println("Digite solamente un numero del 0 al 9!!"); break;
		}
		//SALIDA
		System.out.println(num);
	}
}
