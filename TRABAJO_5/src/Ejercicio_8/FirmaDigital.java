
package Ejercicio_8;
class FirmaDigital{
    public String codigoHash,fecha;
    public UsuarioDigital usuario;

    public FirmaDigital(String hash,String f,UsuarioDigital u){
        this.codigoHash=hash;
        this.fecha=f;
        this.usuario=u;
    }
}