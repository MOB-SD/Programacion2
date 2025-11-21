
package Kata3;

public abstract class Empleado{
    protected String nombre;

    public Empleado(String n){
        this.nombre=n;
    }

    //metodo abstracto
    public abstract double calcularSueldo();
}