
package Interfaces;
import java.io.*;
import java.util.Scanner;

public class MainExcepciones{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("--- EJERCICIO 1 ---");
        dividir(sc);

        System.out.println("\n--- EJERCICIO 2 ---");
        convertir(sc);

        System.out.println("\n--- EJERCICIO 3 ---");
        leerMal();

        System.out.println("\n--- EJERCICIO 4 ---");
        validar(sc);

        System.out.println("\n--- EJERCICIO 5 ---");
        leerBien();
        
        sc.close();
    }

    //1. division
    public static void dividir(Scanner sc){
        try{
            System.out.print("Numerador: ");
            int n1=Integer.parseInt(sc.nextLine());
            System.out.print("Divisor: ");
            int n2=Integer.parseInt(sc.nextLine());
            
            int r=n1/n2;
            System.out.println("Res: "+r);
        }catch(ArithmeticException e){
            System.out.println("Error: division por cero.");
        }catch(NumberFormatException e){
            System.out.println("Error: numeros enteros por favor.");
        }
    }

    //2. string a int
    public static void convertir(Scanner sc){
        System.out.print("Numero entero: ");
        String t=sc.nextLine();
        try{
            int n=Integer.parseInt(t);
            System.out.println("Ok: "+n);
        }catch(NumberFormatException e){
            System.out.println("Eso no es un numero.");
        }
    }

    //3. archivo que no existe
    public static void leerMal(){
        File f=new File("no_existe.txt");
        try{
            Scanner l=new Scanner(f);
            while(l.hasNextLine()) System.out.println(l.nextLine());
            l.close();
        }catch(FileNotFoundException e){
            System.out.println("Error: Archivo no encontrado.");
        }
    }

    //4. excepcion propia
    public static void validar(Scanner sc){
        System.out.print("Edad: ");
        try{
            int e=Integer.parseInt(sc.nextLine());
            check(e);
            System.out.println("Edad ok.");
        }catch(EdadInvalidaException e){
            System.out.println("Excepcion: "+e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Error de formato.");
        }
    }

    public static void check(int e) throws EdadInvalidaException{
        if(e<0||e>120) throw new EdadInvalidaException("Edad "+e+" incorrecta.");
    }

    //5. try resources
    public static void leerBien(){
        File f=new File("lectura.txt");
        
        //el try cierra solo
        try(BufferedReader br=new BufferedReader(new FileReader(f))){
            String l;
            while((l=br.readLine())!=null){
                System.out.println(l);
            }
        }catch(IOException e){
            System.out.println("Error IO: "+e.getMessage());
        }
    }
}
