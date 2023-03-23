
package funcion;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
Para este ejercicio tendréis que crear una función que reciba un precio
y devuelva el precio con el IVA incluido.
*/
public class PrecioTotal {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.00");     
        double rpta=getPrecioTotal(150.10);
        System.out.println("El precio total a pagar es de: "+formatter.format(rpta));
    }
    public static double getPrecioTotal(double precio){
        double IVA=0.15;
        return precio+precio*IVA;
    }
}
