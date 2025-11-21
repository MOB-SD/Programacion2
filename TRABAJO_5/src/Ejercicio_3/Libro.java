
package Ejercicio_3;

class Libro {
    public String titulo;
    public String isbn;
    public Autor autor; // Asociación Unidireccional
    public Editorial editorial; 

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
}