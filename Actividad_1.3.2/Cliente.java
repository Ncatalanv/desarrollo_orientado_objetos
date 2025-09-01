/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

/**
 *
 * @author Cetecom
 */
public class Cliente {
    private String idCliente, nombre;
    private CarritoDeCompras carro;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre, CarritoDeCompras carro) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.carro = carro;
    }

    
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CarritoDeCompras getCarro() {
        return carro;
    }

    public void setCarro(CarritoDeCompras carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", carro=" + carro + '}';
    }
    
    
    
}
