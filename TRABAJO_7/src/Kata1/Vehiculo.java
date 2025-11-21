
package Kata1;

public class Vehiculo{
    protected String marca,modelo;

    public Vehiculo(String m,String mod){
        this.marca=m;
        this.modelo=mod;
    }

    public void mostrarInfo(){
        System.out.println("Vehículo: "+marca+" "+modelo);
    }
}
