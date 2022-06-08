/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InClinico;

/**
 *
 * @author ulise
 */
public class InClRecibo {
    
    //VARIABLES DE VALORES ALMACENADOS EN LA BASE DE DATOS
    private String NombCliente;
    private String NombExamen;
    private int PrecioExamen;
    private String Fecha;

    public InClRecibo(String NombCliente, String NombExamen, int PrecioExamen, String Fecha) {
        this.NombCliente = NombCliente;
        this.NombExamen = NombExamen;
        this.PrecioExamen = PrecioExamen;
        this.Fecha = Fecha;
    }

    public String getNombCliente() {
        return NombCliente;
    }

    public String getNombExamen() {
        return NombExamen;
    }

    public int getPrecioExamen() {
        return PrecioExamen;
    }

    public String getFecha() {
        return Fecha;
    }
    
    
    
}
