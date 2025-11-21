
package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable{
    private List<Producto> lista;
    private Cliente c;
    private String est;

    public Pedido(Cliente c){
        this.lista=new ArrayList<>();
        this.c=c;
        this.est="CREADO";
    }

    public void agregarProducto(Producto p){lista.add(p);}

    @Override
    public double calcularTotal(){
        double t=0;
        for(Producto p:lista){
            t=t+p.calcularTotal();
        }
        return t;
    }
    
    public void cambiarEstado(String ne){
        this.est=ne;
        //le aviso al cliente
        c.notificar("Tu pedido ha cambiado al estado: "+ne);
    }
}
