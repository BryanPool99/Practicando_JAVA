package ManejoDeVaraibles;
/*
	Enunciado: Dado dos números, a y b.
		Hallar
		1)a + b
		2)a−b
		Entrada
		Num1.
		Num2.
		Salida
		Suma.
		Resta.
		Hallar el cociente y el residuo de dichos numeros.
*/
import java.util.Scanner;
public class OperacionesMatematicas {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//Ingreso de datos
		System.out.print("Ingrese primer numero: ");
		int a=scanner.nextInt();
		System.out.print("Ingrese segundo numero: ");
		int b=scanner.nextInt();
		//Operaciones
		int suma=a+b;
		int resta=a-b;
		int cociente=a/b;
		int residuo=a%b;
		//Salida
		System.out.println("La suma de los numeros es: "+suma);
		System.out.println("La resta de los numeros es: "+resta);
		System.out.println("EL cociente de los numeros es: "+cociente);
		System.out.println("El residuo dividiendo los numeros es: "+residuo);
	}
}
