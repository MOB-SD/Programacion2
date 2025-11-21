package Sistema_Gestion_Empleados;

public class TestGestionEmpleados {
    public static void main(String[] args){

        System.out.println("=== SISTEMA DE GESTIÓN DE EMPLEADOS ===");

        //creo objetos
        Empleado emp1=new Empleado(101,"Bejarano Matias","Desarrollador Senior",150000);
        Empleado emp2=new Empleado("Bejarano Rene","Analista Funcional");
        Empleado emp3=new Empleado("Bejarano Lourdes","Tester QA");

        //imprimo como estan ahora
        System.out.println("\n--- Estado Inicial ---");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());


        System.out.println("\n--- Actualizando Salarios ---");
        //subo sueldo
        emp1.actualizarSalario(10.0);
        emp2.actualizarSalario(20000);

        //imprimo otra vez
        System.out.println("\n--- Estado Final ---");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        //total
        System.out.println("\n---------------------------------");
        System.out.println("Total de empleados creados: "+Empleado.mostrarTotalEmpleados());
        System.out.println("---------------------------------");
    }
}