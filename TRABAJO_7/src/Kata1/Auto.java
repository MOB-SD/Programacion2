
package Kata1;

public class Auto extends Vehiculo{
    private int cp;

    public Auto(String m,String mod,int c){
        super(m,mod);
        this.cp=c;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Puertas: "+cp);
    }
}