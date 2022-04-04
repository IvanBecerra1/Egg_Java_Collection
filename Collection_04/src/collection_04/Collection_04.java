/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection_04;
import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.PeliculaServicio;
/**
 *
 * @author ivan
 */
public class Collection_04 {

    /**
     * @param args the command line arguments
     * 
     * 
     * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
    esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
    horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
    cuenta lo que se pide a continuación:

    En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
    usuario todos sus datos y guardándolos en el objeto Pelicula.
    Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
    quiere crear otra Pelicula o no.
    Después de ese bucle realizaremos las siguientes acciones:
    • Mostrar en pantalla todas las películas.
    • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
    en pantalla.
    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
    en pantalla.
    • Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    * 
     */
    public static void main(String[] args) {
        Scanner read = new Scanner ( System.in );
        
        PeliculaServicio servicePeli = new PeliculaServicio();
        ArrayList <Pelicula> listPelicula = new ArrayList<>();
        
        String titulo, director, palabra ;
        int duracion;

        do {
            System.out.println("----------Crear Pelicula-----------");
            
            System.out.println("Digite titulo: ");
            titulo = read.nextLine();
            
            System.out.println("Digite director: ");
            director = read.nextLine();
            
            System.out.println("Digite duracion (horas): ");
            duracion = read.nextInt();
            read.skip("\n");
            
            listPelicula.add(new Pelicula(titulo, director, duracion));

            System.out.println("Agregar mas peliculas? si / no");
            palabra = read.next();
            read.skip("\n");
        }
        while (palabra.equals("si"));
        
        servicePeli.mostrarPeliculas(listPelicula);
        servicePeli.mostrarDuracion(listPelicula);
        servicePeli.ordernarDuracion(listPelicula);
        servicePeli.ordernarDuracionMenor(listPelicula);
        servicePeli.ordenarTitulo(listPelicula);
        servicePeli.ordenarTitulo(listPelicula);
        
    }
    
}
