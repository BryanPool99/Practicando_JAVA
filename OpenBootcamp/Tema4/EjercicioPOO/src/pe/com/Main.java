package pe.com;
/*
En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
public class Main{
    public static void main(String[] args) {
        SmartPhone phone=new SmartPhone("45px", 120, "S20","SAMSUNG", 1559);
        SmartWatch watch=new SmartWatch("XYZ", "X456", "XIAOMY", 850);
        System.out.println(phone.toString());
        System.out.println(watch.toString());
    }
}
