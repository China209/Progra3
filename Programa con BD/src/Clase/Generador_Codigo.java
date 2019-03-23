
package Clase;

public class Generador_Codigo {
    private int sDato;
    private final int iCont=1;
    private String sNum="";
    public void Generar(int iDato){
        this.sDato=iDato;
        if((this.sDato>=1000)||(this.sDato<1000)){
            int iCant=iCont+this.sDato;
            sNum=""+iCant;
        }
        if((this.sDato>=100)||(this.sDato<100)){
            int iCant=iCont+this.sDato;
            sNum="0"+iCant;
        }
        if((this.sDato>=9)||(this.sDato<100)){
            int iCant=iCont+this.sDato;
            sNum="00"+iCant;
        }
        if(this.sDato<9){
            int iCant=iCont+this.sDato;
            sNum="000"+iCant;
        }
    }
    public String Serie(){
        return this.sNum;
    }
            
    
}
