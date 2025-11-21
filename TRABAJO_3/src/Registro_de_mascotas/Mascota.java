package Registro_de_mascotas;

public class Mascota {
    // Atributos [cite: 277]
    String nombre;
    String especie;
    int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Métodos requeridos [cite: 278]

    /**
     * Muestra la información de la mascota.
     */
    public void mostrarInfo() {
        System.out.println("--- Información de la Mascota ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("---------------------------------");
    }

    /**
     * Incrementa la edad de la mascota en 1.
     */
    public void cumplirAnios() {
        this.edad++; // Incrementa la edad
        System.out.println("¡Feliz cumpleaños " + nombre + "! Ahora tiene " + edad + " años.");
    }
}