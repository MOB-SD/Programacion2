package Kata3;
import java.util.ArrayList;

public class MainKata3{
    public static void main(String[] args){
        ArrayList<Empleado> lista=new ArrayList<>();

        lista.add(new EmpleadoPlanta("Carlos",500000,50000));
        lista.add(new EmpleadoTemporal("Ana",2000,160));

        //recorro la lista
        for(Empleado e:lista){
            System.out.println("Empleado: "+e.nombre);
            System.out.println("Sueldo: $"+e.calcularSueldo());

            //verifico tipo
            if(e instanceof EmpleadoPlanta){
                System.out.println("Tipo: Planta");
                EmpleadoPlanta p=(EmpleadoPlanta)e;
                System.out.println("Beneficio: "+p.getBeneficioPlanta());
            }else if(e instanceof EmpleadoTemporal){
                System.out.println("Tipo: Temporal");
                EmpleadoTemporal t=(EmpleadoTemporal)e;
                System.out.println("Fin contrato: "+t.getFechaFinContrato());
            }
            System.out.println("----------------");
        }
    }
}