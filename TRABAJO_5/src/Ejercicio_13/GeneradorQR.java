package Ejercicio_13;

class GeneradorQR{
    
    //hago el codigo
    public CodigoQR generar(String v,UsuarioQR u){
        System.out.println("Generando QR para "+u.nombre);
        return new CodigoQR(v,u);
    }
}