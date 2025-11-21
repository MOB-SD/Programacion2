
package Kata2;

public class Circulo extends Figura{
    private double radio;

    public Circulo(String n,double r){
        super(n);
        this.radio=r;
    }

    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
}
