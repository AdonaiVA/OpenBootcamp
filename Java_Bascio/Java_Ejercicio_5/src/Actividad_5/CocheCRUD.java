package Actividad_5;
import java.util.ArrayList;
import java.util.List;
/**
 * Create
 * Retrieve/Read
 * Update
 * Delete
 */

public interface CocheCRUD {
    
    //Estructura de datos
    List<Coche> coches = new ArrayList<>();

    //CREATE
    void save(Coche coche);
   
    //READ
    List<Coche> findAll();
    
    //DELETE
    void delete(Coche coche);
}
