package Ejercicio_2;

class Celular {
    public String imei;
    public String marca;
    public String modelo;
    public Bateria bateria; // Agregación
    public Usuario usuario; // Bidireccional

    // AGREGACIÓN: La batería viene de afuera (ya existe)
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; 
        
        this.usuario = usuario;
        this.usuario.setCelular(this); // Enlace bidireccional
    }
}