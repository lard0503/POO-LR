/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miuam;

import dao.Usuario;
import formularios.Login;

/**
 *
 * @author ale05
 */
public class MiUAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dao.Usuario usuarios = new dao.Usuario();
        //usuarios.agregar("19015127", "184213", "Lester", "Rodriguez", "larodriguezc.uamv.edu.ni");
        //usuarios.agregar("19015020", "123", "Silvio", "Vigil", "savigil@uamv.edu.ni");
        
        //dao.Usuario
        Login login = new Login();
        login.usuarios= usuarios;
        login.setVisible(true);
        
        
    }
    
    public void llenarUsuarios(){
        
        Usuario usuarios = new dao.Usuario();
        usuarios.agregar("19015127", "184213", "Lester", "Rodriguez", "larodriguezc.uamv.edu.ni");
        usuarios.agregar("19015020", "123", "Silvio", "Vigil", "savigil@uamv.edu.ni");
        
        Login login = new Login();
        login.usuarios = usuarios;
        login.setVisible(true);
        
    }
    
    
}
