
package Kata4;

class Vaca extends Animal{
    public Vaca(String n){super(n);}

    @Override
    public void hacerSonido(){
        System.out.println(nombre+" dice: ¡Muuuuu!");
    }
}