package Encapsulamiento_Clase_Lbro;

public class TestLibro {
    public static void main(String[] args) {
        // Tarea: Crear un libro [cite: 283]
        // Se crea con un año inicial (ej. 0) para forzar la validación
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        libro1.mostrarInfo();

        // Intentar modificar el año con un valor inválido [cite: 283]
        System.out.println("\nIntentando modificar a un año inválido (2050)...");
        libro1.setAnioPublicacion(2050);
        
        // Mostrar la información final (debería seguir siendo 1967)
        libro1.mostrarInfo();

        // Intentar modificar con uno válido [cite: 283]
        System.out.println("\nIntentando modificar a un año válido (1970)...");
        libro1.setAnioPublicacion(1970);

        // Mostrar la información final (debería ser 1970)
        libro1.mostrarInfo();
    }
}