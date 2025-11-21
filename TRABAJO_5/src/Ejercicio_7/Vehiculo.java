
package Ejercicio_7;

class Vehiculo{
    public String patente,modelo;
    public Motor motor;
    public Conductor conductor;

    public Vehiculo(String p,String m,Motor mot,Conductor cond){
        this.patente=p;
        this.modelo=m;
        this.motor=mot;
        
        this.conductor=cond;
        //le aviso al conductor
        this.conductor.setVehiculo(this);
    }
}