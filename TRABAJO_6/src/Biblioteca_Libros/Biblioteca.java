
package Biblioteca_Libros;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca{
    private List<Libro> lista;

    public Biblioteca(){
        this.lista=new ArrayList<>();
    }

    public void agregarLibro(String i,String t,int a,Autor aut){
        Libro l=new Libro(i,t,a,aut);
        lista.add(l);
    }

    public void listarLibros(){
        for(Libro x:lista){
            x.mostrarInfo();
            System.out.println("----------------");
        }
    }

    public Libro buscarLibroPorIsbn(String i){
        for(Libro x:lista){
            if(x.getIsbn().equals(i)){
                return x;
            }
        }
        return null;
    }

    public void filtrarLibrosPorAnio(int a){
        System.out.println("--- Libros del año "+a+" ---");
        for(Libro x:lista){
            if(x.getAnioPublicacion()==a){
                x.mostrarInfo();
            }
        }
    }

    public void mostrarAutoresDisponibles(){
        //lista aux
        List<String> aux=new ArrayList<>();
        System.out.println("--- Autores en Biblioteca ---");
        for(Libro x:lista){
            String n=x.getAutor().getNombre();
            if(!aux.contains(n)){
                aux.add(n);
                System.out.println("-" +n);
            }
        }
    }
}