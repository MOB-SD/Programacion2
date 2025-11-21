package Sistema_Gestion_Empleados;

public class Empleado {

    //variables
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados=0;

    //constructor con todo
    public Empleado(int id,String nombre,String puesto,double salario){
        this.id=id;
        this.nombre=nombre;
        this.puesto=puesto;
        this.salario=salario;
        totalEmpleados=totalEmpleados+1;
    }

    //otro constructor
    public Empleado(String nombre,String puesto){
        this.nombre=nombre;
        this.puesto=puesto;
        //le pongo id automatico
        this.id=1000+totalEmpleados+1;
        this.salario=50000.0;
        totalEmpleados=totalEmpleados+1;
    }

    //metodo para subir sueldo con porcentaje
    public void actualizarSalario(double porcentaje){
        double aumento=this.salario*(porcentaje/100);
        this.salario=this.salario+aumento;
        System.out.println(">> Salario de "+this.nombre+" aumentado un "+porcentaje+"%.");
    }

    //metodo para subir sueldo fijo
    public void actualizarSalario(int cantidadFija){
        this.salario=this.salario+cantidadFija;
        System.out.println(">> Salario de "+this.nombre+" aumentado en $"+cantidadFija+" fijos.");
    }

    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

    @Override
    public String toString(){
    return "Empleado { "+"ID: "+this.id+" | Nombre: "+this.nombre+" | Puesto: "+this.puesto+" | Salario: $"+this.salario+" }";
    }

    //get y set
    public int getId(){ return id; }
    public void setId(int id){this.id=id;}
    public String getNombre(){ return nombre; }
    public void setNombre(String nombre){this.nombre=nombre;}
    public String getPuesto(){ return puesto; }
    public void setPuesto(String puesto){this.puesto=puesto;}
    public double getSalario(){ return salario; }
    public void setSalario(double salario){this.salario=salario;}
}