
package Kata2;
public class MainKata2{
    public static void main(String[] args){
        
        Figura[] arr=new Figura[2];

        arr[0]=new Circulo("Círculo Rojo",5.0);
        arr[1]=new Rectangulo("Rectángulo Azul",4.0,6.0);

        //recorro
        for(Figura f:arr){
            System.out.println("Figura: "+f.getNombre());
            System.out.println("Área: "+String.format("%.2f",f.calcularArea()));
            System.out.println("----------------");
        }
    }
}
