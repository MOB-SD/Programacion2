
package Universidad;

public class Curso{
    private String codigo,nombre;
    private Profesor profesor;

    public Curso(String c,String n){
        this.codigo=c;
        this.nombre=n;
    }

    public String getCodigo(){return codigo;}
    public String getNombre(){return nombre;}
    public Profesor getProfesor(){return profesor;}

    //cambio el profe
    public void setProfesor(Profesor p){
        //saco el viejo
        if(this.profesor!=null){
            this.profesor.eliminarCursoInterno(this);
        }

        this.profesor=p;

        //pongo el nuevo
        if(this.profesor!=null){
            this.profesor.agregarCursoInterno(this);
        }
    }

    public void mostrarInfo(){
        String nom=(profesor!=null)?profesor.getNombre():"Sin asignar";
        System.out.println("Curso: "+nombre+" ("+codigo+") | Prof: "+nom);
    }
}
