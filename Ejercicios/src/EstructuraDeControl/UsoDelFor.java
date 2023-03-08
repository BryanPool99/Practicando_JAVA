package EstructuraDeControl;
/*
	Enunciado: Obtener la suma de los primeros N números naturales positivos.

	Análisis: Para la solución de este problema, se requiere que el 
	usuario ingrese un número y el sistema realice el proceso para 
	devolver la suma de los N primeros números.
	--Entrada--
	Número (n).
	--Salida--
	Suma(s).
*/
import java.util.Scanner;
public class UsoDelFor {
public static void main(String[] args) {
	Scanner leer=new Scanner(System.in);
	//varaibles
	int n,sum=0;
	//ENTRADA
	System.out.print("Ingrese un numero: ");
	n=leer.nextInt();
	//PROCESO
	for (int i = 1; i <=n; i++) {
		sum+=i;
	}
	//SALIDA
	System.out.println("La suma de los "+n+" primeros numeros es : "+sum);
}
}
