package modelos;

/**
 * @author ale05
 * @version 1.0
 * @created 27-Sep-2022 9:18:44 AM
 */
public class Carrito {

    private double cantidad;
    public Producto m_Producto;

    public Carrito() {

    }

    public void finalize() throws Throwable {

    }

    /**
     *
     * @param id
     * @param nombre
     * @param precio
     */
    public boolean agregarProducto(int id, String nombre, double precio) {
        return false;
    }

    /**
     *
     * @param nombre
     */
    public Producto buscarProducto(String nombre) {
        return null;
    }

    /**
     *
     * @param codigo
     */
    public Producto buscarProducto(int codigo) {
        return null;
    }

    /**
     *
     * @param precio
     * @param cantidad
     */
    public double calcularTotal(double precio, double cantidad) {
        return 0;
    }

    /**
     *
     * @param id
     */
    public boolean eliminarProducto(int id) {
        return false;
    }
}//end Carrito
