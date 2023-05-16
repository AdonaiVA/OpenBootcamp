package OpenBootcamp;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


/**
 * Main
 */
public class Main {
    public static void main(String[] args) {


        System.out.println(reverse("hola mundo"));
        
        System.out.println("----------------------------------------------------");
        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String arrayUnidimensional[] = {"José", "Juan", "Pedro", "Miguel", "Toño", "Memo"};

        for (String elemento : arrayUnidimensional) {
            System.out.println(elemento);          
        }
        System.out.println("----------------------------------------------------");
        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones
        int ArrayBidimensional [] [] = {{15,28,33,44,52},{55,44,83,92,13},{51,92,83,42,53},{51,42,53,84,35},{21,25,37,84,95}};

        for (int i = 0; i < ArrayBidimensional.length; i++) {
            for (int j = 0; j < ArrayBidimensional.length; j++) {
                System.out.println("Posición [" + i + "][" + j + "]: "+ ArrayBidimensional[i][j]);
            }
        }
        System.out.println("----------------------------------------------------");
        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<Integer> numerosPrimos = new Vector<>(6);

        System.out.println(numerosPrimos);
        numerosPrimos.add(1);
        numerosPrimos.add(3);
        numerosPrimos.add(5);
        numerosPrimos.add(15);
        numerosPrimos.add(9);
        System.out.println(numerosPrimos);
        numerosPrimos.remove(1);
        numerosPrimos.remove(1);
        System.out.println(numerosPrimos);
        System.out.println("----------------------------------------------------");
        
        //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        System.out.println("El problema de usar un Vector con capacidad por defecto, si se tuviesen 1000 elementos para ser añadidos, es que si se quiere añadir un elemento más (1001), la capacidad del Vector se duplicaría, teniendo 999 espacios vacios que ocupan memoria y alenta la velocidad del programa.");
        System.out.println("----------------------------------------------------");
        
        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> DestinosViaje = new ArrayList<>();
        DestinosViaje.add("Irlanda");
        DestinosViaje.add("Dinamarca");
        DestinosViaje.add("Islandia");
        DestinosViaje.add("Noruega");
        DestinosViaje.add("Escocia");
        System.out.println("Los valores del ArrayList son: ");
        for (String string : DestinosViaje) {
            System.out.println(string);
        }
        System.out.println("----------------------------------------------------");
        LinkedList<String> CopiaViajes = new LinkedList<String>();
        System.out.println("Los valores del LinkedList son:");
        CopiaViajes.addAll(DestinosViaje);
        for (String copiado : CopiaViajes) {
            System.out.println(copiado);
        }
        System.out.println("----------------------------------------------------");

        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> listaEjercicio6 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listaEjercicio6.add(i);
        }
        System.out.println("ArrayList inicial: " + listaEjercicio6);

        for (int i = 0; i < listaEjercicio6.size(); i++) {
            if(listaEjercicio6.get(i) % 2 == 0){
                listaEjercicio6.remove(i);
            }
        }
        System.out.println("La nueva ArrayList es:" + listaEjercicio6);

        ArrayList<Integer> solucion2 = new ArrayList<>();
        for (int i = 1; i < 10 ; i++) {
            if (i % 2 == 0){
                continue;
            } else {
                solucion2.add(i);
            }            
        }
        System.out.println("La lista con el segundo procedimiento es: " + solucion2);
        System.out.println("----------------------------------------------------");


        System.out.println(DividePorCero(4, 0));

        System.out.println("----------------------------------------------------");
        
        //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
                
        try {
            InputStream fileIn = new FileInputStream("fileIn.txt");
            byte []datos = fileIn.readAllBytes();
            fileIn.close();

            PrintStream fileOut = new PrintStream("fileOut.txt");
            fileOut.write(datos);
            fileOut.close();
            System.out.println(fileOut);
        } catch (Exception e){
            System.out.println("Excepción: " + e.getMessage());
        }
        
    }         



    /*Dada la función:

    public static String reverse(String texto) { }

    Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".*/
    public static String reverse (String texto) {
        //Se declara la variable
        String salida = "";
        //Se itera con los valores del string ingresado
        for (int i = texto.length() - 1; i >= 0; i--){
            salida = salida + texto.charAt(i);
        }
        return salida;
    }

    //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
    public static int DividePorCero(int a, int b) throws ArithmeticException {
        
        int resultado = 0;
        try
        {
            resultado = a / b;
        }  catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }
        finally{
            System.out.println("Demo de código");
        }
        
        return resultado;
    }
}