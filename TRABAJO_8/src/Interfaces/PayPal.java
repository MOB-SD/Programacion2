
package Interfaces;

public class PayPal implements Pago{
    @Override
    public void procesarPago(double m){
        System.out.println("Procesando pago de $"+m+" vía PayPal.");
    }
}