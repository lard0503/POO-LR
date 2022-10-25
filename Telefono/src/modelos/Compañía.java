/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.logging.Logger;

/**
 *
 * @author ale05
 */
public class Compañía {
    
    private int id;
    private String nombre;
    private double precioMsn;

    public Compañía() {
    }

    public Compañía(int id, String nombre, double precioMsn) {
        this.id = id;
        this.nombre = nombre;
        this.precioMsn = precioMsn;
    }

    public double getPrecioMsn() {
        return precioMsn;
    }

    public void setPrecioMsn(double precioMsn) {
        this.precioMsn = precioMsn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double disminuirSaldo(double saldo){
        return saldo - this.precioMsn;
    }

    @Override
    public String toString() {
        return "Compañia{" + "id=" + id + ", nombre=" + nombre + ", precioMsn=" + precioMsn + '}';
    }
    
    
}
