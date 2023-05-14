package Ejercicio4;

import Ejercicio4.clases.SmartDevice;
import Ejercicio4.herencia.SmartPhone;
import Ejercicio4.herencia.SmartWatch;

public class Main {
    
    public static void main(String[] asrgs) {
        

        //Objetos 

        SmartDevice Iphone6 = new SmartDevice("Apple", "Iphone6", 2015, "iOS", false, false);


        SmartPhone HuaweyY9 = new SmartPhone("Huawei", "Y9", 2020, "Android", true, true, 16, "Buena");

        SmartWatch SamsungWatch4 = new SmartWatch("Samsung", "Watch 4", 2022, "Android", true, true, true, true);

        //Interacción

        System.out.println(Iphone6.fecha);
        Iphone6.BluetoothConection();
        Iphone6.actualizarFecha();
        System.out.println(Iphone6.fecha);
        System.out.println(Iphone6.SO);
        System.out.println("------------------------------------");
        System.out.println(HuaweyY9.modelo);
        System.out.println(HuaweyY9.año);
        System.out.println(HuaweyY9.SO);
        System.out.println("La bateria tiene un " + HuaweyY9.bateria + "%");
        HuaweyY9.CargarPila(25);
        System.out.println("La bateria tiene un " + HuaweyY9.bateria + "%");
        HuaweyY9.hacerLlamada("Mario");
        System.out.println ("****************************************");
        System.out.println(SamsungWatch4.marca);
        System.out.println(SamsungWatch4.modelo);
        System.out.println(SamsungWatch4.SO);
        SamsungWatch4.medirFrecuenciaCardiaca();
        System.out.println(SamsungWatch4.fecha);
        SamsungWatch4.actualizarFecha();
        System.out.println(SamsungWatch4.fecha);
    }
}
