package Encapsulamiento_Clase_Lbro;

import java.time.LocalDate; // Para obtener el año actual

public class Libro {
    // Atributos privados [cite: 281]
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        // Usamos el setter para la validación inicial
        this.setAnioPublicacion(anioPublicacion);
    }

    // --- Métodos Requeridos (Getters y Setters) --- [cite: 282]

    // Getters para todos los atributos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Setter con validación para añoPublicacion [cite: 282]
    public void setAnioPublicacion(int anio) {
        int anioActual = LocalDate.now().getYear();
        
        // Validación: El año no puede ser negativo ni futuro
        if (anio > 0 && anio <= anioActual) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("Error: El año " + anio + " es inválido.");
            System.out.println("El año de publicación debe ser entre 1 y " + anioActual + ".");
            // Opcional: No se actualiza y se mantiene el valor anterior (si ya tenía uno)
        }
    }
    
    // Método extra para mostrar la información (usando getters)
    public void mostrarInfo() {
        System.out.println("--- Ficha del Libro ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año: " + getAnioPublicacion());
        System.out.println("-----------------------");
    }
}