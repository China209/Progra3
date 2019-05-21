
package arbolBB;


public class NodoArbolAVL {
    int dato,fe;
    NodoArbolAVL hijoIzquierdo,hijoDerecho;
    public NodoArbolAVL(int d){
        this.dato=d;
        this.fe=0;
        this.hijoIzquierdo=null;
        this.hijoDerecho=null;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public void setHijoIzquierdo(NodoArbolAVL hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public void setHijoDerecho(NodoArbolAVL hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public int getDato() {
        return dato;
    }

    public int getFe() {
        return fe;
    }

    public NodoArbolAVL getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public NodoArbolAVL getHijoDerecho() {
        return hijoDerecho;
    }
    
}
