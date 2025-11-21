package Registro_de_Estudiantes;

public class TestEstudiante {
    public static void main(String[] args) {
        // Tarea: Instanciar a un estudiante [cite: 275]
        Estudiante est1 = new Estudiante("Juan", "Pérez", "Programación II", 8.5);

        // Mostrar su información [cite: 275]
        est1.mostrarInfo();

        // Aumentar calificación [cite: 275]
        est1.subirCalificacion(1.0);
        est1.mostrarInfo();

        // Disminuir calificación [cite: 275]
        est1.bajarCalificacion(0.5);
        est1.mostrarInfo();
    }
}