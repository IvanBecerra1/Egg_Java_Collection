package servicio;

import entidad.Libreria;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ServicioLibreria {

    private HashSet<Libreria> hashLibreria = new HashSet();
    private Scanner read = new Scanner(System.in);

    public void menuPrincipal(boolean recuMenu) {
        if (recuMenu == false) 
            return;
        
        String option;
        System.out.println("--------Menu Principal---------");
        System.out.println("1. prestamo libro");
        System.out.println("2. devolver libro");
        System.out.println("\nSalir: salir");

        option = read.nextLine();

        switch (option) {
            case "1": {
                agregarLibro(true);
                break;
            }
            case "2": {
                System.out.println("opcion 2");
                mostrarLibros(0);
                break;
            }
            case "Salir": {
                recuMenu = false;
                System.out.println("Funcion Terminada");
                break;
            }
        }
        menuPrincipal(recuMenu);
    }

    public void agregarLibro(boolean recuMenu) {
        
        System.out.println("-------Agregar Libros----------");
        Libreria classLibreria = new Libreria();
        String option;

        System.out.print("Titulo: ");
        classLibreria.setLibro(read.nextLine());

        System.out.print("\n" + "Autor: ");
        classLibreria.setAutor(read.nextLine());

        hashLibreria.add(classLibreria);

        System.out.println("agregar mas libros? (si/no)");
        option = read.next();
        read.skip("\n");
        
        switch (option) {
            case "si": agregarLibro(true); break;
        }
    }
    
    public void mostrarLibros(int i) {
        ArrayList <Libreria> listLibreria = new ArrayList(hashLibreria);
        
        if (i < hashLibreria.size()) {
            System.out.println(listLibreria.get(i).toString());
            mostrarLibros(i + 1);
        }
        else {
            System.out.println("fin de la funcion");
            return;
        }
        
//        }
//        // has.get(i).metodos;
//        
//        for (Libreria aux : hashLibreria) {
//            System.out.println(aux.toString());
//        }
    }
}
