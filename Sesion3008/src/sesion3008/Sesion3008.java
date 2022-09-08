/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion3008;
//Data
//Access

import java.util.ArrayList;
import modelos.Persona;
import modelos.Sexo;

//Object
/**
 *
 * @author labc205
 */
public class Sesion3008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> listado = new ArrayList<>();
        listado.add("Luis");
        listado.add("Martha");
        listado.add("Hortencia");

        for (String nombre : listado) {
            System.out.println(nombre);
        }
//        System.out.println("Imprimir con for");
//        for(int i=0; i< listado.size(); i++){
//            System.out.println(listado.get(i).toString());
//        }

        //ArrayList<String> copia = new ArrayList<>(listado);
        ArrayList<String> copia = (ArrayList<String>) listado.clone();
        //copia = listado;        
        listado.add("Carlos");
        System.out.println("Original");
        for (String nombre : listado) {
            System.out.println(nombre);
        }
        System.out.println("copia");
        for (String nombre : copia) {
            System.out.println(nombre);
        }

    }

}
