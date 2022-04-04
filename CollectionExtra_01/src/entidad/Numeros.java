
package entidad;

import java.util.ArrayList;

public class Numeros {
    private ArrayList <Integer> numeros;

    public Numeros () {
        numeros = new ArrayList();
    }
    public Numeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Numeros{" + "numeros=" + numeros + '}';
    }

    
}
