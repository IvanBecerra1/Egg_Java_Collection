
package entidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Alumno {
    public String nombre;
    public ArrayList <Integer> notasArray;
    public Scanner read = new Scanner ( System.in ).useDelimiter("\n");
    
    public Alumno(){
        notasArray = new ArrayList<>();
    }
    
    public Alumno(String nombre, ArrayList <Integer> notas){
        this.nombre = nombre;
        this.notasArray = notas;
    }
    public Alumno crearAlumno(){
        Alumno newAlumno = new Alumno();
        ArrayList <Integer> notas = new ArrayList();
        
        System.out.println("----------Crear Alumno-----------");
        System.out.println("Digite el nombe");
        String nombre = read.next();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota (" + (i+1) + "): ");
            notas.add(read.nextInt());
        }
        
        newAlumno.setNombre(nombre);
        newAlumno.setNotasArray(notas);
        
        return newAlumno;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList getNotasArray() {
        return notasArray;
    }

    public void setNotasArray(ArrayList <Integer> notas) {
        this.notasArray = notas;
    }
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notasArray=" + notasArray + '}';
    }
    
    public void notaFinal(ArrayList < Alumno > alumnoRegistro) {
       System.out.println("-----------Buscar nota Alumno----------");
       String nombre = read.next();
       
       ArrayList <Integer> notasAlumno;
       Iterator <Alumno> it = alumnoRegistro.iterator();
       
       while (it.hasNext()) {
           Alumno next = it.next();
           
           if (next.getNombre().equals(nombre)) {
               notasAlumno = next.getNotasArray();
               System.out.println("Datos del Alumno: " + next.getNombre());
               System.out.println("Notas=" + notasAlumno);
               System.out.println("Promedio: " 
               + (notasAlumno.get(0) + notasAlumno.get(1) + notasAlumno.get(2))/3);
               break;
           }
           else {
               System.out.println("No se encontro el alumno");
               break;
           }
       }
    }
}