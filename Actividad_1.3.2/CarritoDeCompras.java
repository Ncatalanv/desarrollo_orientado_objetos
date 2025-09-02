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
    
    // Si la variable es null tomará el valor del último producto
    public void agregarProducto(Producto producto){
        if(this.productos == null){
            this.productos = producto.getNombre();
        } else{
            //Guardar productos ingresados en la variable "productos".
            this.productos += ", " + producto.getNombre();
        }
        //Para ir sumando el total
        this.total += producto.getPrecio();
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

    public void mostrarCarrito(){
        System.out.println("Productos: "+ this.productos);
        System.out.println("Precio total: "+ this.total);
    }
}
