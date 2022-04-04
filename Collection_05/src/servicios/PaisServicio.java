
package servicios;

import entidad.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisServicio {
    private Scanner read = new Scanner(System.in);
    
    public Pais agregarPais(){
        HashSet <String> conjuntoPais = new HashSet();
        Pais entidadPais = new Pais();
        int option;
        
        do { 
            System.out.println("-----------Agregar Paises-----------");
            System.out.println("Agregar pais: ");
            conjuntoPais.add(read.nextLine());
            
            entidadPais.setPais(conjuntoPais);
            
            System.out.println("Agregar mas Paises? si = 1 | no = 0");
            option = read.nextInt();
            read.skip("\n");
        } while (option == 1);
        
        return entidadPais;
    }
    
    public void mostrarPaises(Pais entidadPais) {
        System.out.println("----------Total Paises-----------");
        HashSet <String> conjuntoPais = new HashSet();
        conjuntoPais = entidadPais.getPais();
        
        for (String aux : conjuntoPais) {
            System.out.println(aux.toString());
        }
    }
    
    public void removerPais(Pais entidadPais) {
        System.out.println("----------Remover Pais------------");
        String tipoPais = read.nextLine();
        boolean check = false;

        HashSet <String> conjunto = new HashSet();
        conjunto = entidadPais.getPais();
        Iterator <String> it = conjunto.iterator();
        
        while (it.hasNext()) {
            String next = it.next();
            
            if (next.equals(tipoPais)) {
                it.remove();
                check = true;
            }
        }
        
        System.out.println(check ? "se borro el pais" : "no se pudo encontrar el pais");
        mostrarPaises(entidadPais);
    }
}
