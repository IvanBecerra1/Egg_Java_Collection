/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection_03;
import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ivan
 */
public class Collection_03 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        Alumno classAlumno = new Alumno();
        ArrayList <Alumno> registroAlumno = new ArrayList<>();
        
        int option;
        do {
            registroAlumno.add(classAlumno.crearAlumno());
            
            System.out.println("Agregar otro Alumno mas? 1 = si | 0 = no");
            option = read.nextInt();
            
        } while (option == 1);
        
        classAlumno.notaFinal(registroAlumno);
        
        System.out.println("-----------Total de Alumnos----------");
        for (Alumno aux : registroAlumno) {
            System.out.println(aux.toString());
        }
        
    }
    
}
