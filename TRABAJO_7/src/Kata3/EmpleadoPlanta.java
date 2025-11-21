
package Kata3;

public class EmpleadoPlanta extends Empleado{
    private double sueldoBasico,bonoAntiguedad;

    public EmpleadoPlanta(String n,double sb,double bono){
        super(n);
        this.sueldoBasico=sb;
        this.bonoAntiguedad=bono;
    }

    @Override
    public double calcularSueldo(){
        return sueldoBasico+bonoAntiguedad;
    }

    public String getBeneficioPlanta(){
        return "Obra social completa";
    }
}