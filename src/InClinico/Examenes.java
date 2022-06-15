/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InClinico;

/**
 *
 * @author ulise
 */
public class Examenes {
    
    private int ID;
    private String NombExamen;
    private Double PrecioExamen;

    public Examenes(int ID, String NombExamen, Double PrecioExamen) {
        this.ID = ID;
        this.NombExamen = NombExamen;
        this.PrecioExamen = PrecioExamen;
    }

    public int getID() {
        return ID;
    }

    public String getNombExamen() {
        return NombExamen;
    }

    public Double getPrecioExamen() {
        return PrecioExamen;
    }
    
}
