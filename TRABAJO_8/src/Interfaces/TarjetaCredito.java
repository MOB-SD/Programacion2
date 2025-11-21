
package Interfaces;

public class TarjetaCredito implements PagoConDescuento{
    @Override
    public void aplicarDescuento(double p){
        System.out.println("Aplicando descuento del "+p+"% con Tarjeta.");
    }

    @Override
    public void procesarPago(double m){
        System.out.println("Procesando pago de $"+m+" con Tarjeta.");
    }
}
