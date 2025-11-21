package Simulacion_Nave;

public class TestNaveEspacial {
    public static void main(String[] args) {
        // Tarea: Crear una nave con 50 unidades de combustible [cite: 300]
        NaveEspacial miNave = new NaveEspacial("Enterprise", 50.0);
        miNave.mostrarEstado();

        // Intentar avanzar sin recargar (debería fallar si la distancia es > 50)
        System.out.println("\n--- 1. Intento de avance largo ---");
        miNave.avanzar(70); // Fallará

        // Luego recargar
        System.out.println("\n--- 2. Recarga ---");
        miNave.recargarCombustible(30); // Sube a 80

        // Y avanzar correctamente [cite: 300]
        System.out.println("\n--- 3. Intento de avance corto ---");
        miNave.avanzar(60); // Exitoso, queda 20

        // Mostrar el estado al final [cite: 301]
        System.out.println("\n--- ESTADO FINAL ---");
        miNave.mostrarEstado();
        
        // Prueba de despegue (opcional, para probar el método)
        NaveEspacial nave2 = new NaveEspacial("Halcón Milenario", 5.0);
        nave2.despegar(); // Fallará
        nave2.recargarCombustible(100);
        nave2.despegar(); // Exitoso
    }
}