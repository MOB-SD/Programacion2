
package Interfaces;

public class Producto implements Pagable{
    private String n;
    private double p;

    public Producto(String n,double p){
        this.n=n;
        this.p=p;
    }

    public String getNombre(){return n;}

    @Override
    public double calcularTotal(){return this.p;}
    
    @Override
    public String toString(){
        return n+" ($"+p+")";
    }
}