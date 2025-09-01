/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

/**
 *
 * @author Cetecom
 */
public class CarritoDeCompras {
    private String productos;
    private double total;
    
    
    public void agregarProducto(String producto){
        
    }

    public CarritoDeCompras() {
    }

    public CarritoDeCompras(String productos, double total) {
        this.productos = productos;
        this.total = total;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "CarritoDeCompras{" + "productos=" + productos + ", total=" + total + '}';
    }
    
    
    
}
