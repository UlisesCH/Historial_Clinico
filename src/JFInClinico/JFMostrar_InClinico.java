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

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Paragraph;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        this.setLocationRelativeTo(null);
        
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TxtPrecioExamen = new javax.swing.JTextField();
        TxtNombExamen = new javax.swing.JTextField();
        TxtNombCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCFecha = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableInClinico = new javax.swing.JTable();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnImprimir = new javax.swing.JButton();
        BtnCrear = new javax.swing.JButton();
        TxtTotalExamen = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtBuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        BtnRellenar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jCFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtPrecioExamen)
                            .addComponent(TxtNombExamen)
                            .addComponent(TxtNombCliente))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        TableInClinico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NomCliente", "NomExamen", "Precio", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        BtnImprimir.setText("PDF");
        BtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImprimirActionPerformed(evt);
            }
        });

        BtnCrear.setText("Crear");
        BtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearActionPerformed(evt);
            }
        });

        TxtTotalExamen.setText("0.0");

        jLabel7.setText("PRECIO TOTAL:");

        TxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnRellenar.setText("Rellenar tabla");
        BtnRellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRellenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(TxtTotalExamen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(257, 257, 257))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnModificar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnImprimir)
                    .addComponent(BtnCrear))
                .addGap(10, 10, 10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnBuscar)
                .addGap(56, 56, 56)
                .addComponent(BtnRellenar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnRellenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnModificar)
                        .addGap(47, 47, 47)
                        .addComponent(BtnEliminar)
                        .addGap(68, 68, 68)
                        .addComponent(BtnImprimir)
                        .addGap(67, 67, 67)
                        .addComponent(BtnCrear))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTotalExamen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here:

        //OBJETO PARA ENTERACTUAR CON LA CONEXION
        Conexion conec = new Conexion();
        //CREA REALIZA LA CONEXION Y CREA LA TABLA SI NO HAY
        conec.CrearTablas();
        
        fila = TableInClinico.getSelectedRow();
        ID = 0;
        
        if(fila != -1){
            
            ID = Integer.parseInt((String) TableInClinico.getValueAt(fila, 0).toString());

            //SE OBTIENEN LOS DATOS DEL JCALENDAT
            String dia = Integer.toString(jCFecha.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(jCFecha.getCalendar().get(Calendar.MONTH)+1);
            String anio = Integer.toString(jCFecha.getCalendar().get(Calendar.YEAR));

            //SE OBTIENES LOS DATOS DE LOS INPUTS
            String NombCliente = TxtNombCliente.getText();
            String NombExamen = TxtNombExamen.getText();
            Double PrecioExamen = Double.parseDouble(TxtPrecioExamen.getText());
            //SE ALMACENA LOS VALOR DE LA FECHA
            String Fecha = dia+ "/" +mes+ "/" +anio;

            //OBJETO PARA ENTERACTUAR CON EL CRUD
            CRUD_InClinico Cr = new CRUD_InClinico();
            //SE MANDA LOS VALORES AL INSERTAR
            Cr.Modificar(ID, NombCliente, NombExamen, PrecioExamen, Fecha);

            model.setRowCount(0);
            Llenar();
        }
        else{
            JOptionPane.showMessageDialog(null, "NO SE A SELECIONADO FILA");

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
                Double PrecioExamen = Double.parseDouble((String) TableInClinico.getValueAt(fila, 3).toString());
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
            
            CRUD_InClinico Cr = new CRUD_InClinico();
            Cr.Eliminar(ID);
        }
        
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

    private void TxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here
        
        BuscarEnTabla(TxtBuscar.getText());
        
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRellenarActionPerformed
        // TODO add your handling code here:
        
        Llenar();
        
    }//GEN-LAST:event_BtnRellenarActionPerformed

    private void BtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImprimirActionPerformed
        // TODO add your handling code here:
        
        Document documento = new Document();
        
        try{
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/InformeClinico.pdf"));
            
            documento.open();
            
            Paragraph parrafo = new Paragraph();
            
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("LABORATORIO CLINICO DE ANALISIS HENDRYKS\n \n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
            
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Informacion de los Examenes Clinicos. \n \n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

            documento.add(parrafo);
            
            PdfPTable tablaCliente = new PdfPTable(5);
            tablaCliente.addCell("ID");
            tablaCliente.addCell("Nombre");
            tablaCliente.addCell("Nombre del Examen");
            tablaCliente.addCell("Precio");
            tablaCliente.addCell("Fecha");
            
            try{
                String sql = "SELECT * FROM InClinico";
                Conexion  cn = new Conexion();
                cn.CrearTablas();
                PreparedStatement pst = cn.conexion.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    do{
                        tablaCliente.addCell(rs.getString(1));
                        tablaCliente.addCell(rs.getString(2));
                        tablaCliente.addCell(rs.getString(3));
                        tablaCliente.addCell(rs.getString(4));
                        tablaCliente.addCell(rs.getString(5));
                    } while(rs.next());
                    documento.add(tablaCliente);
                }
                
            }catch (SQLException ex) {
                Logger.getLogger(JFMostrar_InClinico.class.getName()).log(Level.SEVERE, null, ex);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado correctamente");
            
        }catch (FileNotFoundException ex) {
            Logger.getLogger(JFMostrar_InClinico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(JFMostrar_InClinico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BtnImprimirActionPerformed

    public void Llenar(){
        Double Total = 0.0;
        
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
            
            Total = Total+listaInClinico.get(PosC).getPrecioExamen();
        }
        
        TxtTotalExamen.setText(""+Total);
        
    }
    
    public void BuscarEnTabla(String buscar){
        
        Double Total = 0.0;
        
        //SE LIMPIA LA TABLA
        model.setRowCount(0);
        //OBJETO PARA ENTERACTUAR CON EL CRUD
        CRUD_InClinico cr = new CRUD_InClinico();
        
        cr.BuscarEnTabla(buscar);
        
        //CICLO PARA LLENAR LA TABLA CON LOS VALORES DEL ARREGLO
        for(int PosC = 0; PosC < listaInClinico.size(); PosC++){

            model.addRow(new Object[]{listaInClinico.get(PosC).getID(),listaInClinico.get(PosC).getNombCliente()
                    ,listaInClinico.get(PosC).getNombExamen(),listaInClinico.get(PosC).getPrecioExamen()
                    ,listaInClinico.get(PosC).getFecha()});
            
            Total = Total+listaInClinico.get(PosC).getPrecioExamen();
        }
        
        TxtTotalExamen.setText(""+Total);

        
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
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCrear;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnImprimir;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnRellenar;
    private javax.swing.JTable TableInClinico;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtNombCliente;
    private javax.swing.JTextField TxtNombExamen;
    private javax.swing.JTextField TxtPrecioExamen;
    private javax.swing.JLabel TxtTotalExamen;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jCFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
