package Ejercicio4.herencia;

import Ejercicio4.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    //Atributos
    boolean sensorFrecuenciaCardiaca;
    boolean GPS;
    
    //Constructor

    public SmartWatch(){

    }

    public SmartWatch(String marca, String modelo, int año, String SO, boolean bluetooth, boolean WiFi,
            boolean sensorFrecuenciaCardiaca, boolean gps) {
        super(marca, modelo, año, SO, bluetooth, WiFi);
        this.sensorFrecuenciaCardiaca = sensorFrecuenciaCardiaca;
        this.GPS = gps;
    }

    //Método

    public void medirFrecuenciaCardiaca(){
        if(sensorFrecuenciaCardiaca){
            System.out.println("Midiendo la frecuencia cardiaca...");
        } else {
            System.out.println("Este SmartWatch no tiene sensor");
        }
    }
    
}
