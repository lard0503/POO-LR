/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author ale05
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese los datos");
        
        System.out.println("Codigo: ");
        String codigo = entrada.nextLine();
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Apellidos: ");
        String apellidos = entrada.nextLine();
        System.out.println("Salario Mensual: ");
        double sal_mensual = entrada.nextDouble();
        
        Trabajador Juancito = new Trabajador(codigo, nombre, apellidos, sal_mensual);
        
        System.out.println("El salario diario del Trabajdor es: "+Juancito.calcularsal_diario());
    }
    
}
