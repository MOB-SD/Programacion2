
package Ejercicio_4;

class TarjetaDeCredito{
    public String numero,fechaVencimiento;
    public Cliente cliente;
    public Banco banco;

    public TarjetaDeCredito(String num,String fecha,Cliente cli,Banco b){
        this.numero=num;
        this.fechaVencimiento=fecha;
        this.banco=b;

        //asocio el cliente
        this.cliente=cli;
        this.cliente.setTarjeta(this);
    }
}