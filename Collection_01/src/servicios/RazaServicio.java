/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicios;
import entidad.raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ivan
 */

public class RazaServicio {
    public Scanner read;
    public ArrayList <raza> tipoDeRaza; // creamos un arraylist que contenga a los objetos Raza.

    /**
     * Creamos y inicializamos las variables
     */
    
    public RazaServicio() {
        this.tipoDeRaza = new ArrayList(); // inicializamos cuando la RazaServicios se inicialice
        this.read = new Scanner (System.in).useDelimiter("\n");
    }
    
    /**
     * Agregamos los atributos, ademas utilizamos el ".add" para aniadir datos al ArrayList
     */
    
    public void crearRaza() {
        System.out.println("----------Agregar Raza--------");
        System.out.println("Digite nombre");
        String nombre = read.next();
        
        System.out.println("Digite Raza");
        String nombreRaza = read.next();
        
        raza RR = new raza(nombre, nombreRaza);
        tipoDeRaza.add(RR);
    }
    
    public void mostrarRaza() {
        System.out.println("---------Razas Totales----------");
        
        for (raza object : tipoDeRaza) {// object recorre los tipos de raza
            System.out.println(object.toString()); // object recorre los to string
        }
    }
    
    public void agregarRaza() {
        int option;
        
        do {            
            crearRaza(); // llamamos la funcion 
            
            System.out.println("Agregar mas Razas?:  1 = si | 0 = no");
            option = read.nextInt();
            
        } while (option == 1);
    }
    public void buscarRaza() {
        System.out.println("----------Buscar/Remover Raza----------");
        System.out.println("Digite el tipo de Raza a eliminar");
        String raza = read.next();
        boolean check = false;
        
        Iterator <raza> it = tipoDeRaza.iterator();
        
        while (it.hasNext()) {
            raza next = it.next();

            if (next.getTipoRaza().equals(raza)) {
                it.remove();
                check = true;
            }
            
        }
        System.out.println("---------Final resultados---------");
        System.out.println((check) ? "La raza fue elminada" : "La raza no fue encontrada");
        System.out.println("Cantidad de elementos en la ArrayList: " + tipoDeRaza.size());
    }
}
