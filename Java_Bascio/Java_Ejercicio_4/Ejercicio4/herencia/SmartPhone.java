package Ejercicio4.herencia;

import Ejercicio4.clases.SmartDevice;

public class SmartPhone extends SmartDevice{
    // Atributos
    public int gbRAM;
    public String calidadCamara;
    public int bateria = 50;

    // Constructor
    public SmartPhone(String marca, String modelo, int año, String SO, boolean bluetooth, boolean WiFi, int gbRAM,
            String calidadCamara) {
        super(marca, modelo, año, SO, bluetooth, WiFi);
        this.gbRAM = gbRAM;
        this.calidadCamara = calidadCamara;
    }

    public SmartPhone(){

    }
    
    //Metodos
    public void CargarPila(int Carga){
        this.bateria += Carga;
    }

    public void hacerLlamada(String contacto) {
        System.out.println("Llamando a " + contacto);
    }


}
