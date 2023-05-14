package poo.clases;

import poo.herencia.Motocicleta;
import poo.herencia.camion;

public class Main {
    
    public static void main(String[] asrgs) {
        
        //Clases y Objetos:
        Motor motorGTI = new Motor("GTI", 400, 800, 8);

        vehiculo FordCamaro = new vehiculo("Ford", "Camaro", "Rojo", 2020, true,motorGTI);

        System.out.println(FordCamaro.color);
        FordCamaro.acelerar(120);
        System.out.println(FordCamaro.speed);

        //Herencia- Subclase: Motocicleta

        Motocicleta kawasaki = new Motocicleta();
        kawasaki.fabricante = "Kawasaki";
        System.out.println(kawasaki.fabricante);
        
        //Polimorfismo
        vehiculo vehiculo;

        vehiculo = new camion();
        vehiculo.acelerar(50);

        //clases abstractas, no se puede instanciar, solo instancias las lases hijas
        

    }
}
