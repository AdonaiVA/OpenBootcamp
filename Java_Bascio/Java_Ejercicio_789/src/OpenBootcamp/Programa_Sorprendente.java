package OpenBootcamp;
/*Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programa_Sorprendente{

    public static void main(String[] args) {

        /*Se creará una lista de contactos en la que se podrá:
         * Añadir contactos nuevos
         * Eliminar contactos
         * Imprimir la lista de contactos
         */

         // Primero se creará un HashMap donde guardaremos los contactos

         Map <String, List<String>> agenda = new HashMap<>();

        //Ingreso de la respuesta del usuario
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Menú
        System.out.println("¿Qué acción desea realizar?");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Mostrar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Salir");
        System.out.println("Ingresa un número, por favor");
        //Bucle para uso del ususario
        try{
            while(true){
                //Obtener respuesta ususario
                System.out.print("Opción:");
                String eleccion = bufferedReader.readLine();

                //Añadir contacto
                if (eleccion.equals("1")){
                    System.out.print("Nombre del contacto: ");
                    String nombre = bufferedReader.readLine();

                    System.out.println("Número de teléfono: ");
                    String telefono = bufferedReader.readLine();

                    List<String> telefonos = agenda.getOrDefault(nombre, new ArrayList<>());
                    telefonos.add(telefono);
                    agenda.put(nombre, telefonos);
                    System.out.println("Contacto agregado con éxito!");
                }else if (eleccion.equals("2")){
                    //Imprimir contactos
                    System.out.println("Lista de contactos: ");

                    for (Map.Entry<String, List<String>> iteracion : agenda.entrySet()){
                        String nombre = iteracion.getKey();
                        List<String> telefonos = iteracion.getValue();
                        System.out.println("Nombre: " + nombre);

                        for(String telefono : telefonos){
                            System.out.println("Teléfono: "+ telefono);
                        }
                    }
                } else if (eleccion.equals("3")){
                    System.out.println("¿Qué contacto se desea eliminar?");
                    String nombre = bufferedReader.readLine();
                    if (agenda.containsKey(nombre)){
                        agenda.remove(nombre);
                        System.out.println("Contacto eliminado con éxito");
                    } else{
                        System.out.println("El contacto que desea eliminar no existe en la agenda.");
                    }

                } else if(eleccion.equals("4")){
                    System.out.println("Hasta luego");
                    break;
                } else {
                    System.out.println("Opción invalida, por favor elige una opción válida.");
                }   
            }
  
    } catch (Exception e){
            System.out.println("Problemilla");
    }        
}
}



