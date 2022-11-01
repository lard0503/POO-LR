/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author ale05
 */
public class Usuario {

    private ArrayList<modelos.Usuario> lista = new ArrayList<>();
    
    public Usuario() {
    }
    
    public ArrayList<modelos.Usuario> getLista() {
        return lista;
    }
    
    public void setLista(ArrayList<modelos.Usuario> lista) {
        this.lista = lista;
    }
    
    public void agregar(String user, String pw, String nombres, String apellidos, String email) {
        this.lista.add(new modelos.Usuario(user, pw, nombres, apellidos, email));
    }
    public boolean eliminarUsuario(String userName){
        for(modelos.Usuario usuario : this.lista){
        if(usuario.existe(userName)){
            this.lista.remove(usuario);
            return true;
        }
    }
        return false;
    }
    
    public boolean autenticarUsuario(String user, String pw) {
        for (modelos.Usuario us : this.lista) {
            if (us.verificarUser(user, pw)) {
                return true;
            }
        }
        return false;
    }
    
    public void editar(String user, String pw, String nombres, String apellidos, String email){
        for(modelos.Usuario usuario : this.lista){
            if(usuario.existe(user)){
                usuario.setPw(pw);
                usuario.setNombres(nombres);
                usuario.setApellidos(apellidos);
                usuario.setEmail(email);
            }
        }
    }
    
    public ArrayList buscarXNombre(String valor){
        ArrayList<modelos.Usuario> resultado = new ArrayList<>();
        for (modelos.Usuario usuario : this.lista){
            String userN = usuario.getNombres().toUpperCase()+ " "+usuario.getApellidos().toUpperCase();
            if(userN.startsWith(valor.toUpperCase())){
                resultado.add(usuario);
            }
        }
        return resultado;
    }
}
