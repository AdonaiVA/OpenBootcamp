package interfaces;

import java.util.List;

import interfaces.Empleado;

/*
 * Se delcaran los métodos, no se implementan
 * 
 * Actua como lo que hay que hacer sin hacerlo
 */

public interface Workers{

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
    
}
