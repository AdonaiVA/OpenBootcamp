package poo.interfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        // EmpleadoCRUDV1 empleadoCRUD = new EmpleadoCRUDV1();
        
        // Empleado Chardo = new Empleado("Chardonnay", 20, 40000, true);
        // Empleado Mari = new Empleado("Maria", 20, 40000, true);
        // Empleado Juan = new Empleado("Juan", 20, 40000, true);
        
        // //Guardar empleados
        // empleadoCRUD.guardar(Chardo);
        // empleadoCRUD.guardar(Juan);
        // empleadoCRUD.guardar(Mari);
        
        // //consultar empleados
        // List<Empleado> empleados = empleadoCRUD.findAll();
        // System.out.println(empleados);
        // System.out.println(Chardo);

        EmpleadoCRUDV2 empleadoCRUD = new EmpleadoCRUDV2();
        
        Empleado Chardo = new Empleado("Chardonnay", 20, 40000, true);
        Empleado Mari = new Empleado("Maria", 20, 40000, true);
        Empleado Juan = new Empleado("Juan", 20, 40000, true);
        
        //Guardar empleados
        empleadoCRUD.guardar(Chardo);
        empleadoCRUD.guardar(Juan);
        empleadoCRUD.guardar(Mari);
        
        //consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);

    }
}
