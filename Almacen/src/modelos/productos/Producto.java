/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.productos;

/**
 *
 * @author Lester
 * La clase producto contiene informacion sobre las
 * diferentes caracteristicas de los productos
 * que se ofertan
 */
public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    
    public Producto(){
        
    }
    
    public Producto(int codigo, String nombre, String descripcion, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Datos del producto \n" + "Codigo:" + codigo + "\nnombre:" + nombre + "\ndescripcion:" + descripcion + "\nprecio:" + precio + "\n";
    }
    
    
    
    
}

