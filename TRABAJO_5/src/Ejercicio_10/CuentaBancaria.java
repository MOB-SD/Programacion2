
package Ejercicio_10;
class CuentaBancaria{
    public String cbu;
    public double saldo;
    public ClaveSeguridad clave;
    public TitularCuenta titular;

    public CuentaBancaria(String cbu,double s,TitularCuenta t,String cod){
        this.cbu=cbu;
        this.saldo=s;
        
        //hago la clave
        this.clave=new ClaveSeguridad(cod,"Hoy");
        
        this.titular=t;
        this.titular.setCuenta(this);
    }
}