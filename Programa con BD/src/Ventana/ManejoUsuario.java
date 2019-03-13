package Ventana;

import Clase.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class ManejoUsuario extends javax.swing.JFrame {

    Conexion c=new Conexion();
    Connection cn=c.SQLConnection();
    public ManejoUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnModificar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPassword.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 187, 30));

        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, 20));

        btnGuardar.setBackground(new java.awt.Color(0, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar (1).png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setOpaque(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        txtUserName.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 187, 30));

        jLabel1.setText("USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario (2).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel4.setText("Buscar(Código):");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 120, -1));

        btnModificar1.setBackground(new java.awt.Color(0, 102, 102));
        btnModificar1.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        btnModificar1.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar1.setText("MODIFICAR");
        btnModificar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Permite guardar el nombre de Usuario y Contraseña
        try {
            if (txtUserName.getText().length() == 0 || txtPassword.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña vacíos", "ADVERTENCIA", JOptionPane.PLAIN_MESSAGE);
            } else {
                PreparedStatement pst = cn.prepareStatement("insert into usuarios values(?,?,?)");
                pst.setString(1, "0");
                pst.setString(2, txtUserName.getText().trim());
                pst.setString(3, txtPassword.getText().trim());
                pst.executeUpdate();
                txtUserName.setText("");
                txtPassword.setText("");
                JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO", " ", JOptionPane.PLAIN_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fallo " + e, "ERROR", JOptionPane.PLAIN_MESSAGE);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Permite buscar por código las tuplas
        try {
            if (txtBuscar.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese Código a Buscar", "ADVERTENCIA", JOptionPane.PLAIN_MESSAGE);
            } else {
                PreparedStatement pst = cn.prepareStatement("select* from usuarios where CodUsuario = ?");
                pst.setString(1, txtBuscar.getText().trim());

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    txtUserName.setText(rs.getString("NomUsuario"));
                    txtPassword.setText(rs.getString("PassUsuario"));
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario inexistente", "ADVERTENCIA", JOptionPane.PLAIN_MESSAGE);
                }
                // txtBuscar.setText("");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fallo: " + e, "ERROR", JOptionPane.PLAIN_MESSAGE);
            txtBuscar.setText("");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Elimina el registro buscado
        try {
            PreparedStatement pst = cn.prepareStatement("delete from usuarios where CodUsuario = ?");

            pst.setString(1, txtBuscar.getText().trim());
            pst.executeUpdate();

            txtUserName.setText("");
            txtPassword.setText("");
            txtBuscar.setText("");
            JOptionPane.showMessageDialog(null, "Usuario Eliminado", "REGISTRO DATOS", JOptionPane.PLAIN_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fallo: " + e, "ERROR", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        //Modificar datos mediante la busqueda
        try {
            String sUsuario = txtUserName.getText().trim();
            String sPassword = txtPassword.getText().trim();
            if (txtBuscar.getText().length() == 0 || txtUserName.getText().length() == 0 || txtPassword.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "No hay campos para modificar", "REGISTRO DATOS", JOptionPane.PLAIN_MESSAGE);
            }
            if (txtUserName.getText().equals(sUsuario) || txtPassword.getText().equals(sPassword)) {
                JOptionPane.showMessageDialog(null, "No hay campos modificados", "REGISTRO DATOS", JOptionPane.PLAIN_MESSAGE);
            } else {
                String cod = txtBuscar.getText().trim();
                PreparedStatement pst = cn.prepareStatement("update usuarios set NomUsuario = ?, PassUsuario = ? where CodUsuario = " + cod);

                pst.setString(1, txtUserName.getText().trim());
                pst.setString(2, txtPassword.getText().trim());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato Modificado", "REGISTRO DATOS", JOptionPane.PLAIN_MESSAGE);
                txtUserName.setText("");
                txtPassword.setText("");
                txtBuscar.setText("");
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
            JOptionPane.showMessageDialog(null, "Fallo: " + e, "ERROR", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnModificar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
