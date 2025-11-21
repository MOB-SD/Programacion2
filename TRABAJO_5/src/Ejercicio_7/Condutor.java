
package Ejercicio_7;
class Conductor{
    public String nombre,licencia;
    public Vehiculo vehiculo;

    public Conductor(String n,String l){
        this.nombre=n;
        this.licencia=l;
    }
    
    public void setVehiculo(Vehiculo v){
        this.vehiculo=v;
    }
}