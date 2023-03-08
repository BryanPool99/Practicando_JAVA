package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class EjercicioDeArrays {
	public static void main(String[] args) {
		//Crear un array de números enteros y encontrar el valor más grande y más pequeño.
		int[] numeros = {8,7,9,15,7,6,4};
		int max=0;
		int min=9999999;
		for (int i : numeros) {
			if(i>max) {
				max=i;
			}
			if(i<min) {
				min=i;
			}
		}
		System.out.println("------------------------------------------------------");
		System.out.println("Del arreglo dado el maximo valor es: "+max);
		System.out.println("Del arreglo dado el minimo valor es: "+min);
		System.out.println("------------------------------------------------------");
		//Crear un array de números enteros y calcular la suma de todos los elementos.
		int sum=0;
		for (int val : numeros) {
			sum+=val;
		}
		System.out.println("Del arreglo la suma de todos los elementos es: "+sum);
		//Crear un array de números enteros y ordenarlos de menor a mayor.
		System.out.println("------------------------------------------------------");
		System.out.print("Array Original:");
		for (int num : numeros) {
			System.out.print(num+" ");
		}
		System.out.println();
		Arrays.sort(numeros);
		System.out.print("Array ordenado: ");
		for (int num : numeros) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------");
		//Crear dos arrays de números enteros y sumarlos elemento a elemento.
		int[]n1 = {4,7,9,6,5};
		int[]n2 = {7,5,8,6,2};
		int[]suma=new int[n1.length];
		
		for (int i = 0; i < n1.length; i++) {
			suma[i]=n1[i]+n2[i];
		}
		System.out.print("Array n1: ");
		for (int num1 : n1) {
			System.out.print(num1+" ");
		}
		System.out.println();
		System.out.print("Array n2: ");
		for (int num2 : n2) {
			System.out.print(num2+" ");
		}
		System.out.println();
		System.out.print("Array suma: ");
		for (int s : suma) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------");
		//Crear un array de números enteros y contar cuántos elementos son pares e impares.
		int[] array = {7,1,9,8,4,3,6,2,5};
		int cantImpar=0,cantPar=0;
		System.out.print("Array: ");
		for (int i : array) {
			System.out.print(i+" ");
			if(i%2==0) {
				cantPar++;
			}else {
				cantImpar++;
			}
		}
		System.out.println();
		System.out.println("La cantidad de numeros pares es: "+cantPar);
		System.out.println("La cantidad de numeros impares es: "+cantImpar);
		System.out.println("------------------------------------------------------");
		//Crear un array de números enteros y eliminar un elemento en una posición determinada.
		int[]miArray= {8,5,1,4,9,6};
		int idxRemove=3;
		int[]newArray=new int[miArray.length-1];
		System.out.print("Array Original: ");
		for (int i : miArray) {
			System.out.print(i+" ");
		} 
		System.out.println();
		for (int i = 0,k=0; i < miArray.length; i++) {
			if (i==idxRemove) {
				continue;
			}
			newArray[k++]=miArray[i];
		}
		System.out.print("Array Modificado: ");
		for (int i : newArray) {
			System.out.print(i+" ");
		}  
		System.out.println();
		System.out.println("------------------------------------------------------");
		//Crear un array de números enteros y comprobar si contiene un valor determinado
		int[]arr= {8,5,1,4,9,6};
		int val=8979;
		String seEncuentra="";
		for (int i : arr) {
			if(i==val) {
				seEncuentra="SI";
				break;
			}else {
				seEncuentra="NO";
			}
		}
		System.out.println("El elemento "+val+" "+seEncuentra+" se encuentra en el array");
		System.out.println("------------------------------------------------------");
		//Crear un array de cadenas y ordenarlas alfabéticamente.
		String[] words= {"caballo", "Cerdo", "Gato", "perro", "Vaca"};
		System.out.print("Array inicial:");
		for (String string : words) {
			System.out.print(string+" ");
		}
		System.out.println();
		Arrays.sort(words,String.CASE_INSENSITIVE_ORDER);
		System.out.print("Array Ordenado:");
		for (String w : words) {
			System.out.print(w+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------");
		//Crear un array de objetos y ordenarlos por un atributo determinado.
		Persona[] arrayPersona=new Persona[3];
		
		arrayPersona[0]=new Persona("Bryan", 23);
		arrayPersona[1]=new Persona("Ivan", 47);
		arrayPersona[2]=new Persona("Adelaida", 40);
		System.out.println("Original:");
		for (Persona persona : arrayPersona) {
			System.out.println(persona.getName()+"-"+persona.getEdad());
		}
		Arrays.sort(arrayPersona,new Comparator<Persona>() {
			@Override
			public int compare(Persona p1,Persona p2) {
				return p1.getEdad()-p2.getEdad();
			}
		});
		System.out.println("---");
		System.out.println("Ordenado por edad:");
		for (Persona persona : arrayPersona) {
			   System.out.println(persona.getName() + " - " + persona.getEdad());
		}
		System.out.println("------------------------------------------------------");
		//Crear un array de números enteros y encontrar la media de los elementos.
		int[]arrayNums= {1,2,3,4,5,6,7,8,9,10};
		int sumaArr=0;
		double mediaArr;
		for (int i : arrayNums) {
			sumaArr+=i;
		}
		mediaArr=sumaArr*1.0/arrayNums.length;
		System.out.println("La media del array es : "+mediaArr);
	}
}
