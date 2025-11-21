
package Kata4;

class Gato extends Animal{
    public Gato(String n){super(n);}

    @Override
    public void hacerSonido(){
        System.out.println(nombre+" dice: ¡Miau Miau!");
    }
}