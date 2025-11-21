package Gestion_Gallinas_granjaDigital;

public class Gallina {
    // Atributos [cite: 285]
    int idGallina;
    int edad;
    int huevosPuestos;

    // Constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; // Todas empiezan con 0 huevos
    }

    // Métodos requeridos [cite: 286]

    /**
     * La gallina pone un huevo (incrementa el contador).
     */
    public void ponerHuevo() {
        this.huevosPuestos++;
        System.out.println("La gallina " + idGallina + " ha puesto un huevo.");
    }

    /**
     * La gallina envejece un año.
     */
    public void envejecer() {
        this.edad++;
        System.out.println("La gallina " + idGallina + " ahora tiene " + edad + " años.");
    }

    /**
     * Muestra el estado actual de la gallina.
     */
    public void mostrarEstado() {
        System.out.println("--- Estado Gallina ID: " + idGallina + " ---");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos Puestos: " + huevosPuestos);
        System.out.println("----------------------------");
    }
}