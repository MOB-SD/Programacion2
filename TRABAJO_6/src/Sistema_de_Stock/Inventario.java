package Sistema_de_Stock;

import java.util.ArrayList;

public class Inventario{
    private ArrayList<Producto> lista;

    public Inventario(){
        this.lista=new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        lista.add(p);
    }

    public void listarProductos(){
        for(Producto p:lista){
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id){
        for(Producto p:lista){
            if(p.getId().equalsIgnoreCase(id)){
                return p;
            }
        }
        return null; //no esta
    }

    public void eliminarProducto(String id){
        Producto p=buscarProductoPorId(id);
        if(p!=null){
            lista.remove(p);
            System.out.println("Producto eliminado.");
        }else{
            System.out.println("Producto no encontrado.");
        }
    }

    public void actualizarStock(String id,int cant){
        Producto p=buscarProductoPorId(id);
        if(p!=null){
            p.setCantidad(cant);
            System.out.println("Stock actualizado.");
        }
    }

    public void filtrarPorCategoria(CategoriaProducto cat){
        System.out.println("--- Productos en "+cat+" ---");
        for(Producto p:lista){
            if(p.getCategoria()==cat){
                p.mostrarInfo();
            }
        }
    }

    public int obtenerTotalStock(){
        int t=0; //acumulador
        for(Producto p:lista){
            t=t+p.getCantidad();
        }
        return t;
    }

    public Producto obtenerProductoConMayorStock(){
        if(lista.isEmpty()) return null;
        Producto mayor=lista.get(0);
        
        //recorro para buscar el mayor
        for(Producto p:lista){
            if(p.getCantidad()>mayor.getCantidad()){
                mayor=p;
            }
        }
        return mayor;
    }

    public void filtrarProductosPorPrecio(double min,double max){
        System.out.println("--- Productos entre $"+min+" y $"+max+" ---");
        for(Producto p:lista){
            if(p.getPrecio()>=min && p.getPrecio()<=max){
                p.mostrarInfo();
            }
        }
    }
    
    public void mostrarCategoriasDisponibles(){
        for(CategoriaProducto c:CategoriaProducto.values()){
            System.out.println(c+": "+c.getDescripcion());
        }
    }
}