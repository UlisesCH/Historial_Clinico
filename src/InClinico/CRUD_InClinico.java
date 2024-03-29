package InClinico;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ulise
 */
public class CRUD_InClinico extends Conexion {
    
    //LISTA PARA ALMACENAR LOS DATOS OBTENIDOS DE LA BASE DE DATOS
    public static List<InClinico> listaInClinico = new ArrayList<InClinico>();
    
    //LLENA LA TABLA CON LOS DATOS OBTENIDOS DE LA BASE DE DATOS
    public static void LlenarTabla(){
        //SE VACIA LA LISTA
        listaInClinico.clear();
        //OBJETO PARA TENER INTERACCION CON LA CLASE Conexion
        Conexion conec = new Conexion();
        //CREA LA CONECION Y VERIFICA LA EXISTENCIA DE LA TABLA
        conec.CrearTablas();
        //VARIABLE PARA EL RESULTADO OBTENIDO
        ResultSet result = null;
        
        try{
            //SE INDICA LA ACCION CON LA BASE DE DATOS (SE OBTINIENE LOS DATOS ALMACENADOS)
            PreparedStatement st = conec.conexion.prepareStatement("select ID, NombCliente, NombExamen, "
                                                                        + "PrecioExamen, Fecha from InClinico");
            //SE ALMACENA LOS RESULTADOS
            result = st.executeQuery();
            
            //SE RECORRE TODO LO ALMACENADO
            while(result.next()){
                //OBJETO DEL CONSTRUCTOR
                InClinico inclinico = new InClinico(result.getInt("ID"),result.getString("NombCliente")
                                            ,result.getString("NombExamen"),result.getDouble("PrecioExamen")
                                            ,result.getString("Fecha"));
                //SE AGREGA EL CONSTRUCTOR AL ARREGLO
                listaInClinico.add(inclinico);

            }
            
            System.out.println("Se lleno el arreglo con los datos");
            
        }catch(Exception e){
            System.out.println(e + " Error al llenar el arreglo");
        }
    }
    
    
    //LLENA LA TABLA CON LOS DATOS OBTENIDOS DE LA BASE DE DATOS
    public static void BuscarEnTabla(String buscar){
        //SE VACIA LA LISTA
        listaInClinico.clear();
        //OBJETO PARA TENER INTERACCION CON LA CLASE Conexion
        Conexion conec = new Conexion();
        //CREA LA CONECION Y VERIFICA LA EXISTENCIA DE LA TABLA
        conec.CrearTablas();
        //VARIABLE PARA EL RESULTADO OBTENIDO
        ResultSet result = null;
        
        try{
            //SE INDICA LA ACCION CON LA BASE DE DATOS (SE OBTINIENE LOS DATOS ALMACENADOS)
            PreparedStatement st = conec.conexion.prepareStatement("select * from InClinico "
                                   + "where NombCliente LIKE '"+buscar+"'"
                                   + "OR NombExamen LIKE '"+buscar+"'"
                                   + "OR Fecha LIKE '"+buscar+"'");
            //SE ALMACENA LOS RESULTADOS
            result = st.executeQuery();
            
            //SE RECORRE TODO LO ALMACENADO
            while(result.next()){
                //OBJETO DEL CONSTRUCTOR
                InClinico inclinico = new InClinico(result.getInt("ID"),result.getString("NombCliente")
                                            ,result.getString("NombExamen"),result.getDouble("PrecioExamen")
                                            ,result.getString("Fecha"));
                //SE AGREGA EL CONSTRUCTOR AL ARREGLO
                listaInClinico.add(inclinico);

            }
            
            System.out.println("Se lleno el arreglo con los datos");
            
        }catch(Exception e){
            System.out.println(e + " Error al llenar el arreglo");
        }
    }
    
    
    
    //INSERTA DATOS A LA TABLA DE LA BASE DE DATOS
    public static void Insertar(String NombCliente, String NombExamen, Double PrecioExamen, String Fecha){
        //OBJETO PARA TENER INTERACCION CON LA CLASE Conexion
        Conexion conec = new Conexion();

        try{
            
            //SE INDICA LA ACCION CON LA BASE DE DATOS (SE ALMACENA LOS DATOS)
            PreparedStatement st = conec.conexion.prepareStatement(
                    "insert into InClinico(NombCliente, NombExamen, PrecioExamen, Fecha)\n"
                    + "values('"+NombCliente+"','"+NombExamen+"'," +PrecioExamen+ ",'"+Fecha+"');");
            //EJECUTA LA ACCION
            st.execute();

        }catch(Exception e){
            System.out.println(e + " ERROR AL INSERTAR LOS DATOS");
        }
    }
    
    //ELIMINA LOS DATOS DEL REGISTRO SELECCIONADO
    public static void Eliminar(int id){
        
        //OBJETO PARA TENER INTERACCION CON LA CLASE Conexion
        Conexion conec = new Conexion();
        
        try{
            //SE INDICA LA ACCION CON LA BASE DE DATOS (SE ELIMINA LOS DATOS SEGUN EL ID)
            PreparedStatement st = conec.conexion.prepareStatement("delete from InClinico where ID="+id);
            //EJECUTA LA ACCION
            st.execute();
            
            JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR LOS DATOS " + e);
        }
    }
    
    //INSERTA DATOS A LA TABLA DE LA BASE DE DATOS
    public static void Modificar(int ID,String NombCliente, String NombExamen, Double PrecioExamen, String Fecha){
        //VARIABLE PARA EL ID A ALMACENAR
        int id = 0;
        //OBJETO PARA TENER INTERACCION CON LA CLASE Conexion
        Conexion conec = new Conexion();
    
        try{
            
            String sql = "Update InClinico set ID="+ID+", NombCliente='"+NombCliente+
                        "',NombExamen='"+NombExamen+"', PrecioExamen="+PrecioExamen+
                        ", Fecha='"+Fecha+"' where ID="+ID;
            
            //SE INDICA LA ACCION CON LA BASE DE DATOS (SE ALMACENA LOS DATOS)
            PreparedStatement st = conec.conexion.prepareStatement(sql);
            //EJECUTA LA ACCION
            st.execute();
            
            JOptionPane.showMessageDialog(null, "DATOS MODIFICADOS");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR LOS DATOS " + e);
        }
    }
    
}
