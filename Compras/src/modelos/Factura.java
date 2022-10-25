package modelos;

import java.util.Date;

/**
 * @author ale05
 * @version 1.0
 * @created 27-Sep-2022 9:18:43 AM
 */
public class Factura {

    private Date fechaFact;
    private int idFact;
    public Carrito m_Carrito;

    public Factura() {

    }

    public void finalize() throws Throwable {

    }

    public double calcIVA() {
        return 0;
    }
}//end Factura
