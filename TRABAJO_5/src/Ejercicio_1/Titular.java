package Ejercicio_1;

class Titular{
    public String nombre;
    public int dni;
    public Pasaporte pasaporte;

    public Titular(String n,int d){
        this.nombre=n;
        this.dni=d;
    }
    
    public void setPasaporte(Pasaporte p){
        this.pasaporte=p;
    }
}
