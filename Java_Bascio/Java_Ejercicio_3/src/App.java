/*En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
String[] nombres = {"", "", "", ""}*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[5];
        
        //Se inicializan los nombres en el array
        for (int i = 0; i < nombres.length; i++){
            nombres[i] = "";
        }

        //Esta función pide los nombres al usuario
        System.out.println("Ingrese los nombres a almacenar:");
        for (int i = 0; i < nombres.length; i++){
            nombres[i] += entrada.nextLine();
        }
        System.out.println("Nombres concatenados: ");
        String resultado = "";
        for (int i = 0; i < nombres.length; i++){
            resultado += (nombres[i] + " ");
        }
        System.out.println(resultado);       
    }
}