
package Kata2;

public class Rectangulo extends Figura{
    private double base,altura;

    public Rectangulo(String n,double b,double a){
        super(n);
        this.base=b;
        this.altura=a;
    }

    @Override
    public double calcularArea(){
        return base*altura;
    }
}