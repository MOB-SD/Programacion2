
package Biblioteca_Libros;

public class Libro{
    private String isbn,titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String i,String t,int anio,Autor a){
        this.isbn=i;
        this.titulo=t;
        this.anioPublicacion=anio;
        this.autor=a;
    }

    public String getIsbn(){return isbn;}
    public int getAnioPublicacion(){return anioPublicacion;}
    public Autor getAutor(){return autor;}

    public void mostrarInfo(){
        System.out.println("Libro: "+titulo+" (ISBN: "+isbn+", Año: "+anioPublicacion+")");
        autor.mostrarInfo();
    }
}