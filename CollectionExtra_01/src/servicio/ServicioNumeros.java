
package servicio;
import entidad.Numeros;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ServicioNumeros {
    
    public Numeros classNumeros = new Numeros();
    public Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void inicializar() {
        ArrayList <Integer> listNumero = new ArrayList();
        
        Integer num;
        
        do {
            
            System.out.println("Digite numero: ");
            num = read.nextInt();
            
            if (num != -99) {
                listNumero.add(num);
                classNumeros.setNumeros(listNumero);
            }
            
        } while (num != -99);
    }
    
    public void mostrarLista() {
        ArrayList <Integer> listNumero = classNumeros.getNumeros();
        
        for (Integer aux : listNumero) {
            System.out.println(aux);
        }
    }
    public void funcionesLista(){
        ArrayList <Integer> listNumero = classNumeros.getNumeros();
        int suma = 0;
        for (Integer aux : listNumero) {
            suma += aux;
        }
        
        System.out.println("Suma de numeros totales: " + suma);
        System.out.println("Promedio de los numeros: " + (suma/listNumero.size()));
    }
}
