
package Kata2;

public abstract class Figura{
    protected String nombre;

    public Figura(String n){
        this.nombre=n;
    }

    //calculo area
    public abstract double calcularArea();

    public String getNombre(){return nombre;}
}