/*
 * 0901-17-3472
 */
package control_planilla;

import Clase.Llenado_Planilla;
import javax.swing.JOptionPane;

public class Control_Planilla {

    static Llenado_Planilla lp = new Llenado_Planilla();

    public static void main(String[] args) {
        int iOpcion;//Variable de Opcion de Menú
        int iDeptos[] = new int[5];//Vector de Departamentos
        String[][] sPlanilla = new String[10][10];//Matriz donde se guardará la planilla
        do {//Ciclo que se genera si la opcion no sea igual a 0
            iOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Ingreso de Datos\n0.Salir", "MENÚ", JOptionPane.PLAIN_MESSAGE));
            menu(iOpcion, sPlanilla, iDeptos);
        } while (iOpcion != 0);
        System.exit(0);//Termina en programa
    }

    public static void menu(int iOpcion, String[][] sPlanilla, int[] iDeptos) {
        switch (iOpcion) {
            case 1:
                lp.Llenado_General(sPlanilla, iDeptos);//Llama el procedimiento de la clase Llenado Planilla
                System.out.print("CÓDIGO\t\t" + "NOMBRE\t\t" + "SUELDO BASE\t" + "BONO\t\t" + "COMISION\t" + "IGSS\t" + "DESCUENTO "
                        + "JUDICIAL\t" + "ISR\t" + "SUELDO LIQUIDO\t\t" + "DEPTO." + "\n");

                for (int i = 0; i < sPlanilla.length; i++) {//Imprime la matriz de la planilla
                    for (int j = 0; j < sPlanilla[i].length; j++) {
                        System.out.print(sPlanilla[i][j] + "\t" + "\t");
                    }
                    System.out.print("\t" + "\n");
                }
                System.out.print("TOTAL POR DEPARTAMENTOS\n");
                System.out.print("1\t\t"+"2\t\t"+"3\t\t"+"4\t\t"+"5\t\t\n");
                for (int j = 0; j < 5; j++) {//Imprime el vector de departamentos
                    System.out.print(iDeptos[j] + "\t" + "\t");
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

}
