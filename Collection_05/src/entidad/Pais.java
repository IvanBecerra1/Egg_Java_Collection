
package entidad;

import java.util.HashSet;


public class Pais {
    public HashSet <String> pais;
    
    public Pais() {
       pais = new HashSet();
    };
    public Pais(HashSet <String> pais) {
        this.pais = pais;
    };

    public HashSet <String> getPais() {
        return pais;
    };

    public void setPais(HashSet <String> pais) {
        this.pais = pais;
    };
    
    @Override
    public String toString() {
        return "Pais{" + "pais=" + pais + '}';
    }
}
