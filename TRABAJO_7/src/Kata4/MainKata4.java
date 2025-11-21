
package Kata4;

import java.util.ArrayList;

public class MainKata4{
    public static void main(String[] args){
        ArrayList<Animal> lista=new ArrayList<>();

        lista.add(new Perro("Firulais"));
        lista.add(new Gato("Michi"));
        lista.add(new Vaca("Lola"));

        System.out.println("--- Sonidos de la granja ---");
        
        //recorro
        for(Animal a:lista){
            a.describirAnimal();
            a.hacerSonido();
            System.out.println();
        }
    }
}