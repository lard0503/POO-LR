/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author ale05
 */
public class Usuario {
    private String userName;
    private String pw;
    private String nombres;
    private String apellidos;
    private String email;

    public Usuario() {
    }

    public Usuario(String userName, String pw, String nombres, String apellidos, String email) {
        this.userName = userName;
        this.pw = pw;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public boolean verificarUser(String user, String pw){
        return this.userName.equals(user) && this.pw.equals(pw);
    }
    
}
