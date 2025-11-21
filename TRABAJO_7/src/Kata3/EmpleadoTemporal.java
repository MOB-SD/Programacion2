
package Kata3;

public class EmpleadoTemporal extends Empleado{
    private double valorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String n,double v,int h){
        super(n);
        this.valorHora=v;
        this.horasTrabajadas=h;
    }

    @Override
    public double calcularSueldo(){
        //calculo
        return valorHora*horasTrabajadas;
    }

    public String getFechaFinContrato(){
        return "30/12/2025";
    }
}