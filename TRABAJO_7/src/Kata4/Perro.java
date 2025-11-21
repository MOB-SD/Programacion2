
package Kata4;

class Perro extends Animal{
    public Perro(String n){super(n);}

    @Override
    public void hacerSonido(){
        System.out.println(nombre+" dice: ¡Guau Guau!");
    }
}