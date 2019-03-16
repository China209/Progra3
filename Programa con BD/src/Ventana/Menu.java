package Ventana;

public class Menu extends javax.swing.JFrame {
    
    ManejoUsuario mu = new ManejoUsuario();
    Usuarios u = new Usuarios();
    Empleados e = new Empleados();
    Departamento d = new Departamento();
    Puesto p = new Puesto();
    Concepto c = new Concepto();
    Banco b=new Banco();

    public Menu() {
        initComponents();
        Desenfocar();
        this.setSize(575, 340);
        this.setLocationRelativeTo(null);
    }

    void Desenfocar() {
        btnManejo.setFocusable(false);
        btnLogin.setFocusable(false);
        btnEmpleado.setFocusable(false);
        btnDeptos.setFocusable(false);
        btnPuesto.setFocusable(false);
        btnConcepto.setFocusable(false);
        btnNomEncabezada.setFocusable(false);
        btnNomDetalle.setFocusable(false);
        btnBancos.setFocusable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        btnManejo = new javax.swing.JButton();
        btnEmpleado = new javax.swing.JButton();
        btnDeptos = new javax.swing.JButton();
        btnPuesto = new javax.swing.JButton();
        btnConcepto = new javax.swing.JButton();
        btnNomEncabezada = new javax.swing.JButton();
        btnBancos = new javax.swing.JButton();
        btnNomDetalle = new javax.swing.JButton();

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
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 80, 59));

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
        getContentPane().add(btnManejo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 59));

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
        getContentPane().add(btnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 130, 60));

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
        getContentPane().add(btnDeptos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 130, 59));

        btnPuesto.setBackground(new java.awt.Color(0, 153, 153));
        btnPuesto.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnPuesto.setForeground(new java.awt.Color(255, 255, 255));
        btnPuesto.setText("PUESTO");
        btnPuesto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuestoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 59));

        btnConcepto.setBackground(new java.awt.Color(0, 153, 153));
        btnConcepto.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnConcepto.setForeground(new java.awt.Color(255, 255, 255));
        btnConcepto.setText("CONCEPTO");
        btnConcepto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConcepto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConceptoActionPerformed(evt);
            }
        });
        getContentPane().add(btnConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 130, 60));

        btnNomEncabezada.setBackground(new java.awt.Color(0, 153, 153));
        btnNomEncabezada.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnNomEncabezada.setForeground(new java.awt.Color(255, 255, 255));
        btnNomEncabezada.setText("NOMINA ENCABEZADA");
        btnNomEncabezada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNomEncabezada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNomEncabezada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomEncabezadaActionPerformed(evt);
            }
        });
        getContentPane().add(btnNomEncabezada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 60));

        btnBancos.setBackground(new java.awt.Color(0, 153, 153));
        btnBancos.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnBancos.setForeground(new java.awt.Color(255, 255, 255));
        btnBancos.setText("BANCOS");
        btnBancos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBancos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBancosActionPerformed(evt);
            }
        });
        getContentPane().add(btnBancos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 130, 60));

        btnNomDetalle.setBackground(new java.awt.Color(0, 153, 153));
        btnNomDetalle.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnNomDetalle.setForeground(new java.awt.Color(255, 255, 255));
        btnNomDetalle.setText("NOMINA DETALLE");
        btnNomDetalle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNomDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNomDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomDetalleActionPerformed(evt);
            }
        });
        getContentPane().add(btnNomDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 130, 60));

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

    private void btnPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuestoActionPerformed
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPuestoActionPerformed

    private void btnConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConceptoActionPerformed
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnConceptoActionPerformed

    private void btnNomEncabezadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomEncabezadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNomEncabezadaActionPerformed

    private void btnBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBancosActionPerformed
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBancosActionPerformed

    private void btnNomDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomDetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNomDetalleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBancos;
    private javax.swing.JButton btnConcepto;
    private javax.swing.JButton btnDeptos;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnManejo;
    private javax.swing.JButton btnNomDetalle;
    private javax.swing.JButton btnNomEncabezada;
    private javax.swing.JButton btnPuesto;
    // End of variables declaration//GEN-END:variables
}
