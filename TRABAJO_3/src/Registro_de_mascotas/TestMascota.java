package Registro_de_mascotas;

public class TestMascota {
    public static void main(String[] args) {
        // Tarea: Crear una mascota [cite: 279]
        Mascota mascota1 = new Mascota("Fido", "Perro", 3);

        // Mostrar su información [cite: 279]
        mascota1.mostrarInfo();

        // Simular el paso del tiempo [cite: 279]
        System.out.println("\nSimulando el paso de un año...");
        mascota1.cumplirAnios();

        // Verificar los cambios [cite: 279]
        mascota1.mostrarInfo();
    }
}