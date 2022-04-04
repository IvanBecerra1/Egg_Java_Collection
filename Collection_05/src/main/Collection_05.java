
package main;
import entidad.Pais;
import servicios.PaisServicio;

public class Collection_05 {

    public static void main(String[] args) {
        PaisServicio serPais = new PaisServicio();
        Pais entidadPais = new Pais();
        
        entidadPais = serPais.agregarPais();
        serPais.mostrarPaises(entidadPais);
        serPais.removerPais(entidadPais);
    }
    
}
