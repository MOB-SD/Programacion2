package Ejercicio_1;

class Pasaporte{
    public String numero,fechaEmision;
    public Foto foto;
    public Titular titular;

    public Pasaporte(String num,String fecha,Titular ti,String img,String fmt){
        this.numero=num;
        this.fechaEmision=fecha;
        
        //creo la foto
        this.foto=new Foto(img,fmt);
        
        //asigno titular y le paso este pasaporte
        this.titular=ti;
        this.titular.setPasaporte(this);
    }
}
