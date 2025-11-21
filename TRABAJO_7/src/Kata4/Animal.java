
package Kata4;

public class Animal{
    protected String nombre;

    public Animal(String n){
        this.nombre=n;
    }

    public void hacerSonido(){
        System.out.println("El animal hace un sonido genérico.");
    }

    public void describirAnimal(){
        System.out.println("Este es un animal llamado "+nombre);
    }
}