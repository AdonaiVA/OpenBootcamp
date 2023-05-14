package Actividad_5;

public class Coche {
    
    //1. Atributos
    String modelo;
    String marca;
    int año;
    int numPuertas;
    String color;

    //2. Constructor

    public Coche(){

    }

    public Coche(String modelo, String marca, int año, int numPuertas, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;
        this.numPuertas = numPuertas;
        this.color = color;
    }

    //3. Método

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", Número de puertas=" + numPuertas + ", color=" + color;
    }


}
