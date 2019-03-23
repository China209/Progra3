package Ventana;

import Clase.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class Empleados extends javax.swing.JFrame {

    Conexion c = new Conexion();
    Connection cn = c.SQLConnection();

    public Empleados() {
        initComponents();
        MostrarDatos("");
        GenerarCodigo();
        ElementosPuesto();
        ElementosDepto();
        this.setLocationRelativeTo(null);
    }

    void InhabilitarBotones() {
        btnModificar.setEnabled(false);
    }

    void LimpiarTexts() {
        txtCod.setText("");
        txtNom.setText("");
        txtSueldo.setText("");
        cbmPuesto.setSelectedIndex(0);
        cbmDepto.setSelectedIndex(0);
        txtStatus.setText("");
    }
    void GenerarCodigo(){
        int j;
        String sNum="";
        String sC="";
        String sSQL="select max(empcodigo) from empleado";
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            if(rs.next()){
                sC=rs.getString(1);
            }
            if(sC==null){
                txtCod.setText("EM0001");
            }else{
                char cR1=sC.charAt(2);
                char cR2=sC.charAt(3);
                char cR3=sC.charAt(4);
                char cR4=sC.charAt(5);
                String sRT=""+cR1+cR2+cR3+cR4;
                j=Integer.parseInt(sRT);
                Generador_Codigo cg=new Generador_Codigo();
                cg.Generar(j);
                txtCod.setText("EM"+cg.Serie());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void MostrarDatos(String sCadena) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Sueldo");
        modelo.addColumn("Puesto");
        modelo.addColumn("Depto.");
        modelo.addColumn("Estatus");
        tblEmpleados.setModel(modelo);
        String[] sDatos = new String[6];
        String sSQL = "";
        if (sCadena.equals("")) {
            sSQL = "SELECT * FROM empleado";
        } else {
            sSQL = "SELECT * FROM empleado WHERE empcodigo='" + sCadena + "'";
        }
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                sDatos[0] = rs.getString(1);
                sDatos[1] = rs.getString(2);
                sDatos[2] = rs.getString(3);
                sDatos[3] = rs.getString(4);
                sDatos[4] = rs.getString(5);
                sDatos[5] = rs.getString(6);
                modelo.addRow(sDatos);
            }
            tblEmpleados.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnModEliminar = new javax.swing.JPopupMenu();
        jMiModificar = new javax.swing.JMenuItem();
        jMiEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbmPuesto = new javax.swing.JComboBox<>();
        cbmDepto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();

        jMiModificar.setText("Modificar");
        jMiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiModificarActionPerformed(evt);
            }
        });
        jPnModEliminar.add(jMiModificar);

        jMiEliminar.setText("Eliminar");
        jMiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiEliminarActionPerformed(evt);
            }
        });
        jPnModEliminar.add(jMiEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Departamento");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Estatus");

        txtCod.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        txtCod.setEnabled(false);

        txtNom.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        txtStatus.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        btnGrabar.setBackground(new java.awt.Color(0, 153, 153));
        btnGrabar.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        btnGrabar.setForeground(new java.awt.Color(255, 255, 255));
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/savedisk_floppydisk_guardar_1543 (1).png"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGrabar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Sueldo");

        txtSueldo.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Puesto");

        cbmPuesto.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        cbmDepto.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCod, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(txtNom)
                                    .addComponent(txtSueldo)
                                    .addComponent(cbmPuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbmDepto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbmPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbmDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, -1, 370));

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblEmpleados.setComponentPopupMenu(jPnModEliminar);
        jScrollPane1.setViewportView(tblEmpleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 429, 370));

        btnModificar.setBackground(new java.awt.Color(0, 153, 153));
        btnModificar.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pencil512_44200.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 120, 40));

        btnBuscar.setBackground(new java.awt.Color(0, 153, 153));
        btnBuscar.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 50, 30));

        txtBuscar.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 119, -1));

        btnMostrar.setBackground(new java.awt.Color(0, 153, 153));
        btnMostrar.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar General");
        btnMostrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if (evt.getSource().equals(btnGrabar)) {
            try {
                if (txtCod.getText().length() == 0 || txtNom.getText().length() == 0 || cbmPuesto.getSelectedIndex()==0||cbmDepto.getSelectedIndex()==0 || txtStatus.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "No están llenos los campos", "ADVERTENCIA", JOptionPane.PLAIN_MESSAGE);
                } else {
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO empleado VALUES(?,?,?,?,?,?)");
                    pst.setString(1, txtCod.getText().trim());
                    pst.setString(2, txtNom.getText().trim());
                    pst.setString(3, txtSueldo.getText().trim());
                    pst.setString(4, cbmPuesto.getSelectedItem().toString().trim());
                    pst.setString(5, cbmDepto.getSelectedItem().toString().trim());
                    pst.setString(6, txtStatus.getText().trim());
                    pst.executeUpdate();
                    MostrarDatos("");
                    LimpiarTexts();
                    InhabilitarBotones();
                    JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO", " ", JOptionPane.PLAIN_MESSAGE);
                    GenerarCodigo();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fallo: " + e, "ERROR", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    void ElementosPuesto(){
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM puesto");
            cbmPuesto.addItem("----Seleccione Puesto----");
            while(rs.next()){
                this.cbmPuesto.addItem(rs.getString("codpuesto"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     void ElementosDepto(){
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM departamento");
            cbmDepto.addItem("----Seleccione Depto.----");
            while(rs.next()){
                this.cbmDepto.addItem(rs.getString("depcodigo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (evt.getSource().equals(btnModificar)) {
            String sSQL="UPDATE empleado SET empnombre='"+txtNom.getText().trim()+"',empsueldo='"+txtSueldo.getText().trim()+"',codpuesto='"+cbmPuesto.getSelectedItem().toString().trim()+"',depcodigo='"+cbmDepto.getSelectedItem().toString().trim()+"',empstatus='"+txtStatus.getText().trim()+"' WHERE empcodigo='"+txtCod.getText().trim()+"'";
            try {
                PreparedStatement pst = cn.prepareStatement(sSQL);
                pst.executeUpdate();
                MostrarDatos("");
                InhabilitarBotones();
                LimpiarTexts();
                btnGrabar.setEnabled(true);
                GenerarCodigo();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if (evt.getSource().equals(btnMostrar)) {
            MostrarDatos("");
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (evt.getSource().equals(btnBuscar)) {
            MostrarDatos(txtBuscar.getText().trim());
            txtBuscar.setText("");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jMiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiModificarActionPerformed
        int fila = tblEmpleados.getSelectedRow();
        if (fila >= 0) {
            txtCod.setText(tblEmpleados.getValueAt(fila, 0).toString());
            txtNom.setText(tblEmpleados.getValueAt(fila, 1).toString());
            txtSueldo.setText(tblEmpleados.getValueAt(fila, 2).toString());
            cbmPuesto.setSelectedItem(tblEmpleados.getValueAt(fila, 3).toString());
            cbmDepto.setSelectedItem(tblEmpleados.getValueAt(fila, 4).toString());
            txtStatus.setText(tblEmpleados.getValueAt(fila, 5).toString());
            btnModificar.setEnabled(true);
            btnGrabar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "No selecciono fila", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMiModificarActionPerformed

    private void jMiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiEliminarActionPerformed
        int fila = tblEmpleados.getSelectedRow();
        String sCod = "";
        sCod = tblEmpleados.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM empleado WHERE empcodigo='" + sCod + "'");
            pst.executeUpdate();
            MostrarDatos("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jMiEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> cbmDepto;
    private javax.swing.JComboBox<String> cbmPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMiEliminar;
    private javax.swing.JMenuItem jMiModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPnModEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
