
package Ventana;

import Clase.Conexion;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class Concepto extends javax.swing.JFrame {

    Conexion c = new Conexion();
    Connection cn = c.SQLConnection();
    public Concepto() {
        initComponents();
        MostrarDatos("");
        this.setLocationRelativeTo(null);
    }

     void InhabilitarBotones() {
        btnModificar.setEnabled(false);
    }

    void LimpiarTexts() {
        txtCod.setText("");
        txtNom.setText("");
        txtEfecto.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPmModEliminar = new javax.swing.JPopupMenu();
        jMiModificar = new javax.swing.JMenuItem();
        jMiEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConcepto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtCod = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtEfecto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

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

        tblConcepto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblConcepto.setComponentPopupMenu(jPmModEliminar);
        jScrollPane1.setViewportView(tblConcepto);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Concepto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 14))); // NOI18N

        txtCod.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        txtNom.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        txtEfecto.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Efecto");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEfecto, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCod)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEfecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        txtBuscar.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void MostrarDatos(String sCadena) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Efecto");
        tblConcepto.setModel(modelo);
        String[] sDatos = new String[4];
        String sSQL = "";
        if (sCadena.equals("")) {
            sSQL = "SELECT * FROM concepto";
        } else {
            sSQL = "SELECT * FROM concepto WHERE codConcepto='" + sCadena + "'";
        }
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                sDatos[0] = rs.getString(1);
                sDatos[1] = rs.getString(2);
                sDatos[2] = rs.getString(3);
                modelo.addRow(sDatos);
            }
            tblConcepto.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (evt.getSource().equals(btnGuardar)) {
            try {
                if (txtCod.getText().length() == 0 || txtNom.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "No están llenos los campos", "ADVERTENCIA", JOptionPane.PLAIN_MESSAGE);
                } else {
                    PreparedStatement pst = cn.prepareStatement("insert into concepto values(?,?,?)");
                    pst.setString(1, txtCod.getText().trim());
                    pst.setString(2, txtNom.getText().trim());
                    pst.setString(3, txtEfecto.getText().trim());
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
                String sSQL="UPDATE concepto SET nomConcepto='" + txtNom.getText().trim() + "',efecto_concepto='"+txtEfecto.getText().trim()+"' WHERE codConcepto='" + txtCod.getText().trim() + "'";
                PreparedStatement pst = cn.prepareStatement(sSQL);
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

    private void jMiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiModificarActionPerformed
        int fila = tblConcepto.getSelectedRow();
        if (fila >= 0) {
            txtCod.setText(tblConcepto.getValueAt(fila, 0).toString());
            txtNom.setText(tblConcepto.getValueAt(fila, 1).toString());
            txtEfecto.setText(tblConcepto.getValueAt(fila, 2).toString());
            btnModificar.setEnabled(true);
            btnGuardar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "No selecciono fila", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMiModificarActionPerformed

    private void jMiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiEliminarActionPerformed
        int fila=tblConcepto.getSelectedRow();
        String sCod="";
        sCod=tblConcepto.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst=cn.prepareStatement("DELETE FROM concepto WHERE codConcepto='"+sCod+"'");
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
    private javax.swing.JMenuItem jMiEliminar;
    private javax.swing.JMenuItem jMiModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPmModEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblConcepto;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEfecto;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
