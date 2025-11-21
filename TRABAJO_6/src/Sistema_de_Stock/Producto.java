
package Sistema_de_Stock;

public class Producto{
    private String id,nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id,String n,double p,int cant,CategoriaProducto cat){
        this.id=id;
        this.nombre=n;
        this.precio=p;
        this.cantidad=cant;
        this.categoria=cat;
    }

    //getters y setters
    public String getId(){return id;}
    public int getCantidad(){return cantidad;}
    public void setCantidad(int cant){this.cantidad=cant;}
    public CategoriaProducto getCategoria(){return categoria;}
    public double getPrecio(){return precio;}

    public void mostrarInfo(){
        System.out.println("ID: "+id+" | "+nombre+" | $"+precio+" | Stock: "+cantidad+" | Cat: "+categoria);
    }
}
