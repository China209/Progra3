package Ventana;

import Clase.*;
import Clase.Generador_Codigo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class NominaDetallada extends javax.swing.JFrame {

    Conexion c = new Conexion();
    Connection cn = c.SQLConnection();

    private double dSueldo;
    private double dIGSS = 0.0483;
    private double dISR;
    private double dCalculoIGSS;
    private int iBono = 250;
    private double dComision;
    private double dDescJud;
    private double dSueldoExtraO;
    private double dSueldoLiquido;
    double dTotal;

    public NominaDetallada() {
        initComponents();
        ValorNominaDetalle();
        ElementosCodigo();
        ElementosEmpleado();
        ElementosConcepto();
        MostrarDatos("");
        this.setLocationRelativeTo(null);
    }

    void InhabilitarBotones() {
        btnModificar.setEnabled(false);
    }

    void LimpiarTexts() {
        cbmCod.setSelectedIndex(0);
        cbmCodEmp.setSelectedIndex(0);
        cbmCodConcepto.setSelectedIndex(0);
        txtValor.setText("");
    }

    void MostrarDatos(String sCadena) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Empleado");
        modelo.addColumn("Concepto");
        modelo.addColumn("Valor");
        tblNomDet.setModel(modelo);
        String[] sDatos = new String[4];
        String sSQL = "";
        if (sCadena.equals("")) {
            sSQL = "SELECT * FROM nomina_detalle";
        } else {
            sSQL = "SELECT * FROM nomina_detalle WHERE codnomina='" + sCadena + "'";
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
            tblNomDet.setModel(modelo);
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
        cbmCod = new javax.swing.JComboBox<>();
        cbmCodEmp = new javax.swing.JComboBox<>();
        cbmCodConcepto = new javax.swing.JComboBox<>();
        txtValor = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNomDet = new javax.swing.JTable();
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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Nomina Detallada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Empleado");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Concepto");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Valor");

        cbmCod.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        cbmCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmCodActionPerformed(evt);
            }
        });

        cbmCodEmp.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        cbmCodEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmCodEmpActionPerformed(evt);
            }
        });

        cbmCodConcepto.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        cbmCodConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmCodConceptoActionPerformed(evt);
            }
        });

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
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbmCod, 0, 141, Short.MAX_VALUE)
                            .addComponent(cbmCodEmp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbmCodConcepto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValor)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cbmCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbmCodEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbmCodConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        tblNomDet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblNomDet.setComponentPopupMenu(jPmModEliminar);
        jScrollPane1.setViewportView(tblNomDet);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 389, 284));

        txtBuscar.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 119, -1));

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
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 50, 30));

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
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 120, 40));

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
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void ElementosCodigo() {
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM nomina_encabezada");
            cbmCod.addItem("----Seleccione Código----");
            while (rs.next()) {
                this.cbmCod.addItem(rs.getString("codnomina"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    void ElementosEmpleado() {
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleado");
            cbmCodEmp.addItem("----Seleccione Empleado----");
            while (rs.next()) {
                this.cbmCodEmp.addItem(rs.getString("empcodigo"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    void ElementosConcepto() {
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM concepto");
            cbmCodConcepto.addItem("----Seleccione Concepto----");
            while (rs.next()) {
                this.cbmCodConcepto.addItem(rs.getString("codConcepto"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    private String sCodConcepto;
    private double dAcum;

    public void ValorNominaDetalle() {
        try {
            String sEfecto = "+";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM nomina_detalle nd,concepto c WHERE c.efecto_concepto='" + sEfecto + "' AND nd.codConcepto=c.codConcepto");
            while (rs.next()) {
                sEfecto = rs.getString("efecto_concepto");
                String sCod1 = rs.getString("nd.codConcepto");
                String sCod2 = rs.getString("c.codConcepto");
                if (sCod1.equals(sCod2)) {
                    if (sCod1.equals("CO0008")) {
                        dAcum = 0;
                    } else {
                        if (sEfecto.equals("+")) {
                            dAcum = rs.getDouble("valor_nominadetalle");
                            dTotal += dAcum;
                        }
                    }
                }

            }
            try{
                PreparedStatement pst=cn.prepareStatement("UPDATE nomina_encabezada SET valornomina='"+Double.toString(dTotal)+"'");
                pst.executeUpdate();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void Calculo() {
        if ((cbmCodConcepto.getSelectedIndex() != 0) || (cbmCodEmp.getSelectedIndex() != 0)) {
            try {
                dComision = (Math.random() * (2000 - 500) + 500);
                dDescJud = (Math.random() * (500 - 250) + 250);
                dSueldoExtraO = (Math.random() * (300 - 50) + 50);
                String sCodC = cbmCodConcepto.getSelectedItem().toString().trim();
                String sCodE = cbmCodEmp.getSelectedItem().toString().trim();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM empleado e,concepto c WHERE e.empcodigo='" + sCodE + "' AND c.codConcepto='" + sCodC + "'");
                while (rs.next()) {
                    dSueldo = rs.getDouble("empsueldo");
                    sCodConcepto = rs.getString("codConcepto");
                    System.out.println(dSueldo + " " + sCodConcepto);
                }
                if (sCodConcepto.equals("CO0001")) {
                    txtValor.setText(Double.toString(dSueldo));
                }
                if (sCodConcepto.equals("CO0002")) {
                    txtValor.setText(Double.toString(dSueldoExtraO));
                }
                if (sCodConcepto.equals("CO0003")) {
                    if (dSueldo > 30000) {
                        dISR = (dSueldo * 0.07) / 12;
                    } else {
                        dISR = (dSueldo * 0.05) / 12;
                    }
                    txtValor.setText(Double.toString(dISR));
                }
                if (sCodConcepto.equals("CO0004")) {
                    dCalculoIGSS = dSueldo * dIGSS;
                    txtValor.setText(Double.toString(dCalculoIGSS));
                }
                if (sCodConcepto.equals("CO0005")) {
                    txtValor.setText(Double.toString(dDescJud));
                }
                if (sCodConcepto.equals("CO0006")) {
                    txtValor.setText(Integer.toString(iBono));
                }
                if (sCodConcepto.equals("CO0007")) {
                    txtValor.setText(Double.toString(dComision));
                }
                if (sCodConcepto.equals("CO0008")) {
                    dSueldoLiquido=dSueldo+dSueldoExtraO-dISR-dCalculoIGSS-dDescJud+iBono+dComision;
                    txtValor.setText(Double.toString(dSueldoLiquido));
                }
                
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    /*public String Validacion() {
        String sComparar = "";
        try {
            String sConcepto = cbmCodConcepto.getSelectedItem().toString().trim();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM concepto WHERE codConcepto='" + sConcepto + "'");
            dComision = (Math.random() * (2000 - 500) + 500);
            dDescJud = (Math.random() * (500 - 250) + 250);
            dSueldoExtraO = (Math.random() * (300 - 50) + 50);
            while (rs.next()) {
                sComparar = rs.getString("codConcepto");
            }
            if (sComparar.equals("CO0006")) {
                txtValor.setText(Integer.toString(iBono));
            }
            if (sComparar.equals("CO0007")) {

                txtValor.setText(Double.toString(dComision));
            }
            if (sComparar.equals("CO0005")) {
                txtValor.setText(Double.toString(dDescJud));
            }
            if (sComparar.equals("CO0002")) {
                txtValor.setText(Double.toString(dSueldoExtraO));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sComparar;
    }

    public void Validar() {
        try {
            
            String sCodE = cbmCodEmp.getSelectedItem().toString().trim();
            Statement st1 = cn.createStatement();
            ResultSet rs1 = st1.executeQuery("SELECT * FROM empleado WHERE empcodigo='" + sCodE + "'");
            String sComparar = Validacion();
            String sSueldo = "";
            int iSueldo = 0;
            while (rs1.next()) {
                sSueldo = rs1.getString("empsueldo");
                System.out.println(sSueldo);
                iSueldo = Integer.parseInt(sSueldo);
            }
            if (sComparar.equals("CO0001")) {
                txtValor.setText(sSueldo);
            }
            if (iSueldo > 30000) {
                dISR = (iSueldo * 0.07) / 12;
            } else {
                dISR = (iSueldo * 0.05) / 12;
            }
            dCalculoIGSS = iSueldo * dIGSS;

            if (sComparar.equals("CO0003")) {
                txtValor.setText(Double.toString(dISR));
            }
            if (sComparar.equals("CO0004")) {
                txtValor.setText(Double.toString(dCalculoIGSS));
            }
           

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    /* dSueldoLiquido = iSueldo + iBono + dComision + dSueldoExtraO - dDescJud - dCalculoIGSS - dISR;
            if (sComparar.equals("CO0008")) {
                txtValor.setText(Double.toString(dSueldoLiquido));
            }
     */
 /*  private double dCalculoSueldoLiquido;
    void CalculoLiquido(){
        try {
            String sCodEmp;
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM nomina_detalle");
            while (rs.next()) {
                dCalculoSueldoLiquido=rs.getDouble("valor_nominadetalle");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NominaDetallada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (evt.getSource().equals(btnGuardar)) {
            try {
                if (cbmCod.getSelectedIndex() == 0 || cbmCodEmp.getSelectedIndex() == 0 || cbmCodConcepto.getSelectedIndex() == 0 || txtValor.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "No están llenos los campos", "ADVERTENCIA", JOptionPane.PLAIN_MESSAGE);
                } else {
                    PreparedStatement pst = cn.prepareStatement("INSERT into nomina_detalle VALUES(?,?,?,?)");
                    pst.setString(1, cbmCod.getSelectedItem().toString().trim());
                    pst.setString(2, cbmCodEmp.getSelectedItem().toString().trim());
                    pst.setString(3, cbmCodConcepto.getSelectedItem().toString().trim());
                    pst.setString(4, txtValor.getText().trim());
                    pst.executeUpdate();
                    MostrarDatos("");
                    LimpiarTexts();
                    JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO", " ", JOptionPane.PLAIN_MESSAGE);
                    InhabilitarBotones();
                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fallo: " + e, "ERROR", JOptionPane.PLAIN_MESSAGE);
                System.out.println(e.getMessage());
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
                String sSQL = "UPDATE nomina_detalle SET empcodigo='" + cbmCodEmp.getSelectedItem().toString().trim() + "',codConcepto='" + cbmCodConcepto.getSelectedItem().toString().trim() + "',valor_nominadetalle='" + txtValor.getText().trim() + "' WHERE codnomina='" + cbmCod.getSelectedItem().toString().trim() + "'";
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

    private void cbmCodConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmCodConceptoActionPerformed
        //    Validacion();
        //  Validar();
        Calculo();
    }//GEN-LAST:event_cbmCodConceptoActionPerformed

    private void cbmCodEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmCodEmpActionPerformed

    }//GEN-LAST:event_cbmCodEmpActionPerformed

    private void jMiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiModificarActionPerformed
        int fila = tblNomDet.getSelectedRow();
        if (fila >= 0) {
            cbmCod.setSelectedItem(tblNomDet.getValueAt(fila, 0).toString().trim());
            cbmCodEmp.setSelectedItem(tblNomDet.getValueAt(fila, 1).toString().trim());
            cbmCodConcepto.setSelectedItem(tblNomDet.getValueAt(fila, 2).toString().trim());
            txtValor.setText(tblNomDet.getValueAt(fila, 3).toString().trim());
            btnModificar.setEnabled(true);
            btnGuardar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "No selecciono fila", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMiModificarActionPerformed

    private void jMiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiEliminarActionPerformed
        int fila = tblNomDet.getSelectedRow();
        String sCod = "";
        sCod = tblNomDet.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM nomina_detalle WHERE codnomina='" + sCod + "'");
            pst.executeUpdate();
            MostrarDatos("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jMiEliminarActionPerformed

    private void cbmCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmCodActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> cbmCod;
    private javax.swing.JComboBox<String> cbmCodConcepto;
    private javax.swing.JComboBox<String> cbmCodEmp;
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
    private javax.swing.JTable tblNomDet;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
