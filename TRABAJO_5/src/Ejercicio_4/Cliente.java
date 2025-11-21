
package Ejercicio_4;

class Cliente{
    public String nombre;
    public int dni;
    public TarjetaDeCredito tarjeta;

    public Cliente(String n,int d){
        this.nombre=n;
        this.dni=d;
    }
    
    public void setTarjeta(TarjetaDeCredito t){
        this.tarjeta=t;
    }
}
