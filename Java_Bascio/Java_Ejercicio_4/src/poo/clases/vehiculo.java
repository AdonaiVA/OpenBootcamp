package poo.clases;

public class vehiculo {
    
    //1. atributos
    protected String modelo;
    protected String fabricante;
    protected String color;
    protected int año;
    protected boolean sport;
    protected int speed;
    protected Motor motor;

    //2. constructores
    public vehiculo(){

    }

    public vehiculo(String fabricante, String modelo, String color, int año, boolean sport, Motor motor){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.sport = sport;
        this.speed = 0;
        this.motor = motor;
    }

    //3. metodos (comportamientos)
    public void acelerar(int aceleracion){
        this.speed +=aceleracion;
    }

    //getter y setter

    public void setAño(int año) {
        this.año = año;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
