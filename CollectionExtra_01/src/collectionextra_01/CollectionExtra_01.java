/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionextra_01;
import servicio.ServicioNumeros;
/**
 *
 * @author ivan
 */
public class CollectionExtra_01 {

    /**
     * @param args the command line arguments
     * 
     * Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
    los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
    introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
    programa mostrará por pantalla el número de valores que se han leído, su suma y su
    media (promedio).
    * 
     */
    public static void main(String[] args) {
        
        ServicioNumeros serviceNum = new ServicioNumeros();

        serviceNum.inicializar();
        serviceNum.mostrarLista();
        serviceNum.funcionesLista();
    }
    
}
