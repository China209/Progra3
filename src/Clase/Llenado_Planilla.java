package Clase;

import javax.swing.JOptionPane;

public class Llenado_Planilla {

    public void Llenado_Auto(String[][] sPlanilla, int iFila, int iColumna, int[] iDeptos) {

        for (int i = 0; i < iFila; i++) {
            for (int j = 0; j < iColumna; j++) {
                if (j == 0) {
                    sPlanilla[i][j] = Integer.toString((i + 1));
                }
                if (j == 1) {
                    sPlanilla[i][j] = JOptionPane.showInputDialog(null, "Empleado #" + (i + 1), "Ingreso de Nombre Empleados", JOptionPane.PLAIN_MESSAGE);
                }
                if (j == 2) {
                    sPlanilla[i][j] = Double.toString(Math.round((Math.random() * (20000 - 3000) + 3000)));
                }
                if (j == 3) {
                    sPlanilla[i][j] = Integer.toString(250);
                }
                if (j == 4) {
                    sPlanilla[i][j] = Double.toString(Math.round((Math.random() * (1500 - 500) + 500)));
                }
                if (j == 5) {
                    sPlanilla[i][j] = Double.toString(Math.round(Double.parseDouble(sPlanilla[i][2]) * 0.0483));
                }
                if (j == 6) {
                    sPlanilla[i][j] = Double.toString(Math.round((48000 - (Double.parseDouble(sPlanilla[i][5]) * 12)) / 12));
                }
                if (j == 7) {
                    if (Double.parseDouble(sPlanilla[i][2]) < 4000) {
                        sPlanilla[i][j] = Double.toString(0);
                    } else {
                        sPlanilla[i][j] = Double.toString(Math.round((Double.parseDouble(sPlanilla[i][2]) - Double.parseDouble(sPlanilla[i][6])) * 0.05));
                    }

                }
                if (j == 8) {
                    sPlanilla[i][j] = Double.toString(Math.round(Double.parseDouble(sPlanilla[i][2]) + Double.parseDouble(sPlanilla[i][3]) + Double.parseDouble(sPlanilla[i][4]) - Double.parseDouble(sPlanilla[i][5]) - Double.parseDouble(sPlanilla[i][6]) - Double.parseDouble(sPlanilla[i][7])));
                }
                if (j == 9) {
                    sPlanilla[i][j] = Integer.toString(1 + (int) (Math.random() * 5));
                    if (Integer.parseInt(sPlanilla[i][j]) == 1) {
                        iDeptos[0] += (Double.parseDouble(sPlanilla[i][8]));
                    }
                    if (Integer.parseInt(sPlanilla[i][j]) == 2) {
                        iDeptos[1] += (Double.parseDouble(sPlanilla[i][8]));
                    }
                    if (Integer.parseInt(sPlanilla[i][j]) == 3) {
                        iDeptos[2] += (Double.parseDouble(sPlanilla[i][8]));
                    }
                    if (Integer.parseInt(sPlanilla[i][j]) == 4) {
                        iDeptos[3] += (Double.parseDouble(sPlanilla[i][8]));
                    }
                    if (Integer.parseInt(sPlanilla[i][j]) == 5) {
                        iDeptos[4] += (Double.parseDouble(sPlanilla[i][8]));
                    }

                }
            }
        }
    }
}
