
package Ejercicio_8;
class Documento{
    public String titulo,contenido;
    public FirmaDigital firma;

    public Documento(String t,String c,UsuarioDigital u,String hash,String f){
        this.titulo=t;
        this.contenido=c;
        
        //hago la firma aqui
        this.firma=new FirmaDigital(hash,f,u);
    }
}