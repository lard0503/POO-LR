/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author ale05
 */


public class Trabajador {
    private String codigo;
    private String nombre;
    private String apellidos;
    private double sal_mensual;

    public Trabajador() {
    }
    

    public Trabajador(String codigo, String nombre, String apellidos, double sal_mensual) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sal_mensual = sal_mensual;
        
    }

    public double calcularsal_diario(){
        return sal_mensual/30;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSal_mensual() {
        return sal_mensual;
    }

    public void setSal_mensual(double sal_mensual) {
        this.sal_mensual = sal_mensual;
    }
    
    
    
}

