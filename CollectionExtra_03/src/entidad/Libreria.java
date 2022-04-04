
package entidad;

public class Libreria {
    
    private String libro;
    private String autor;
    private int numeroEjemplares;
    private int ejemplaresPresentados;

    public Libreria() { };
    public Libreria(String libro, String autor, int numeroEjemplares, int ejemplaresPresentados) {
        this.libro = libro;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.ejemplaresPresentados = ejemplaresPresentados;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getEjemplaresPresentados() {
        return ejemplaresPresentados;
    }

    public void setEjemplaresPresentados(int ejemplaresPresentados) {
        this.ejemplaresPresentados = ejemplaresPresentados;
    }

    @Override
    public String toString() {
        return "Libreria{" + "libro=" + libro + ", autor=" + autor + ", numeroEjemplares=" + numeroEjemplares + ", ejemplaresPresentados=" + ejemplaresPresentados + '}';
    }
}
