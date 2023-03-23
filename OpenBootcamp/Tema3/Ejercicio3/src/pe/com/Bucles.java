package pe.com;


/*
 En este ejercicio tenéis que crear un bucle que permita concatenar textos e 
imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

String[] nombres = {"", "", "", ""}
*/
public class Bucles {
    public static void main(String[] args) {
        String[] nombres = {"Bryan", "Pool", "Arredondo", "Ovalle"};
        String phrase="";
        for (String nombre : nombres) {
            phrase+=nombre+" ";
        }
        System.out.println("La frase concatenada es: "+phrase);
    }
}
