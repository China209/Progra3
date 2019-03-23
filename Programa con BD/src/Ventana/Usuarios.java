package Ventana;

import Clase.Conexion;
import Clase.Llenado_Planilla;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Usuarios extends javax.swing.JFrame {

    Conexion c = new Conexion();
    Connection cn = c.SQLConnection();

    public Usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnIngreso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUserName.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N

        jLabel1.setText("USUARIO");

        jLabel2.setText("CONTRASEÑA");

        btnIngreso.setText("Ingresar");
        btnIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngreso)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUserName)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnIngreso)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static Llenado_Planilla lp = new Llenado_Planilla();
    static Menu m = new Menu();

    public static void Corrida() {
        int iOpcion;//Variable de Opcion de Menú
        String[][] sPlanilla = new String[5][10];//Matriz donde se guardará la planilla
        do {//Ciclo que se genera si la opcion no sea igual a 0
            iOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Ingreso de Datos\n0.Salir", "MENÚ", JOptionPane.PLAIN_MESSAGE));
            menu(iOpcion, sPlanilla);
        } while (iOpcion != 0);
        System.exit(0);//Termina en programa
    }

    private static void menu(int iOpcion, String[][] sPlanilla) {
        switch (iOpcion) {
            case 1:
                lp.Llenado(sPlanilla);//Llama el procedimiento de la clase Llenado Planilla
                System.out.print("CÓDIGO\t\t" + "NOMBRE\t\t" + "SUELDO BASE\t" + "BONO\t\t" + "COMISION\t" + "IGSS\t" + "DESCUENTO "
                        + "JUDICIAL\t" + "ISR\t" + "SUELDO LIQUIDO\t\t" + "DEPTO." + "\n");

                for (int i = 0; i < sPlanilla.length; i++) {//Imprime la matriz de la planilla
                    for (int j = 0; j < sPlanilla[i].length; j++) {
                        System.out.print(sPlanilla[i][j] + "\t" + "\t");
                    }
                    System.out.print("\t" + "\n");
                }
                System.out.println();
                System.out.println();
                break;
            case 0:
                System.out.println();
                System.out.println("----------SALIENDO DEL PROGRAMA----------");
                break;
        }
    }
    private int iResult = 0;
    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        try {
            String sTipo="";
            String sUsuario = txtUserName.getText().trim();
            String sContra = txtPassword.getText().trim();
            String sSQL = "SELECT * FROM usuario WHERE nomusuario='" + sUsuario + "'"
                    + "and claveusuario='" + sContra + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
               sTipo =rs.getString("tipousuario");
                System.out.println(sTipo);
            }
            if(sTipo.equalsIgnoreCase("Administrador")){
                JOptionPane.showMessageDialog(null, "Bienvenid@ "+sUsuario,"",JOptionPane.PLAIN_MESSAGE);
                Menu m=new Menu();
                m.setVisible(true);
                this.dispose();
            }
            if(sTipo.equalsIgnoreCase("Invitado")){
                JOptionPane.showMessageDialog(null, "Bienvenid@ ","",JOptionPane.PLAIN_MESSAGE);
                Corrida();
                this.setVisible(false);
            }
            if(!sTipo.equalsIgnoreCase("Administrador")&&!sTipo.equalsIgnoreCase("Invitado")){
                JOptionPane.showMessageDialog(null, "No existe Usuario ","",JOptionPane.PLAIN_MESSAGE);
            }

        } catch (Exception e) {
           System.out.println("Error: " +e+" "+ e.getMessage());
        }
    }//GEN-LAST:event_btnIngresoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
