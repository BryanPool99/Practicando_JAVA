package ManejoDeVaraibles;

import java.util.Scanner;

/*Suma de dos números: 
	 Crea un programa que solicite al usuario dos números y 
	 luego muestre la suma de esos dos números.
 */
public class Sumar {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//ingreso de datos;
		System.out.print("Ingrese el num1: ");
		int num1=scanner.nextInt();
		System.out.print("Ingrese el num2: ");
		int num2=scanner.nextInt();
		//Operacion
		int suma=num1+num2;
		//Salida
		System.out.println("La suma de los numeros dados es : "+suma);
	}
}
