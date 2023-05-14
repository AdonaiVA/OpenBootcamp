public class App {

    public static void main(String[] args) throws Exception {
        System.out.println(suma(10,50,90));

        
        class Coche {

            public int puertas = 4;
    
            public void aumentarpuertas(){
                this.puertas++;
            }
    
        }

        Coche coche1 = new Coche();

        System.out.println("Mi coche tiene " + coche1.puertas + " puertas");

        coche1.aumentarpuertas();

        System.out.println("Ahora mi coche tiene " + coche1.puertas + " puertas");
        

    }
    /* Primera parte:
    Crear una función con tres parámetros que sean números que se suman entre sí.
    Llamar a la función en el main y darle valores.*/
    

    public static int suma (int a, int b, int c) {
        return a + b + c;
    }

    /*Segunda parte:
    Crear una clase coche.
    Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    Una función que incremente el número de puertas que tiene el coche.
    Crear un objeto miCoche en el main y añadirle una puerta.
    Mostrar el número de puertas que tiene el objeto. */



}
