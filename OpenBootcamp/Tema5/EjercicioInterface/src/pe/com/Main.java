
package pe.com;

/*
Crear una interfaz CocheCRUD.

Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.

Como métodos de CocheCRUD podemos poner:

save() findAll() delete() que simplemente impriman por consola el nombre del propio método.

Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.

Ejemplo:

CocheCRUD cocheCrud = new CocheCRUDImpl()
*/
public class Main {
    public static void main(String[] args) {
        CocheCRUDImp coche=new CocheCRUDImp();
        coche.save();
        coche.findAll();
        coche.delete();
    }
}
