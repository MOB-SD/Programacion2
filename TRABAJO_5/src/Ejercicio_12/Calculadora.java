
package Ejercicio_12;

class Calculadora{
    
    //calculo cosas
    public void calcular(Impuesto i){
        System.out.println("Calculando impuesto de: "+i.contribuyente.nombre);
        System.out.println("Monto total: "+i.monto);
    }
}
