package poo.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Retrieve/Read
 * Update
 * Delete
 */

public class EmpleadoCRUDV1 {
    
    //Estructura de datos
    List<Empleado> empleados = new ArrayList<>();

    //Create - guardar un empleado
    public void guardar(Empleado empleado){

        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }


}
