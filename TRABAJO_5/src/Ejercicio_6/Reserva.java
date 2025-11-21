

package Ejercicio_6;
class Reserva{
    public String fecha,hora;
    public ClienteRestaurante cliente;
    public Mesa mesa;

    public Reserva(String f,String h,ClienteRestaurante c,Mesa m){
        this.fecha=f;
        this.hora=h;
        this.cliente=c;
        this.mesa=m;
    }
}