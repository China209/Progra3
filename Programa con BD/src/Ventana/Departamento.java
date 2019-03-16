package Ventana;

import Clase.Conexion;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class Departamento extends javax.swing.JFrame {

    Conexion c = new Conexion();
    Connection cn = c.SQLConnection();

    public Departamento() {
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
        txtStatus.setText("");
    }

    void MostrarDatos(String sCadena) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estatus");
        tblDepto.setModel(modelo);
        String[] sDatos = new String[3];
        String sSQL = "";
        if (sCadena.equals("")) {
            sSQL = "SELECT * FROM departamento";
        } else {
            sSQL = "SELECT * FROM departamento WHERE depcodigo='" + sCadena + "'";
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
            tblDepto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPmModEliminar = new javax.swing.JPopupMenu();
        jMiModificar = new javax.swing.JMenuItem();
        jMiEliminar = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepto = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Departamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Estatus");

        txtCod.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        txtNom.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N

        txtStatus.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

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
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCod)
                        .addComponent(txtNom)
                        .addComponent(txtStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblDepto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDepto.setComponentPopupMenu(jPmModEliminar);
        jScrollPane1.setViewportView(tblDepto);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (txtCod.getText().length() == 0 || txtNom.getText().length() == 0 || txtStatus.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "No están llenos los campos", "ADVERTENCIA", JOptionPane.PLAIN_MESSAGE);
            } else {
                PreparedStatement pst = cn.prepareStatement("insert into departamento values(?,?,?)");
                pst.setString(1, txtCod.getText().trim());
                pst.setString(2, txtNom.getText().trim());
                pst.setString(3, txtStatus.getText().trim());
                pst.executeUpdate();
                MostrarDatos("");
                LimpiarTexts();
                JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO", " ", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fallo: " + e, "ERROR", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (evt.getSource().equals(btnModificar)) {
            try {
                String sSQL = "UPDATE departamento SET depnombre='" + txtNom.getText().trim() + "',depstatus='" + txtStatus.getText().trim() + "' WHERE depcodigo='" + txtCod.getText().trim() + "'";
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
        int fila = tblDepto.getSelectedRow();
        if (fila >= 0) {
            txtCod.setText(tblDepto.getValueAt(fila, 0).toString());
            txtNom.setText(tblDepto.getValueAt(fila, 1).toString());
            txtStatus.setText(tblDepto.getValueAt(fila, 2).toString());
            btnModificar.setEnabled(true);
            btnGuardar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "No selecciono fila", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMiModificarActionPerformed

    private void jMiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiEliminarActionPerformed
        int fila=tblDepto.getSelectedRow();
        String sCod="";
        sCod=tblDepto.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst=cn.prepareStatement("DELETE FROM departamento WHERE depcodigo='"+sCod+"'");
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPmModEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDepto;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
