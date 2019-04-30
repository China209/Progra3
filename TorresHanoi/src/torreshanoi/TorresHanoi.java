
package torreshanoi;

import java.util.Scanner;

public class TorresHanoi {

   static int iCont=0;
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int iNum;
        //Pedir el número de discos
        System.out.println("¿Cuántos discos desea?");
        iNum=entrada.nextInt();
        TorresJuego(iNum,1,2,3);
        int iNumMovimientos=(int)(Math.pow(2, iNum-1));//Cálculo de movimientos mínimos
        System.out.println("Los movimientos mínimos son: "+iNumMovimientos);
        System.out.println("Movimientos Totales: "+iCont);
    }
    public static void TorresJuego(int iDiscos,int iInicio,int iAuxiliar,int iFinal){
       
        if(iDiscos==1){
            //Si la cantidad de discos es igual a 1, el disco se destina directamente a  la torre final
            System.out.println("Moviendo disco de la Torres "+iInicio+" a la Torre "+iFinal);
            iCont++;
        }else{
            //Cuando exista mas de un disco
            TorresJuego(iDiscos-1,iInicio,iFinal,iAuxiliar);
            System.out.println("Moviendo disco de la Torres "+iInicio+" a la Torre "+iFinal);
            TorresJuego(iDiscos-1,iAuxiliar,iInicio,iFinal);
            iCont++;
        }
    }
}
