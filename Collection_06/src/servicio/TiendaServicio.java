
package servicio;
import entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    public HashMap <Integer, Tienda> hashTienda = new HashMap();
    
    public void mostrarMenu() {
        System.out.println("------------Menu Principal-----------");
        String opcion;
        
        do {
            System.out.println("1. agregar Producto");
            System.out.println("2. modificar precio del Producto");
            System.out.println("\n3. mostrar todos los productos");
            System.out.println("\nSalir del menu: salir");
            System.out.println("\n\n" + "Opcion: ");
            opcion = read.nextLine();
            
            switch (opcion) {
                case "1": agregarProducto(); break;
                case "2": cambiarPrecio(); break;
                case "3": mostrarProducto(); break;
            }
        } while (!opcion.equals("salir"));
        
    }
    public void agregarProducto() {
        System.out.println("-----------Agregar Producto---------");
        Tienda classTienda;
        String opcion;
        int count = 0;
        
        do {
            classTienda = new Tienda();
            
            System.out.println("Digite el nombre del Producto: ");
            classTienda.setProducto(read.nextLine());
            
            System.out.println("Digite el precio del Producto");
            classTienda.setPrecio(read.nextInt());
            
            hashTienda.put(count, classTienda);
            
            System.out.println("Agregar mas producto? (s/n)");
            opcion = read.next();
            read.skip("\n");
            ++count;

        } while(opcion.equals("s"));
        
        mostrarMenu();
    }
    public void mostrarProducto() {
        System.out.println("----------Mostrar Producto---------");
        for (Map.Entry<Integer, Tienda> entry : hashTienda.entrySet()) {
            Integer key = entry.getKey();
            Tienda value = entry.getValue();
            
            System.out.println("#C. " + key + " " + value);
        }
        mostrarMenu();
    }
    
    public void cambiarPrecio() {
        System.out.println("----------Cambiar Precio---------");
        
        int codigo;
        int precio;
        boolean encontrado = false;
        
        System.out.println("Digite #C del Producto: ");
        codigo = read.nextInt();
        
        for (Map.Entry<Integer, Tienda> entry : hashTienda.entrySet()) {
            Integer key = entry.getKey();
            Tienda value = entry.getValue();
            
            if (key == codigo) {
                encontrado = true;
                
                System.out.println("Ingrese nuevo precio del producto:");
                precio = read.nextInt();
                value.setPrecio(precio);
                read.skip("\n");
            }
        }
        
        System.out.println(encontrado ? "El producto fue modificado" : "No se encontro el producto");
        mostrarMenu();
    }
}