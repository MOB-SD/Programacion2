package Registro_de_Estudiantes;

public class Estudiante {
    // Atributos [cite: 272]
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    // Constructor para inicializar el estudiante
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Métodos requeridos [cite: 273]
    
    /**
     * Muestra la información completa del estudiante.
     */
    public void mostrarInfo() {
        System.out.println("--- Información del Estudiante ---");
        System.out.println("Nombre Completo: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println("----------------------------------");
    }

    /**
     * Sube la calificación por la cantidad de puntos indicada.
     */
    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        System.out.println("Se subió la calificación " + puntos + " puntos.");
    }

    /**
     * Baja la calificación por la cantidad de puntos indicada.
     */
    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        System.out.println("Se bajó la calificación " + puntos + " puntos.");
    }
}