/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Modelos.Persona;
import Modelos.Sexo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ale05
 */
public class DPersona {
    private ArrayList<Persona> listPersona = new ArrayList<>();

    public DPersona() {
    }

    public DPersona(ArrayList<Persona> listPersona) {
        this.listPersona = listPersona;
    }

    public ArrayList<Persona> getListPersona() {
        return listPersona;
    }

    public void setListPersona(ArrayList<Persona> listPersona) {
        this.listPersona = listPersona;
    }
    /**
     * Permite agregar un nuevo registro a mi lista
     * @param nombre
     * @param apellido
     * @param email
     * @param id
     * @param sexo
     * @return 
     */
    public int agregarPersona(String nombre, String apellido, String email, int id, Sexo sexo){
        int b = 0;
        Persona pers = new Persona(nombre, apellido, email, id, sexo);
        listPersona.add(pers);
        b=1;
        return b;
    }
    
    /**
     * Devuelve una tabal con los registros almacenados en el arreglo
     * @return 
     */
    public DefaultTableModel getListPer(){
        DefaultTableModel dtm = new DefaultTableModel();
        String titulo[]={"ID", "NOMBRES", "APELLIDOS", "EMAIL", "SEXO"};
        //Asigna los encabezados a mi tabla
        dtm.setColumnIdentifiers(titulo);
        
        //Estoy usando for each
        for (Persona per: listPersona){
            String reg[] = new String [5];
            reg[0] = ""+per.getId();
            reg[1] = per.getNombre();
            reg[2] = per.getApellido();
            reg[3] = per.getEmail();
            reg[4] = ""+per.getSexo();
            
            dtm.addRow(reg);
            
        }
        
        return dtm;
    }
}
