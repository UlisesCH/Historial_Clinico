/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InContable;

import InClinico.InClinico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ulise
 */
public class CRUD_InContable extends Conexion{
    
    //LISTA PARA ALMACENAR LOS DATOS OBTENIDOS DE LA BASE DE DATOS
    public static List<InContable> listaInContable = new ArrayList<InContable>();
    
    //LLENA LA TABLA CON LOS DATOS OBTENIDOS DE LA BASE DE DATOS
    public static void LlenarTabla(){
        //SE VACIA LA LISTA
        listaInContable.clear();
        //OBJETO PARA TENER INTERACCION CON LA CLASE Conexion
        Conexion conec = new Conexion();
        //CREA LA CONECION Y VERIFICA LA EXISTENCIA DE LA TABLA
        conec.CrearTablas();
        //VARIABLE PARA EL RESULTADO OBTENIDO
        ResultSet result = null;
        
        try{
            //SE INDICA LA ACCION CON LA BASE DE DATOS (SE OBTINIENE LOS DATOS ALMACENADOS)
            PreparedStatement st = conec.conexion.prepareStatement("select ID, NombProducto, Cantidad, NombProveedor, "
                                                                        + "PrecioProducto, Fecha from InContable");
            //SE ALMACENA LOS RESULTADOS
            result = st.executeQuery();
            
            //SE RECORRE TODO LO ALMACENADO
            while(result.next()){
                //OBJETO DEL CONSTRUCTOR
                InContable incontable = new InContable(result.getInt("ID"),result.getString("NombProducto")
                                            ,result.getInt("Cantidad"),result.getString("NombProveedor")
                                            ,result.getInt("PrecioProducto"),result.getString("TipoCuenta")
                                            ,result.getString("Fecha"));
                //SE AGREGA EL CONSTRUCTOR AL ARREGLO
                listaInContable.add(incontable);

            }
            
        }catch(Exception e){
            System.out.println(e + " Error al llenar la tabla");
        }
    }
    
    //INSERTA DATOS A LA TABLA DE LA BASE DE DATOS
    public static void Insertar(String NombProducto, int Cantidad, String NombProveedor, int PrecioProducto, 
                                String TipoCuenta, String Fecha){
        //VARIABLE PARA EL ID A ALMACENAR
        int id = 0;
        //OBJETO PARA TENER INTERACCION CON LA CLASE Conexion
        Conexion conec = new Conexion();
        //VARIABLE PARA EL RESULTADO OBTENIDO
        ResultSet result = null;
        try{
            //SE INDICA LA ACCION CON LA BASE DE DATOS (SE OBTINIENE LOS ID ALMACENADOS)
            PreparedStatement st = conec.conexion.prepareStatement("select ID from InContable");
            //SE ALMACENA LOS RESULTADOS
            result = st.executeQuery();
            
            //SE RECORRE TODO LO ALMACENADO
            while(result.next()){
                //SE ALMACENA EL VALOR MAS ALTO DEL ID + 1
                id = result.getInt("ID")+1;
            }
            //SE INDICA LA ACCION CON LA BASE DE DATOS (SE ALMACENA LOS DATOS)
            st = conec.conexion.prepareStatement(
                    "insert into InContable(ID, NombProducto, Cantidad, NombProveedor, PrecioProducto, Fecha)\n"
                    + "values(" +id+ ",'"+NombProducto+"'," +Cantidad+ ",'"+NombProveedor+"'," 
                            +PrecioProducto+ ",'"+TipoCuenta+"','"+Fecha+"');");
            //EJECUTA LA ACCION
            st.execute();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR LOS DATOS " + e);
        }
    }
    
    //ELIMINA LOS DATOS DEL REGISTRO SELECCIONADO
    public static void Eliminar(int id){
        
        //OBJETO PARA TENER INTERACCION CON LA CLASE Conexion
        Conexion conec = new Conexion();
        
        try{
            //SE INDICA LA ACCION CON LA BASE DE DATOS (SE ELIMINA LOS DATOS SEGUN EL ID)
            PreparedStatement st = conec.conexion.prepareStatement("delete from InContable where ID="+id);
            //EJECUTA LA ACCION
            st.execute();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR LOS DATOS " + e);
        }
    }
    
}
