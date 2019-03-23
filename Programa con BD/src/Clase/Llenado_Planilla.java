package Clase;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Llenado_Planilla {

    Conexion c = new Conexion();
    Connection cn = c.SQLConnection();
    private int iBono = 250;
    private int iComision;
    private double dIGSS = 0.0483;
    private double dCalculoIGSS;
    private int dISR;
    private int iDescJud;

    public void Llenado(String sPlanilla[][]) {
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM empleado");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < sPlanilla.length; i++) {
                    for (int j = 0; j < sPlanilla[i].length; j++) {
                        iComision = (int) (Math.random() * (1500 - 500) + 500);
                        iDescJud = (int) (Math.random() * (500 - 200) + 200);
                        sPlanilla[i][0] = rs.getString("empcodigo");
                        sPlanilla[i][1] = rs.getString("empnombre");
                        sPlanilla[i][2] = rs.getString("empsueldo");
                        sPlanilla[i][3] = Integer.toString(iBono);
                        sPlanilla[i][4] = Integer.toString(iComision);
                        dCalculoIGSS = Math.round(Double.parseDouble(sPlanilla[i][2]) * dIGSS);
                        sPlanilla[i][5] = Double.toString(dCalculoIGSS);
                        sPlanilla[i][6] = Integer.toString(iDescJud);
                        if(Integer.parseInt(sPlanilla[i][2])>30000){
                             dISR=(int) ((Integer.parseInt(sPlanilla[i][2])*0.07)/12);
                            sPlanilla[i][7] = Integer.toString(dISR);
                        }else{
                            dISR=(int) ((Integer.parseInt(sPlanilla[i][2])*0.05)/12);
                            sPlanilla[i][7] = Integer.toString(dISR);
                        }
                        sPlanilla[i][8] = Double.toString(Math.round(Double.parseDouble(sPlanilla[i][2])+iBono+iComision-dCalculoIGSS-iDescJud-dISR));
                        sPlanilla[i][9] = rs.getString("depcodigo");

                    }
                    rs.next();
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
