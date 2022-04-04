/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

public class raza {
    public String nombre;
    public String tipoRaza;
    
    public raza () { }

    public raza(String nombre, String tipoRaza) {
        this.nombre = nombre;
        this.tipoRaza = tipoRaza;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoRaza() {
        return tipoRaza;
    }

    public void setTipoRaza(String tipoRaza) {
        this.tipoRaza = tipoRaza;
    }
    
    @Override
    public String toString() {
        return "raza{" + "nombre=" + nombre + ", tipoRaza=" + tipoRaza + '}';
    }
    
}


