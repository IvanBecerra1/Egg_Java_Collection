/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;
import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import static utilidades.Comparadores.compararDirector;
import static utilidades.Comparadores.compararDuracion;
import static utilidades.Comparadores.compararDuracionMenor;
import static utilidades.Comparadores.compararTitulo;

public class PeliculaServicio {
    public void mostrarPeliculas(ArrayList <Pelicula> listPelicula) {
        System.out.println("---------Total Peliculas-----------");
        
        for (Pelicula aux : listPelicula) {
            System.out.println(aux.toString());
        }
    }
    public void mostrarDuracion(ArrayList <Pelicula> listPelicula) {
        System.out.println("----------Peliculas con duracion > 1 Hs----------");
        for (int i = 0; i < listPelicula.size(); i ++) {
            if (listPelicula.get(i).getDuracion() > 1) {
                System.out.println(listPelicula.get(i).toString());
            }
        }
    }
    
    public void ordernarDuracion(ArrayList <Pelicula> listPelicula) {
        System.out.println("----------Ordenamiento mayor a menor Duracion-----------");
        Collections.sort(listPelicula, compararDuracion);
        
        mostrarPeliculas(listPelicula);
    }
    
    public void ordernarDuracionMenor(ArrayList <Pelicula> listPelicula) {
        System.out.println("----------Ordenamiento menor a mayor Duracion-----------");
        Collections.sort(listPelicula, compararDuracionMenor);
        mostrarPeliculas(listPelicula);
    }
    
    public void ordenarTitulo(ArrayList <Pelicula> listPelicula) {
        System.out.println("----------Ordenamiento Titulo----------");
        Collections.sort(listPelicula, compararTitulo);
        mostrarPeliculas(listPelicula);

    }
    
    public void ordenarDirector(ArrayList <Pelicula> listPelicula) {
        System.out.println("----------Ordenamiento Director------------");
        Collections.sort(listPelicula, compararDirector);
        mostrarPeliculas(listPelicula);

    }
}
