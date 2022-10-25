/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacen;

import modelos.productos.ProductoDAO;

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
        ProductoDAO lista = new ProductoDAO();
        lista.agregar(1, "Cafe", "Cafe con leche", 120);
        lista.agregar(2, "Pan dulce", "Pico", 20);
        lista.agregar(3, "Desayuno", "Ensalada con pollo", 150);
        lista.agregar(4, "Baho", "Baho", 200);
        lista.agregar(5, "Frijolada", "Frijolada", 350);
        lista.agregar(6, "Rundown", "Rundown", 450);
        
        for(int i=0; i<lista.getListaP().size(); i++){
            System.out.println(lista.getListaP().get(i));
        }
        
        lista.eliminar(4);
        
        for(int i = 0; i < lista.getListaP().size();i++){
            System.out.println(lista.getListaP().get(i));
        }
    }

}
