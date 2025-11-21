
package Sistema_de_Stock;

public enum CategoriaProducto{
    ALIMENTOS("Productos comestibles"),ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),HOGAR("Artículos para el hogar");

    private String descripcion;

    CategoriaProducto(String d){
        this.descripcion=d;
    }

    public String getDescripcion(){
        return descripcion;
    }
}