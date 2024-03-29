/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InClinico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author ulise
 */
public class Conexion {
    
    //OBJETO PARA LA CONEXION CON LA BASE DE DATOS
    public static Connection conexion;
    
    //ESTRUCTURA DE LA TABLA DE INFORMES CLINICOS
    static final String InClinico
            = "CREATE TABLE InClinico(\n"
            + "ID integer primary key autoincrement,\n"
            + "NombCliente varchar(500),\n"
            + "NombExamen varchar(500),\n"
            + "PrecioExamen Double,\n"
            + "Fecha date)";
    
    //ESTRUCTURA DE LA TABLA DE INFORMES CLINICOS
    static final String Examenes
            = "CREATE TABLE Examenes(\n"
            + "ID integer primary key autoincrement,\n"
            + "NombExamen varchar(500),\n"
            + "PrecioExamen Double)";
    
    static String url = "jdbc:sqlite:BDHisClinico.db";
    
    //CREA LA CONEXION CON LA BASE DE DATOS Y TABLA INDICADA
    public static void crearConexion(){
        try{
            conexion = DriverManager.getConnection(url);

        }catch (Exception e){
            System.out.println(e + " Error al crear Conexion");
        }
    }
    
    //CREA LA TABLA EN CASO DE NO HABER
    public static boolean CrearTablas(){
        
        Statement stmt = null;
        try{
            crearConexion();
            stmt = conexion.createStatement();
            stmt.executeUpdate(InClinico);
            stmt.executeUpdate(Examenes);
            stmt.close();
            conexion.close();
            return true;
        }catch (Exception e){
            System.out.println(e + " Error al crear Tabla");
        }
        return false;

    }
    
}
