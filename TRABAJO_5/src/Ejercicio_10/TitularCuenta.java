
package Ejercicio_10;
class TitularCuenta{
    public String nombre;
    public int dni;
    public CuentaBancaria cuenta;

    public TitularCuenta(String n,int d){
        this.nombre=n;
        this.dni=d;
    }
    
    public void setCuenta(CuentaBancaria c){
        this.cuenta=c;
    }
}
