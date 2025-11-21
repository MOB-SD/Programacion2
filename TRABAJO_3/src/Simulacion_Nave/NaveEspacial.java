package Simulacion_Nave;

public class NaveEspacial {
    // Atributos [cite: 297]
    private String nombre;
    private double combustible;
    private final double MAX_COMBUSTIBLE = 100.0; // Límite para recargar
    private final double GASTO_DESPEGUE = 10.0;
    
    // Constructor
    public NaveEspacial(String nombre, double combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }

    // Métodos requeridos [cite: 298]
    
    /**
     * Intenta despegar, gastando combustible.
     */
    public void despegar() {
        System.out.println("\nIniciando secuencia de despegue para " + nombre + "...");
        if (this.combustible >= GASTO_DESPEGUE) {
            this.combustible -= GASTO_DESPEGUE;
            System.out.println("¡Despegue exitoso! Combustible restante: " + this.combustible);
        } else {
            System.out.println("Fallo en el despegue. Combustible insuficiente.");
        }
    }

    /**
     * Avanza la distancia indicada si tiene combustible.
     * Regla: Asumimos 1 unidad de combustible por unidad de distancia.
     */
    public void avanzar(double distancia) {
        System.out.println("\nIntentando avanzar " + distancia + " unidades...");
        // Regla: Validar que haya suficiente combustible [cite: 299]
        if (this.combustible >= distancia) {
            this.combustible -= distancia;
            System.out.println("Avance exitoso. Combustible restante: " + this.combustible);
        } else {
            System.out.println("Fallo al avanzar. Combustible insuficiente.");
            System.out.println("Solo se podría avanzar " + this.combustible + " unidades.");
        }
    }

    /**
     * Recarga combustible, sin superar el máximo.
     */
    public void recargarCombustible(double cantidad) {
        System.out.println("\nRecargando " + cantidad + " unidades de combustible...");
        // Regla: Evitar que se supere el límite [cite: 299]
        if (this.combustible + cantidad > MAX_COMBUSTIBLE) {
            double recargado = MAX_COMBUSTIBLE - this.combustible;
            this.combustible = MAX_COMBUSTIBLE;
            System.out.println("Tanque lleno. Se recargaron solo " + recargado + " unidades.");
        } else {
            this.combustible += cantidad;
            System.out.println("Recarga exitosa.");
        }
        mostrarEstado();
    }

    /**
     * Muestra el estado actual de la nave.
     */
    public void mostrarEstado() {
        System.out.println("--- Estado Nave: " + nombre + " ---");
        System.out.println("Combustible: " + combustible + " / " + MAX_COMBUSTIBLE);
        System.out.println("------------------------------");
    }
}