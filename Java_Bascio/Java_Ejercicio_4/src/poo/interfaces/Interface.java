package poo.interfaces;

import java.util.List;

import poo.interfaces.Empleado;

/*
 * Se delcaran los métodos, no se implementan
 * 
 * Actua como lo que hay que hacer sin hacerlo
 */

public interface Empleado{

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
    
}
