package ManejoDeVaraibles;
/*Precio De Venta
  Datos :precioC,IGV=18% de precioC
  Se pide Precio total=precioC+IGV
 */
import java.util.Scanner;

public class PrecioDeVenta {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//Ingreso de datos
		System.out.print("Ingrese el precio de costo del producto: ");
		double precioC=scanner.nextDouble();
		//Operaciones
		double IGV=(18*1.0/100)*precioC;
		System.out.println(IGV);
		double precioTotal=precioC+IGV;
		//SALIDA
		System.out.print("El precio total del producto es: "+precioTotal);
	}
}	
