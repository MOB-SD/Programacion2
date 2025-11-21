import Sistema_de_Stock.*;
import Biblioteca_Libros.*;
import Universidad.*;

public class Main{
    public static void main(String[] args){
        
        System.out.println("=== STOCK ===");
        Inventario inv=new Inventario();
        //agrego productos
        inv.agregarProducto(new Producto("P1","Laptop",1500.0,10,CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P2","Manzana",2.0,100,CategoriaProducto.ALIMENTOS));
        
        inv.listarProductos();
        inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("\n=== BIBLIOTECA ===");
        Biblioteca b=new Biblioteca();
        Autor a=new Autor("Gabriel García Márquez","Colombiana");
        b.agregarLibro("978-1","Cien Años de Soledad",1967,a);
        b.listarLibros();

        System.out.println("\n=== UNIVERSIDAD ===");
        Universidad u=new Universidad();
        
        Profesor p=new Profesor("PROF01","Dr. House");
        Curso c=new Curso("C01","Medicina I");
        
        u.agregarProfesor(p);
        u.agregarCurso(c);
        
        //asigno
        u.asignarProfesorACurso("C01","PROF01");
        
        u.listarProfesores();
    }
}