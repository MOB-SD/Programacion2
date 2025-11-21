package Ejercicio_2;

class Usuario {
    public String nombre;
    public int dni;
    public Celular celular;

    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setCelular(Celular celular) {
        this.celular = celular;
    }
}