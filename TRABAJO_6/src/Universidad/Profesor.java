
package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Profesor{
    private String id,n;
    private List<Curso> lista;

    public Profesor(String id,String n){
        this.id=id;
        this.n=n;
        this.lista=new ArrayList<>();
    }

    public String getId(){return id;}
    public String getNombre(){return n;}
    public List<Curso> getCursos(){return lista;}

    //agrego
    public void agregarCursoInterno(Curso c){
        if(!lista.contains(c)){
            lista.add(c);
        }
    }

    //borro
    public void eliminarCursoInterno(Curso c){
        lista.remove(c);
    }

    public void mostrarInfo(){
        System.out.println("Profesor: "+n+" | Cursos asignados: "+lista.size());
    }
}