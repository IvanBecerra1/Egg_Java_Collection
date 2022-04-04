/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection_06;

import java.util.HashMap;
import entidad.Tienda;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.TiendaServicio;
/**
 Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.

* OPCIONES
* Introducir elementos
* modificar precio
* eliminar producto
* mostrar los precios del producto
* 
//
* crear cada objeto
* aniadir su atributo etc. y datos
* mostrar.
* 
* Para cambiar Precio, deberiamos renovar el producto y volver a agregarlo.
* se remueve utilizando remove.map(numero de llave);
* dps tendremos que agregar uno nuevo, lo que podriamos hacer es obtener el Value, el nombre, guardarla en una string
* dps pedir nuevamente la 'llave" = precio.
* 
* 
**/
public class Collection_06 {
    private static Scanner read = new Scanner ( System.in ).useDelimiter("\n");
    
    public static void main(String[] args) {
        TiendaServicio tiendaService = new TiendaServicio();
        tiendaService.mostrarMenu();
    }
}
