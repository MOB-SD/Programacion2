package Gestion_Gallinas_granjaDigital;

public class TestGallina {
    public static void main(String[] args) {
        // Tarea: Crear dos gallinas [cite: 287]
        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 1);
        System.out.println("Estado inicial:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        // Simular sus acciones [cite: 287]
        System.out.println("\n--- Simulando Acciones ---");
        gallina1.ponerHuevo();
        gallina1.ponerHuevo(); // Gallina 1 pone 2 huevos
        gallina2.ponerHuevo(); // Gallina 2 pone 1 huevo
        gallina1.envejecer(); // Gallina 1 envejece
        // Mostrar su estado final [cite: 287]
        System.out.println("\nEstado final:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}