
package pe.com;


public class CocheCRUDImp implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Ejecutando metodo save()");
    }

    @Override
    public void findAll() {
        System.out.println("Ejecutando metodo findAll()");
    }

    @Override
    public void delete() {
        System.out.println("Ejecutando metodo delete()");
    }
    
}
