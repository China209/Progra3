package Ventana;


public class Menu extends javax.swing.JFrame {

    ManejoUsuario mu = new ManejoUsuario();
    Usuarios u = new Usuarios();
    Empleados e=new Empleados();
    Departamento d=new Departamento();
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        btnManejo = new javax.swing.JButton();
        btnEmpleado = new javax.swing.JButton();
        btnDeptos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBackground(new java.awt.Color(0, 153, 153));
        btnLogin.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("IR A LOGIN");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 80, 59));

        btnManejo.setBackground(new java.awt.Color(0, 153, 153));
        btnManejo.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnManejo.setForeground(new java.awt.Color(255, 255, 255));
        btnManejo.setText("USUARIOS");
        btnManejo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManejo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManejoActionPerformed(evt);
            }
        });
        getContentPane().add(btnManejo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 59));

        btnEmpleado.setBackground(new java.awt.Color(0, 153, 153));
        btnEmpleado.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleado.setText("EMPLEADOS");
        btnEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 43, 125, 53));

        btnDeptos.setBackground(new java.awt.Color(0, 153, 153));
        btnDeptos.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnDeptos.setForeground(new java.awt.Color(255, 255, 255));
        btnDeptos.setText("DEPARTAMENTOS");
        btnDeptos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeptos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeptosActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeptos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 59));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManejoActionPerformed
        mu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManejoActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnDeptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeptosActionPerformed
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDeptosActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeptos;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnManejo;
    // End of variables declaration//GEN-END:variables
}
