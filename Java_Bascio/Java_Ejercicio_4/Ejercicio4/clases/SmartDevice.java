package Ejercicio4.clases;

import java.util.Scanner;

public class SmartDevice {
    //1. Atributos
    public String marca;
    public String modelo;
    public int año;
    public String SO;
    public boolean bluetooth;
    public boolean WiFi;
    public String fecha = "2023/02/01";

    //2. Constructor
    public SmartDevice(){
    }

    public SmartDevice(String marca, String modelo, int año, String SO, boolean bluetooth, boolean WiFi){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.SO = SO;
        this.bluetooth = bluetooth;
        this.WiFi = WiFi;
    }
    
    //3. Métodos
    public String WiFiConection(String OnOff){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Quieres encender el WiFi? (S/N)");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("S")){
            return "WiFi encendido";
        } 
        else{
            return "WiFi apagado";
        }
    }

    public String BluetoothConection(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Quieres encender el Bluetooth? (S/N)");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("S")){
            return "Bluetooth encendido";
        } 
        else{
            return "Bluetooth apagado";
        }
    }

    public String actualizarFecha(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Quiere actualizar la fecha?(S/N)");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("S")){
            System.out.println("¿Cúal es la fecha nueva?");
            String nuevaFecha = scanner.nextLine();
            this.fecha= nuevaFecha;
            return "Fecha actualizada" + nuevaFecha;
        } 
        else{
            return "Fecha del sistema";
        }

    }
}
