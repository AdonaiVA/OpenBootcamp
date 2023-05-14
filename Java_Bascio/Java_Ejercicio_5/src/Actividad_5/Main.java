/*Crear una interfaz CocheCRUD.

Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.

Como métodos de CocheCRUD podemos poner:

save() findAll() delete() que simplemente impriman por consola el nombre del propio método.

Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.

Ejemplo:

CocheCRUD cocheCrud = new CocheCRUDImpl() */

package Actividad_5;

public class Main {

    static CocheCRUD cocheCRUD;


    public static void main(String[] args) {
        
        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        Coche mirageG4 = new Coche("mirage G4", "Mitsubishi", 2022, 4, "Plateado");
        Coche ToyotaPRIUS = new Coche("Prius", "Toyota", 2021, 4, "Azul");
        Coche NissanMarch = new Coche("March", "Nissan", 2018, 4, "Rojo");

        cocheCRUD.save(NissanMarch);
        cocheCRUD.save(mirageG4);
        cocheCRUD.save(ToyotaPRIUS);

        cocheCRUD.findAll();

        cocheCRUD.delete(NissanMarch);
        
    }
    
}
