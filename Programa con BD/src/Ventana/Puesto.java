package Ventana;

import Clase.Conexion;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;

public class Puesto extends javax.swing.JFrame {

    Conexion c = new Conexion();
    Connection cn = c.SQLConnection();

    public Puesto() {
        initComponents();
        this.setLocationRelativeTo(null);
        InhabilitarBotones();
        MostrarDatos("");
    }

    void InhabilitarBotones() {
        btnModificar.setEnabled(false);
    }

    void LimpiarTexts() {
        txtCod.setText("");
        txtNombre.setText("");
    }

    void MostrarDatos(String sCadena) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        tblPuesto.setModel(modelo);
        String[] sDatos = new String[3];
        String sSQL = "";
        if (sCadena.equals("")) {
            sSQL = "SELECT * FROM puesto";
        } else {
            sSQL = "SELECT * FROM puesto WHERE codpuesto='" + sCadena + "'";
        }
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                sDatos[0] = rs.getString(1);
                sDatos[1] = rs.getString(2);
                modelo.addRow(sDatos);
            }
            tblPuesto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPmModificar = new javax.swing.JPopupMenu();
        jMnModificar = new javax.swing.JMenuItem();
        jMnEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPuesto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();

        jMnModificar.setText("Modificar");
        jMnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnModificarActionPerformed(evt);
            }
        });
        jPmModificar.add(jMnModificar);

        jMnEliminar.setText("Eliminar");
        jMnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnEliminarActionPerformed(evt);
            }
        });
        jPmModificar.add(jMnEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPuesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPuesto.setComponentPopupMenu(jPmModificar);
        jScrollPane1.setViewportView(tblPuesto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 11, 280, 214));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Puesto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");

        txtCod.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCod, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(txtNombre))
                .addGap(39, 39, 39))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, 190));

        txtBuscar.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 119, -1));

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
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 50, 30));

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
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 120, 40));

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
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (evt.getSource().equals(btnGuardar)) {
            try {
                if (txtCod.getText().length() == 0 || txtNombre.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "No están llenos los campos", "ADVERTENCIA", JOptionPane.PLAIN_MESSAGE);
                } else {
                    PreparedStatement pst = cn.prepareStatement("insert into puesto values(?,?)");
                    pst.setString(1, txtCod.getText().trim());
                    pst.setString(2, txtNombre.getText().trim());
                    pst.executeUpdate();
                    MostrarDatos("");
                    LimpiarTexts();
                    JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO", " ", JOptionPane.PLAIN_MESSAGE);
                    InhabilitarBotones();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fallo: " + e, "ERROR", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (evt.getSource().equals(btnModificar)) {
            try {
                PreparedStatement pst = cn.prepareStatement("UPDATE puesto SET nompuesto='" + txtNombre.getText().trim() + "' WHERE codpuesto='" + txtCod.getText().trim() + "'");
                pst.executeUpdate();
                MostrarDatos("");
                InhabilitarBotones();
                LimpiarTexts();
                btnGuardar.setEnabled(true);
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

    private void jMnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnModificarActionPerformed
        int fila = tblPuesto.getSelectedRow();
        if (fila >= 0) {
            txtCod.setText(tblPuesto.getValueAt(fila, 0).toString());
            txtNombre.setText(tblPuesto.getValueAt(fila, 1).toString());
            btnModificar.setEnabled(true);
            btnGuardar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "No selecciono fila", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMnModificarActionPerformed

    private void jMnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnEliminarActionPerformed
        int fila=tblPuesto.getSelectedRow();
        String sCod="";
        sCod=tblPuesto.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst=cn.prepareStatement("DELETE FROM puesto WHERE codpuesto='"+sCod+"'");
            pst.executeUpdate();
            MostrarDatos("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jMnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMnEliminar;
    private javax.swing.JMenuItem jMnModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPmModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPuesto;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
