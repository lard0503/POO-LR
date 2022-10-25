/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telefono;

import modelos.Compañía;
import modelos.Mensaje;
import modelos.Movil;

/**
 *
 * @author ale05
 */
public class Telefono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compañía megaPhone
                = new Compañía(1, "MEGAPhone", 1);
        Movil synthia = new Movil(77446655, 10, megaPhone);
        Movil lester = new Movil(11223344, 10, megaPhone);
        System.out.println(synthia);
        System.out.println(lester);

        Mensaje msn = new Mensaje();
        msn.setDestino(11223344);
        msn.setOrigen(77446655);
        msn.setMsn("Hola");
        System.out.println(msn.enviarMensaje(synthia.getSaldo(), megaPhone.getPrecioMsn()));
        //Bandeja de entrada
        lester.recibirMsn(msn.getOrigen(), msn.getDestino(), msn.getMsn());
        double nSaldo = megaPhone.disminuirSaldo(synthia.getSaldo());
        synthia.setSaldo(nSaldo);
        //otro mensaje
        msn.setDestino(11223344);
        msn.setOrigen(77446655);
        msn.setMsn("Hola");
        System.out.println(msn.enviarMensaje(synthia.getSaldo(), megaPhone.getPrecioMsn()));
        //Bandeja de entrada
        lester.recibirMsn(msn.getOrigen(), msn.getDestino(), msn.getMsn());
        nSaldo = megaPhone.disminuirSaldo(synthia.getSaldo());
        synthia.setSaldo(nSaldo);
        System.out.println(synthia);

        System.out.println(lester);

    }

}
