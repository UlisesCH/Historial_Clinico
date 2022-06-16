/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFInContable;

import InClinico.CRUD_InClinico;
import static InClinico.CRUD_InClinico.listaInClinico;
import InContable.Conexion;
import InContable.CRUD_InContable;
import static InContable.CRUD_InContable.listaInContable;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class JFMostrar_InContable extends javax.swing.JFrame {
    //OBJETO PARA INTERACTUAR CON LA TABLA
    DefaultTableModel model;
    int ID;
    int fila;
    /**
     * Creates new form JFMostrar_InClinico
     */
    public JFMostrar_InContable() {
        initComponents();
        //SE VINCULA CON LA TABLA
        model = (DefaultTableModel) this.TableInContable.getModel();
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        TxtPrecioProducto = new javax.swing.JTextField();
        TxtNombProveedor = new javax.swing.JTextField();
        TxtNombProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCFecha = new com.toedter.calendar.JDateChooser();
        TxtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CombxCuenta = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableInContable = new javax.swing.JTable();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnImprimir = new javax.swing.JButton();
        BtnCrear = new javax.swing.JButton();
        TxtTotalContable = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtBuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        BtnRellenar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TxtTotalExamenes = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        TxtPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecioProductoActionPerformed(evt);
            }
        });

        TxtNombProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombProveedorActionPerformed(evt);
            }
        });

        TxtNombProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombProductoActionPerformed(evt);
            }
        });

        jLabel1.setText("NOMBRE PRODUCTO");

        jLabel2.setText("PROVEEDOR");

        jLabel3.setText("PRECIO");

        jLabel4.setText("FECHA");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("MOSTRAR INFORMES CONTABLES");

        TxtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCantidadActionPerformed(evt);
            }
        });

        jLabel6.setText("CANTIDAD");

        CombxCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Cuenta", "Inventario||Caja", "Inventario||Banco", "Mobiliario||Caja", "Mobiliario||Banco"}));
        CombxCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombxCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNombProducto)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(TxtCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNombProveedor)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtPrecioProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CombxCuenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtPrecioProducto)
                        .addComponent(TxtNombProveedor)
                        .addComponent(TxtNombProducto)
                        .addComponent(TxtCantidad)
                        .addComponent(CombxCuenta)))
                .addGap(17, 17, 17))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        TableInContable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Cantidad", "Proveedor", "Precio", "Tipo Cuenta", "Fecha"
            }
        ));
        TableInContable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableInContableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableInContable);
        if (TableInContable.getColumnModel().getColumnCount() > 0) {
            TableInContable.getColumnModel().getColumn(0).setPreferredWidth(2);
            TableInContable.getColumnModel().getColumn(2).setPreferredWidth(5);
            TableInContable.getColumnModel().getColumn(4).setPreferredWidth(5);
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

        TxtTotalContable.setText("0.0");

        jLabel8.setText("PRECIO TOTAL:");

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnRellenar.setText("Rellenar");

        jLabel7.setText("INGRESOS TOTAL:");

        TxtTotalExamenes.setText("0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEliminar)
                        .addGap(42, 42, 42)
                        .addComponent(TxtBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnRellenar)
                        .addGap(35, 35, 35)
                        .addComponent(BtnImprimir)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCrear)))
                .addGap(2, 2, 2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtTotalContable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtTotalExamenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(111, 111, 111))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModificar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnImprimir)
                    .addComponent(BtnCrear)
                    .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnRellenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTotalContable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtTotalExamenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        //OBJETO PARA ENTERACTUAR CON LA CONEXION
        Conexion conec = new Conexion();
        //CREA REALIZA LA CONEXION Y CREA LA TABLA SI NO HAY
        conec.CrearTablas();
        
        fila = TableInContable.getSelectedRow();
        ID = 0;
        
        if(fila != -1){
            
            ID = Integer.parseInt((String) TableInContable.getValueAt(fila, 0).toString());

            //SE OBTIENEN LOS DATOS DEL JCALENDAT
            String dia = Integer.toString(jCFecha.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(jCFecha.getCalendar().get(Calendar.MONTH)+1);
            String anio = Integer.toString(jCFecha.getCalendar().get(Calendar.YEAR));

            //SE OBTIENES LOS DATOS DE LOS INPUTS
            String NombProducto = TxtNombProducto.getText();
            int Cantidad = Integer.parseInt(TxtCantidad.getText());
            String NombProveedor = TxtNombProveedor.getText();
            Double PrecioProducto = Double.parseDouble(TxtPrecioProducto.getText());
            String TipoCuenta = (String) CombxCuenta.getSelectedItem();
            //SE ALMACENA LOS VALOR DE LA FECHA
            String Fecha = dia+ "/" +mes+ "/" +anio;

            //OBJETO PARA ENTERACTUAR CON EL CRUD
            CRUD_InContable Cr = new CRUD_InContable();
            //SE MANDA LOS VALORES AL INSERTAR
            Cr.Modificar(ID, NombProducto, Cantidad, NombProveedor, PrecioProducto, TipoCuenta, Fecha);

            model.setRowCount(0);
            Llenar();
        }
        else{
            JOptionPane.showMessageDialog(null, "NO SE A SELECIONADO FILA");

        }

    }//GEN-LAST:event_BtnModificarActionPerformed

    private void TableInContableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableInContableMouseClicked
        // TODO add your handling code here:
        
        fila = TableInContable.getSelectedRow();
        ID = 0;
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "NO SE A SELECIONADO FILA");
        }
        else{
            try {
                ID = Integer.parseInt((String) TableInContable.getValueAt(fila, 0).toString());
                String NombProducto = (String) TableInContable.getValueAt(fila, 1);
                int Cantidad = Integer.parseInt(TableInContable.getValueAt(fila, 2).toString());
                String NombProveedor = (String) TableInContable.getValueAt(fila, 3);
                Double PrecioExamen = Double.parseDouble((String) TableInContable.getValueAt(fila, 4).toString());
                String TipoCuenta = (String) TableInContable.getValueAt(fila, 5);
                String Fecha = (String) TableInContable.getValueAt(fila, 6);
                
                TxtNombProducto.setText(NombProducto);
                TxtCantidad.setText(""+Cantidad);
                TxtNombProveedor.setText(NombProveedor);
                TxtPrecioProducto.setText(""+PrecioExamen);
                
                CombxCuenta.setSelectedItem(TipoCuenta);
                
                java.util.Date fechaParseada= new SimpleDateFormat("dd/MM/yyyy").parse(Fecha);
                jCFecha.setDate(fechaParseada);
            } catch (ParseException ex) {
                Logger.getLogger(JFMostrar_InContable.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_TableInContableMouseClicked

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        
        int fila = TableInContable.getSelectedRow();
        ID = 0;
        
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "NO SE A SELECIONADO FILA");
        }
        else{
            ID = Integer.parseInt((String) TableInContable.getValueAt(fila, 0).toString());
            
            CRUD_InContable Cr = new CRUD_InContable();
            Cr.Eliminar(ID);
        }
        
        model.setRowCount(0);
        Llenar();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearActionPerformed
        // TODO add your handling code here:
        //OBJETO PARA INTERACTUAR CON EL JFCrear_InContable
        JFCrear_InContable InClinico = new JFCrear_InContable();
        //SE INDICA QUE SE MUESTRE LA VENTANA
        InClinico.setVisible(true);
        //SE OCULTA LA VENTANA ACTUAL
        this.dispose();
    }//GEN-LAST:event_BtnCrearActionPerformed

    private void TxtNombProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombProductoActionPerformed

    private void CombxCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombxCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombxCuentaActionPerformed

    private void TxtPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecioProductoActionPerformed

    private void TxtNombProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombProveedorActionPerformed

    private void TxtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCantidadActionPerformed

    private void BtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImprimirActionPerformed
        // TODO add your handling code here:
        
        Document documento = new Document();
        
        try{
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/InformeContable.pdf"));
            
            documento.open();
            
            Paragraph parrafo = new Paragraph();
            
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("LABORATORIO CLINICO DE ANALISIS HENDRYKS\n \n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
            
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Informacion de los Datos Contables. \n \n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));

            documento.add(parrafo);
            
            PdfPTable tablaCliente = new PdfPTable(6);
            tablaCliente.addCell("ID");
            tablaCliente.addCell("Nombre");
            tablaCliente.addCell("Nombre del Examen");
            tablaCliente.addCell("Precio");
            tablaCliente.addCell("Tipo Cuenta");
            tablaCliente.addCell("Fecha");
            
            try{
                String sql = "SELECT * FROM InContable";
                InContable.Conexion  cn = new InContable.Conexion();
                cn.CrearTablas();
                PreparedStatement pst = cn.conexion.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    do{
                        tablaCliente.addCell(rs.getString(2));
                        tablaCliente.addCell(rs.getString(3));
                        tablaCliente.addCell(rs.getString(4));
                        tablaCliente.addCell(rs.getString(5));
                        tablaCliente.addCell(rs.getString(6));
                        tablaCliente.addCell(rs.getString(7));
                    } while(rs.next());
                    documento.add(tablaCliente);
                }
                
            }catch (SQLException ex) {
                Logger.getLogger(JFMostrar_InContable.class.getName()).log(Level.SEVERE, null, ex);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado correctamente");
            
        }catch (FileNotFoundException ex) {
            Logger.getLogger(JFMostrar_InContable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(JFMostrar_InContable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_BtnImprimirActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
        
        BuscarEnTabla(TxtBuscar.getText());
        
    }//GEN-LAST:event_BtnBuscarActionPerformed

    public void Llenar(){
        Double Total = 0.0;
        Double TotalEx = 0.0;
        
        //SE LIMPIA LA TABLA
        model.setRowCount(0);
        //OBJETO PARA ENTERACTUAR CON EL CRUD
        CRUD_InContable cr = new CRUD_InContable();
        //SE LLENA EL ARREGLO CON LOS VALORES DE LA TABLA
        cr.LlenarTabla();
        //CICLO PARA LLENAR LA TABLA CON LOS VALORES DEL ARREGLO
        for(int PosC = 0; PosC < listaInContable.size(); PosC++){

            model.addRow(new Object[]{listaInContable.get(PosC).getID(),listaInContable.get(PosC).getNombProducto(), listaInContable.get(PosC).getCantidad()
                        , listaInContable.get(PosC).getNombProveedor(), listaInContable.get(PosC).getPrecioProducto()
                        , listaInContable.get(PosC).getTipoCuenta(),listaInContable.get(PosC).getFecha()});
        
            Total = Total+listaInContable.get(PosC).getPrecioProducto();
        }
        
        //OBJETO PARA ENTERACTUAR CON EL CRUD
        CRUD_InClinico crC = new CRUD_InClinico();
        //SE LLENA EL ARREGLO CON LOS VALORES DE LA TABLA
        crC.LlenarTabla();
        
        //CICLO PARA LLENAR LA TABLA CON LOS VALORES DEL ARREGLO
        for(int PosC = 0; PosC < listaInClinico.size(); PosC++){
            
            TotalEx = TotalEx+listaInClinico.get(PosC).getPrecioExamen();
            
        }
        
        TxtTotalExamenes.setText(""+TotalEx);
        
        TxtTotalContable.setText(""+Total);
        
    }
    
    public void BuscarEnTabla(String buscar){
        Double Total = 0.0;
        
        //SE LIMPIA LA TABLA
        model.setRowCount(0);
        //OBJETO PARA ENTERACTUAR CON EL CRUD
        CRUD_InContable cr = new CRUD_InContable();
        
        cr.BuscarEnTabla(buscar);
        
        //CICLO PARA LLENAR LA TABLA CON LOS VALORES DEL ARREGLO
        for(int PosC = 0; PosC < listaInContable.size(); PosC++){

            model.addRow(new Object[]{listaInContable.get(PosC).getID(),listaInContable.get(PosC).getNombProducto(), listaInContable.get(PosC).getCantidad()
                        , listaInContable.get(PosC).getNombProveedor(), listaInContable.get(PosC).getPrecioProducto()
                        , listaInContable.get(PosC).getTipoCuenta(),listaInContable.get(PosC).getFecha()});
            
            Total = Total+listaInContable.get(PosC).getPrecioProducto();
        }
        
        TxtTotalContable.setText(""+Total);

        
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
            java.util.logging.Logger.getLogger(JFMostrar_InContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMostrar_InContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMostrar_InContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMostrar_InContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMostrar_InContable().setVisible(true);
                
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
    private javax.swing.JComboBox<String> CombxCuenta;
    private javax.swing.JTable TableInContable;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtNombProducto;
    private javax.swing.JTextField TxtNombProveedor;
    private javax.swing.JTextField TxtPrecioProducto;
    private javax.swing.JLabel TxtTotalContable;
    private javax.swing.JLabel TxtTotalExamenes;
    private com.toedter.calendar.JDateChooser jCFecha;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
