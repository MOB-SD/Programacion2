
package Ejercicio_5;

class Propietario{
    public String nombre;
    public int dni;
    public Computadora computadora;

    public Propietario(String n,int d){
        this.nombre=n;
        this.dni=d;
    }
    
    public void setComputadora(Computadora c){
        this.computadora=c;
    }
}
