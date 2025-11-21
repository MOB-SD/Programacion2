
package Interfaces;

public class Cliente implements Notificable{
    private String n;

    public Cliente(String n){this.n=n;}

    @Override
    public void notificar(String msg){
        System.out.println(">>> Notificación para "+n+": "+msg);
    }
}
