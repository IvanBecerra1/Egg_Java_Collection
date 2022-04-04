
package servicio;
import entidad.Cantante;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;

public class ServicioCantante {
    public HashMap <Integer, Cantante> mapCantante = new HashMap(); 
    public Scanner read = new Scanner(System.in).useDelimiter("\n");
    public int count = 0;
    
    public void inicializar(int cant) {
        System.out.println("---------Agregar Cantante--------");
        
        String option;
        String nombre;
        
        Cantante classCantante;
        ArrayList <String> listDiscos;
        
        int j = 0;
        for (int i = 0 ; i < cant; i++) {
            classCantante = new Cantante();
            listDiscos = new ArrayList();
            
            System.out.println("Digite nombre de cantante (Cant: " + (count+1) + ")");
            nombre = read.nextLine();
            
            do {
                System.out.println("Digite disco: ");
                listDiscos.add(read.nextLine());
                
                System.out.println("Agregar mas discos? (si/no)");
                option = read.nextLine();
                
            } while (option.equals("si"));
            
            classCantante.setNombre(nombre);
            classCantante.setDiscos(listDiscos);
            mapCantante.put(count, classCantante);
            count++;
        }
        mostrarMenu();
    }
    
    public void mostrarMenu() {
        System.out.println("---------Menu Principal--------");
        String option;
        do {
            System.out.println("1. Agregar cantante");
            System.out.println("2. mostrar cantante");
            System.out.println("3. eliminar cantante");
            System.out.println("Exit = salir");
            
            option = read.next();

            switch (option) {
                case "1": read.skip("\n"); inicializar(1); break;
                case "2": mostrarCantante(); break;
                case "3": eliminarCantante(); break;
                case "salir": break;
            }
            
        } while (!option.equals("salir"));
        
    }
   
    public void mostrarCantante() {
        System.out.println("--------Lista de Cantantes--------");
        for (Map.Entry<Integer, Cantante> entry : mapCantante.entrySet()) {
            Integer key = entry.getKey();
            Cantante value = entry.getValue();
            System.out.println("C." + key +  " " + value.toString());
        }
        mostrarMenu();
    }
    
    public void eliminarCantante() {
        System.out.println("---------Remover Cantante----------");

        System.out.println("Digite #C: ");
        int numeroCantante = read.nextInt();
        boolean check = false;
        
        
        for (Map.Entry<Integer, Cantante> entry : mapCantante.entrySet()) {
            Integer key = entry.getKey();
            Cantante value = entry.getValue();
            
            if (key == numeroCantante) { 
                check = true;
                break;
            }
        }
        
        if (check) {
            mapCantante.remove(numeroCantante);
        }
        
        System.out.println(check ? "Se borro el Cantante" : "No se Pudo encontrar el cantante");
        mostrarMenu();
    
    }
}
