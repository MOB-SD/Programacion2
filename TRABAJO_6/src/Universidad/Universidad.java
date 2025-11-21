
package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad{
    private List<Profesor> profs;
    private List<Curso> cursos;

    public Universidad(){
        this.profs=new ArrayList<>();
        this.cursos=new ArrayList<>();
    }

    public void agregarProfesor(Profesor p){profs.add(p);}
    public void agregarCurso(Curso c){cursos.add(c);}

    public Profesor buscarProfesor(String id){
        for(Profesor p:profs){
            if(p.getId().equals(id))return p;
        }
        return null;
    }

    public Curso buscarCurso(String cod){
        for(Curso c:cursos){
            if(c.getCodigo().equals(cod))return c;
        }
        return null;
    }

    //asignar profe
    public void asignarProfesorACurso(String cod,String idProf){
        Curso c=buscarCurso(cod);
        Profesor p=buscarProfesor(idProf);

        if(c!=null&&p!=null){
            c.setProfesor(p);
            System.out.println("Asignación exitosa.");
        }else{
            System.out.println("Error: Curso o Profesor no encontrado.");
        }
    }

    public void listarCursos(){
        System.out.println("-- Lista de Cursos --");
        for(Curso c:cursos)c.mostrarInfo();
    }

    public void listarProfesores(){
        System.out.println("-- Lista de Profesores --");
        for(Profesor p:profs){
            p.mostrarInfo();
            //muestro cursos del profe
            for(Curso c:p.getCursos()){
                System.out.println("   -> Dicta: "+c.getNombre());
            }
        }
    }

    public void eliminarProfesor(String id){
        Profesor p=buscarProfesor(id);
        if(p!=null){
            //hago copia de la lista para no romper todo
            List<Curso> aux=new ArrayList<>(p.getCursos());
            for(Curso c:aux){
                c.setProfesor(null);
            }
            profs.remove(p);
            System.out.println("Profesor eliminado y cursos liberados.");
        }
    }
}
