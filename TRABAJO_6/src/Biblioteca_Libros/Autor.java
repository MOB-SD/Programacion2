
package Biblioteca_Libros;

public class Autor{
    private String nombre,nacionalidad;

    public Autor(String n,String nac){
        this.nombre=n;
        this.nacionalidad=nac;
    }

    public String getNombre(){return nombre;}

    public void mostrarInfo(){
        System.out.println("Autor: "+nombre+" ("+nacionalidad+")");
    }
}