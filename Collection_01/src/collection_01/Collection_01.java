
package collection_01;
import java.util.Scanner;
import servicios.RazaServicio;

/**
 * ACTIVDAD 1 DE COLLECTION, ESTA ACTIVIDAD ESTA SUJETA TAMBIEN
 * CON LA ACTIVIDAD 2.
 * @author ivan
 */
public class Collection_01 {

    public static void main(String[] args) {
        RazaServicio service = new RazaServicio();
        service.agregarRaza();
        service.mostrarRaza();
        service.buscarRaza();
        service.mostrarRaza();
    }
    
}
