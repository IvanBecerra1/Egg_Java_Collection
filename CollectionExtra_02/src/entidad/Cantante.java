
package entidad;

import java.util.ArrayList;


public class Cantante {
    private String nombre;
    private ArrayList <String> discos;
    
    public Cantante() {
        discos = new ArrayList();
    }
    
    public Cantante(String nombre, ArrayList < String > discos) {
        this.nombre = nombre;
        this.discos = discos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getDiscos() {
        return discos;
    }

    public void setDiscos(ArrayList<String> discos) {
        this.discos = discos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Discos =" + discos;
    }
    
    /*
    
    public double factorial(int n){
        if (n==0){
            return 1;
        }else{
            return n*(factorial(n-1));                                                                                
        }
    }
    
    */
    
}
