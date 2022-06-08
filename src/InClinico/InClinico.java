/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InClinico;

/**
 *
 * @author ulise
 */
public class InClinico {
    
    //VARIABLES DE VALORES ALMACENADOS EN LA BASE DE DATOS
    private int ID;
    private String NombCliente;
    private String NombExamen;
    private Double PrecioExamen;
    private String Fecha;

    //CONSTRUCTOR PARA EL ARREGLO
    public InClinico(int ID, String NombCliente, String NombExamen, Double PrecioExamen, String Fecha) {
        this.ID = ID;
        this.NombCliente = NombCliente;
        this.NombExamen = NombExamen;
        this.PrecioExamen = PrecioExamen;
        this.Fecha = Fecha;
    }

    //METODOS GET PARA LA OBTENCION DE DATOS
    public int getID() {
        return ID;
    }

    public String getNombCliente() {
        return NombCliente;
    }

    public String getNombExamen() {
        return NombExamen;
    }

    public Double getPrecioExamen() {
        return PrecioExamen;
    }

    public String getFecha() {
        return Fecha;
    }
    
    
    
}
