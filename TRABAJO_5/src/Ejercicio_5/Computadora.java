
package Ejercicio_5;

class Computadora{
    public String marca,numeroSerie;
    public PlacaMadre placaMadre;
    public Propietario propietario;

    public Computadora(String m,String s,Propietario p,String mod,String chip){
        this.marca=m;
        this.numeroSerie=s;

        //creo la placa aca
        this.placaMadre=new PlacaMadre(mod,chip);

        this.propietario=p;
        //le paso la compu al dueño
        this.propietario.setComputadora(this);
    }
}