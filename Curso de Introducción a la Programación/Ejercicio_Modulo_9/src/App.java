
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    /*Crea una clase Persona con las siguientes variables:
    1.- La edad
    2.- El nombre
    3.- El teléfono*/
    class Persona{
        int edad;
        String nombre;
        int telefono;
    }

    /*Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.*/
    class Cliente extends Persona{
        int credito;    }
    
    /*Crear una clase Trabajador que herede de Persona y se le añada la variable salario */
    class Trabajador extends Persona{
        double salario;
    }

    /*Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.*/
        Cliente Mario = new Cliente();
        Mario.nombre = "Mario Antonio Morales Martinez";
        Mario.edad = 26;
        Mario.telefono = 228405974;
        Mario.credito = 50000;

        System.out.println("Cliente: " + Mario.nombre);
        System.out.println("Edad: " + Mario.edad);
        System.out.println("Telefono: " + Mario.telefono);
        System.out.println("Credito autorizado: $" + Mario.credito);

        Trabajador Job = new Trabajador();
        Job.nombre = "Job Dorantes Montoya";
        Job.edad = 34;
        Job.telefono = 22858585;
        Job.salario = 9000;

        System.out.println("Trabajador: " + Job.nombre);
        System.out.println("Edad: " + Job.edad);
        System.out.println("Telefono" + Job.telefono);
        System.out.println("Salario: $" + Job.salario);

    }

}
