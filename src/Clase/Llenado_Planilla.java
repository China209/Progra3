package Clase;

import javax.swing.JOptionPane;

public class Llenado_Planilla {

    //Variables Globales
    private int iBonoIncentivo = 250;
    private int iComision;
    private double dIGSS = 0.0483;
    private double dCalculo_IGSS;
    private double dIGSS_Anual;
    private int iOpIsr;

    private void Calculo_Percepciones(String[][] sPlanilla) {
        for (int i = 0; i < sPlanilla.length; i++) {
            for (int j = 0; j < sPlanilla[i].length; j++) {
                iComision = (int) (Math.random() * (1500 - 500) + 500);//Se genera aleatoriamente las comisiones y se guardan en la variable
                if (j == 2) {//Se genera aleatoriamente el sueldo base de un rango de 2500 a 25000
                    sPlanilla[i][j] = Double.toString(Math.round(Math.random() * (25000 - 2500) + 2500));
                }
                if (j == 3) {//Se guarda el valor de ley del bono incentivo
                    sPlanilla[i][j] = Integer.toString(iBonoIncentivo);
                }
                if (j == 4) {//Se guarda el valor de la variable iComision
                    sPlanilla[i][j] = Integer.toString(iComision);
                }

            }
        }
    }

    private void Calculo_Deducciones(String[][] sPlanilla) {
        for (int i = 0; i < sPlanilla.length; i++) {
            for (int j = 0; j < sPlanilla[i].length; j++) {
                if (j == 5) {//Cálculo del IGSS
                    dCalculo_IGSS = Double.parseDouble(sPlanilla[i][2]) * dIGSS;
                    sPlanilla[i][j] = Double.toString(Math.round(dCalculo_IGSS));

                }
                if (j == 6) {//Cálculo del Descuento Judicial
                    if (Double.parseDouble(sPlanilla[i][2]) < 4000) {
                        sPlanilla[i][j] = Double.toString(0);
                    } else {
                        dIGSS_Anual = Double.parseDouble(sPlanilla[i][5]) * 12;
                        sPlanilla[i][j] = Double.toString((Math.round(48000 - dIGSS_Anual) / 12));
                    }
                }
                
            }
        }
    }

    public void Llenado_General(String[][] sPlanilla, int[] iDeptos) {
        Calculo_Percepciones(sPlanilla);
        Calculo_Deducciones(sPlanilla);
        for (int i = 0; i < sPlanilla.length; i++) {
            for (int j = 0; j < sPlanilla[i].length; j++) {
                if (j == 0) {//Genera códigos 1-10
                    sPlanilla[i][j] = Integer.toString((i + 1));
                }
                if (j == 1) {//Ingreso de Nombre de Empleados
                    sPlanilla[i][j] = JOptionPane.showInputDialog(null, "Empleado # " + (i + 1), "INGRESO NOMBRE DE EMPLEADOS", JOptionPane.PLAIN_MESSAGE);
                    iOpIsr = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea que a " + sPlanilla[i][j] + " se le calcule IGGS\n1. SI\n0. NO","Cálculo de ISR",JOptionPane.PLAIN_MESSAGE));
                }
                if (j == 7) {//Cálculo de ISR

                    if (iOpIsr == 1) {//Si la opcion de ISR es igual a 1 desarrolla el cálculo
                        if (Double.parseDouble(sPlanilla[i][2]) < 4000) {//Si es menor de 4000 el sueldo base ISR es igual a 0
                            sPlanilla[i][j] = Double.toString(0);
                        } else {
                            sPlanilla[i][j] = Double.toString(Math.round((Double.parseDouble(sPlanilla[i][2]) - Double.parseDouble(sPlanilla[i][6])) * 0.05));
                        }
                    } else {//Si la opción es diferente de 1
                        sPlanilla[i][j] = Double.toString(0);
                    }

                }
                if (j == 8) {//Cálculo de sueldo líquido
                    sPlanilla[i][j] = Double.toString(Math.round(Double.parseDouble(sPlanilla[i][2]) + Integer.parseInt(sPlanilla[i][3]) + Integer.parseInt(sPlanilla[i][4]) - Double.parseDouble(sPlanilla[i][5]) - Double.parseDouble(sPlanilla[i][6]) - Double.parseDouble(sPlanilla[i][7])));
                }
                if (j == 9) {//Se genera aletoriamente de 1-5 los departamentos
                    sPlanilla[i][j] = Integer.toString(1 + (int) (Math.random() * 5));
                    //Se guarda en el vector la suma de los sueldos líquidos correspondientes de cada departamento
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
