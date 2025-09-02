/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase;

/**
 *
 * @author Cetecom
 */
public class Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1 = new Producto("001", "Notebook", 170000);
        Producto producto2 = new Producto("002", "Mouse", 10000);
        Producto producto3 = new Producto("003", "Teclado", 35000);
        Cliente cliente1 = new Cliente("123abc", "Ignacio");
        
        cliente1.comprarProducto(producto1);
        cliente1.comprarProducto(producto3);
        cliente1.comprarProducto(producto1);
        cliente1.verCarrito();
    }
    
}
