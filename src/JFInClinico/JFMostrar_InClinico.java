/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFInClinico;

import InClinico.CRUD_InClinico;
import InClinico.Conexion;
import static InClinico.CRUD_InClinico.listaInClinico;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ulise
 */
public class JFMostrar_InClinico extends javax.swing.JFrame {
    //OBJETO PARA INTERACTUAR CON LA TABLA
    DefaultTableModel model;
    int ID;
    int fila;
    /**
     * Creates new form JFMostrar_InClinico
     */
    public JFMostrar_InClinico() {
        initComponents();
        //SE VINCULA CON LA TABLA
        model = (DefaultTableModel) this.TableInClinico.getModel();
        //FUNCION PARA LLENAR LA TABLA
        Llenar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCFecha = new com.toedter.calendar.JDateChooser();
        TxtPrecioExamen = new javax.swing.JTextField();
        TxtNombExamen = new javax.swing.JTextField();
        TxtNombCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableInClinico = new javax.swing.JTable();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnImprimir = new javax.swing.JButton();
        BtnCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setText("NOMBRE DE PACIENTE");

        jLabel2.setText("NOMBRE DE EXAMEN");

        jLabel3.setText("PRECIO");

        jLabel4.setText("FECHA");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("MOSTRAR INFORMES DE EXAMENES CLINICOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtNombExamen)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TxtPrecioExamen))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtPrecioExamen)
                        .addComponent(TxtNombExamen)
                        .addComponent(TxtNombCliente))
                    .addComponent(jCFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        TableInClinico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NomCliente", "NomExamen", "Precio", "Fecha"
            }
        ));
        TableInClinico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableInClinicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableInClinico);
        if (TableInClinico.getColumnModel().getColumnCount() > 0) {
            TableInClinico.getColumnModel().getColumn(0).setPreferredWidth(2);
            TableInClinico.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnImprimir.setText("Imprimir");

        BtnCrear.setText("Crear");
        BtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnModificar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnImprimir)
                    .addComponent(BtnCrear))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(BtnModificar)
                .addGap(47, 47, 47)
                .addComponent(BtnEliminar)
                .addGap(68, 68, 68)
                .addComponent(BtnImprimir)
                .addGap(67, 67, 67)
                .addComponent(BtnCrear)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here:
        
        if(fila == -1){
                JOptionPane.showMessageDialog(null, "NO SE A SELECIONADO FILA");
        }
        else{
        
            //OBJETO PARA ENTERACTUAR CON LA CONEXION
            Conexion conec = new Conexion();
            //CREA REALIZA LA CONEXION Y CREA LA TABLA SI NO HAY
            conec.CrearTablas();

            fila = TableInClinico.getSelectedRow();
            ID = 0;
            if(fila == -1){
                JOptionPane.showMessageDialog(null, "NO SE A SELECIONADO FILA");
            }
            else{
                ID = Integer.parseInt((String) TableInClinico.getValueAt(fila, 0).toString());
            }

            //SE OBTIENEN LOS DATOS DEL JCALENDAT
            String dia = Integer.toString(jCFecha.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(jCFecha.getCalendar().get(Calendar.MONTH)+1);
            String anio = Integer.toString(jCFecha.getCalendar().get(Calendar.YEAR));

            //SE OBTIENES LOS DATOS DE LOS INPUTS
            String NombCliente = TxtNombCliente.getText();
            String NombExamen = TxtNombExamen.getText();
            int PrecioExamen = Integer.parseInt(TxtPrecioExamen.getText());
            //SE ALMACENA LOS VALOR DE LA FECHA
            String Fecha = dia+ "/" +mes+ "/" +anio;

            //OBJETO PARA ENTERACTUAR CON EL CRUD
            CRUD_InClinico Cr = new CRUD_InClinico();
            //SE MANDA LOS VALORES AL INSERTAR
            Cr.Modificar(ID, NombCliente, NombExamen, PrecioExamen, Fecha);

            model.setRowCount(0);
            Llenar();
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void TableInClinicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableInClinicoMouseClicked
        // TODO add your handling code here:
        
        fila = TableInClinico.getSelectedRow();
        ID = 0;
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "NO SE A SELECIONADO FILA");
        }
        else{
            try {
                ID = Integer.parseInt((String) TableInClinico.getValueAt(fila, 0).toString());
                String NombCliente = (String) TableInClinico.getValueAt(fila, 1);
                String NombExamen = (String) TableInClinico.getValueAt(fila, 2);
                int PrecioExamen = Integer.parseInt((String) TableInClinico.getValueAt(fila, 3).toString());
                String Fecha = (String) TableInClinico.getValueAt(fila, 4);
                
                TxtNombCliente.setText(NombCliente);
                TxtNombExamen.setText(NombExamen);
                TxtPrecioExamen.setText(""+PrecioExamen);
                
                java.util.Date fechaParseada= new SimpleDateFormat("dd/MM/yyyy").parse(Fecha);
                jCFecha.setDate(fechaParseada);
            } catch (ParseException ex) {
                Logger.getLogger(JFMostrar_InClinico.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_TableInClinicoMouseClicked

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        
        int fila = TableInClinico.getSelectedRow();
        ID = 0;
        
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "NO SE A SELECIONADO FILA");
        }
        else{
            ID = Integer.parseInt((String) TableInClinico.getValueAt(fila, 0).toString());
        }
        
        CRUD_InClinico Cr = new CRUD_InClinico();
        Cr.Eliminar(ID);
        
        model.setRowCount(0);
        Llenar();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearActionPerformed
        // TODO add your handling code here:
        //OBJETO PARA INTERACTUAR CON EL JFCrear_InContable
        JFCrear_InClinico InClinico = new JFCrear_InClinico();
        //SE INDICA QUE SE MUESTRE LA VENTANA
        InClinico.setVisible(true);
        //SE OCULTA LA VENTANA ACTUAL
        this.dispose();
    }//GEN-LAST:event_BtnCrearActionPerformed

    public void Llenar(){
            //SE LIMPIA LA TABLA
            model.setRowCount(0);
            //OBJETO PARA ENTERACTUAR CON EL CRUD
            CRUD_InClinico cr = new CRUD_InClinico();
            //SE LLENA EL ARREGLO CON LOS VALORES DE LA TABLA
            cr.LlenarTabla();
            //CICLO PARA LLENAR LA TABLA CON LOS VALORES DEL ARREGLO
            for(int PosC = 0; PosC < listaInClinico.size(); PosC++){

                model.addRow(new Object[]{listaInClinico.get(PosC).getID(),listaInClinico.get(PosC).getNombCliente()
                        ,listaInClinico.get(PosC).getNombExamen(),listaInClinico.get(PosC).getPrecioExamen()
                        ,listaInClinico.get(PosC).getFecha()});
            }
        }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFMostrar_InClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMostrar_InClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMostrar_InClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMostrar_InClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMostrar_InClinico().setVisible(true);
                
                //OBJETO PARA ENTERACTUAR CON LA CONEXION
                Conexion conec = new Conexion();
                //CREA REALIZA LA CONEXION Y CREA LA TABLA SI NO HAY
                conec.CrearTablas();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrear;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnImprimir;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JTable TableInClinico;
    private javax.swing.JTextField TxtNombCliente;
    private javax.swing.JTextField TxtNombExamen;
    private javax.swing.JTextField TxtPrecioExamen;
    private com.toedter.calendar.JDateChooser jCFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}