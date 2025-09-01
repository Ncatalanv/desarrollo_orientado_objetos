/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("abc1", "cereal", 4000);
        CarritoDeCompras carro = new CarritoDeCompras(producto1.toString(), 0);
        Cliente cliente1 = new Cliente("b123", "Ignacio", carro);
        
        cliente1.getCarro().getTotal();
        
       
        
        Scanner teclado = new Scanner(System.in);
        
        int opc;
        
        do{
            System.out.println("--- Tienda DuocUC ---");
            System.out.println("1.- Ver catálogo de productos");
            System.out.println("2.- Ver carrito de compras.");
            System.out.println("3.- Salir");
            
            opc = teclado.nextInt();
            
            switch(opc){
                case 1: 
                    System.out.println("Productos disponibles");
                    System.out.println(producto1.toString());
                case 2:
                    System.out.println("Carrito de Compras");
                case 3:
                    System.out.println("Saliendo de la tienda...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                          
            
        }
        } while (opc !=5);
                
        
             

    }
    
}
