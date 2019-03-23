package Ventana;

import Clase.*;
import Clase.Generador_Codigo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class NominaEncabezada extends javax.swing.JFrame {

    Conexion c = new Conexion();
    Connection cn = c.SQLConnection();

    public NominaEncabezada() {
        initComponents();
        MostrarDatos("");
        GenerarCodigo();
        this.setLocationRelativeTo(null);
    }

    void InhabilitarBotones() {
        btnModificar.setEnabled(false);
    }

    void LimpiarTexts() {
        txtCod.setText("");
        txtFecIni.setText("");
        txtFecFin.setText("");
        txtValor.setText("");
    }

    void GenerarCodigo() {
        int j;
        String sNum = "";
        String sC = "";
        String sSQL = "select max(codnomina) from nomina_encabezada";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            if (rs.next()) {
                sC = rs.getString(1);
            }
            if (sC == null) {
                txtCod.setText("NE0001");
            } else {
                char cR1 = sC.charAt(2);
                char cR2 = sC.charAt(3);
                char cR3 = sC.charAt(4);
                char cR4 = sC.charAt(5);
                String sRT = "" + cR1 + cR2 + cR3 + cR4;
                j = Integer.parseInt(sRT);
                Generador_Codigo cg = new Generador_Codigo();
                cg.Generar(j);
                txtCod.setText("NE" + cg.Serie());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void MostrarDatos(String sCadena) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Fecha Final");
        modelo.addColumn("Valor");
        tblNomEnc.setModel(modelo);
        String[] sDatos = new String[4];
        String sSQL = "";
        if (sCadena.equals("")) {
            sSQL = "SELECT * FROM nomina_encabezada";
        } else {
            sSQL = "SELECT * FROM nomina_encabezada WHERE codnomina='" + sCadena + "'";
        }
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                sDatos[0] = rs.getString(1);
                sDatos[1] = rs.getString(2);
                sDatos[2] = rs.getString(3);
                sDatos[3] = rs.getString(4);
                modelo.addRow(sDatos);
            }
            tblNomEnc.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPmModEliminar = new javax.swing.JPopupMenu();
        jMiModificar = new javax.swing.JMenuItem();
        jMiEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtFecIni = new javax.swing.JTextField();
        txtFecFin = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNomEnc = new javax.swing.JTable();

        jMiModificar.setText("Modificar");
        jMiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiModificarActionPerformed(evt);
            }
        });
        jPmModEliminar.add(jMiModificar);

        jMiEliminar.setText("Eliminar");
        jMiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiEliminarActionPerformed(evt);
            }
        });
        jPmModEliminar.add(jMiEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Nomina Encabezada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Fecha Inicial");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Fecha Final");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Valor");

        txtCod.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        txtCod.setEnabled(false);

        txtFecIni.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        txtFecFin.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        txtValor.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(0, 153, 153));
        btnGuardar.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/savedisk_floppydisk_guardar_1543 (1).png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCod, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(txtFecIni)
                            .addComponent(txtFecFin)
                            .addComponent(txtValor)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addComponent(txtFecIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFecFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 27, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 329, 119, -1));

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
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 325, 50, 30));

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
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 120, 40));

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
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 120, 40));

        tblNomEnc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblNomEnc.setComponentPopupMenu(jPmModEliminar);
        jScrollPane1.setViewportView(tblNomEnc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 27, 385, 278));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (evt.getSource().equals(btnBuscar)) {
            MostrarDatos(txtBuscar.getText().trim());
            txtBuscar.setText("");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if (evt.getSource().equals(btnMostrar)) {
            MostrarDatos("");
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (evt.getSource().equals(btnModificar)) {
            try {
                String sSQL = "UPDATE nomina_encabezada SET fechainicial='" + txtFecIni.getText().trim() + "',fechafinal='" + txtFecFin.getText().trim() + "',valornomina='" + txtValor.getText().trim() + "' WHERE codnomina='" + txtCod.getText().trim() + "'";
                PreparedStatement pst = cn.prepareStatement(sSQL);
                pst.executeUpdate();
                MostrarDatos("");
                InhabilitarBotones();
                LimpiarTexts();
                btnGuardar.setEnabled(true);
                GenerarCodigo();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (evt.getSource().equals(btnGuardar)) {
            try {
                if (txtCod.getText().length() == 0 || txtFecIni.getText().length() == 0 || txtFecFin.getText().length() == 0 || txtValor.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "No están llenos los campos", "ADVERTENCIA", JOptionPane.PLAIN_MESSAGE);
                } else {
                    PreparedStatement pst = cn.prepareStatement("insert into nomina_encabezada values(?,?,?,?)");
                    pst.setString(1, txtCod.getText().trim());
                    pst.setString(2, txtFecIni.getText().trim());
                    pst.setString(3, txtFecFin.getText().trim());
                    pst.setString(4, txtValor.getText().trim());
                    pst.executeUpdate();
                    MostrarDatos("");
                    LimpiarTexts();
                    JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO", " ", JOptionPane.PLAIN_MESSAGE);
                    InhabilitarBotones();
                    GenerarCodigo();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fallo: " + e, "ERROR", JOptionPane.PLAIN_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jMiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiModificarActionPerformed
        int fila = tblNomEnc.getSelectedRow();
        if (fila >= 0) {
            txtCod.setText(tblNomEnc.getValueAt(fila, 0).toString().trim());
            txtFecIni.setText(tblNomEnc.getValueAt(fila, 1).toString().trim());
            txtFecFin.setText(tblNomEnc.getValueAt(fila, 2).toString().trim());
            txtValor.setText(tblNomEnc.getValueAt(fila, 3).toString().trim());
            btnModificar.setEnabled(true);
            btnGuardar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "No selecciono fila", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMiModificarActionPerformed

    private void jMiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiEliminarActionPerformed
        int fila = tblNomEnc.getSelectedRow();
        String sCod = "";
        sCod = tblNomEnc.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM nomina_encabezada WHERE codnomina='" + sCod + "'");
            pst.executeUpdate();
            MostrarDatos("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jMiEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMiEliminar;
    private javax.swing.JMenuItem jMiModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPmModEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNomEnc;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtFecFin;
    private javax.swing.JTextField txtFecIni;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
