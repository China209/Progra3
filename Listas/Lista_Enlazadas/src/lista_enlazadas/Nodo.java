
package lista_enlazadas;


public class Nodo {
    int iInfo;
    public Nodo siguiente;
    public Nodo(int iDato){
        iInfo=iDato;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
     public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }
     public int getValor(){
         return iInfo;
     }
}
