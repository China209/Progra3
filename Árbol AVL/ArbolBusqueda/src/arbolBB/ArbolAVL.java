package arbolBB;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ArbolAVL {

    private NodoArbolAVL raiz;
    private int alt;
    public ArbolAVL() {
        raiz = null;
    }
    //Obtiene el nodo raiz
    public NodoArbolAVL obtenerRaiz(){
        return raiz;
    }
    //Obtiene el nodo raiz y lo devuelve
    public NodoArbolAVL getRaiz() {
        return raiz;
    }
    //Establece el nodo raiz
    public void setRaiz(NodoArbolAVL raiz) {
        this.raiz = raiz;
    }
    //Busqueda de nodo r con el dato d
    public NodoArbolAVL Buscar(int d, NodoArbolAVL r) {
        if (raiz == null) {
            return null;//Si raiz es nula, significa que no existe ningun elenemto en el árbol por lo que retorna nulo
        } else if (r.dato == d) {
            return r;//Si el dato d es igual al dato del nodo r entonces se ha encontrado el nodo y retorna
        } else if (r.dato < d) {//Si el dato del nodo es menor al dato buscado entonces el dato buscado es mayor, y buscaremos por la derecha
            return Buscar(d, r.hijoDerecho);
        } else {//De lo contrario el dato es menor al del nodo y lo buscamos por la izquierda
            return Buscar(d, r.hijoIzquierdo);
        }
    }
    //Obtener el Factor de Equilibrio
    public int obtenerFE(NodoArbolAVL nodo) {
        if (nodo == null) {
            return -1;//Retornamos -1 si el nodo es hoja, es decir es nulo en sus aristas
        } else {
            return nodo.fe;//Si no retornamos el Factor de Equilibrio del nodo
        }
    }
    //Rotación Simple Izquierda
    public NodoArbolAVL rotacionIzquierda(NodoArbolAVL nodo) {
        //Reasignación de valores
        //El auxiliar será igual al nodo que este a su izquierda
        NodoArbolAVL auxiliar = nodo.hijoIzquierdo;
        //Entonces el izquierdo del nodo tomara el lugar del derecho del auxiliar
        nodo.hijoIzquierdo = auxiliar.hijoDerecho;
        //El derecho del auxiliar será igual al nodo
        auxiliar.hijoDerecho = nodo;
        //Se establece el FE del nodo
        nodo.fe = Math.max(obtenerFE(nodo.hijoIzquierdo), obtenerFE(nodo.hijoDerecho)) + 1;
        //Se establece el FE del nodo auxiliar
        auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho)) + 1;
        return auxiliar;
    }

    //Rotación Simple Derecha
    public NodoArbolAVL rotacionDerecha(NodoArbolAVL nodo) {
        //Reasignamos valores, similar al procedimiento anterior solo que este se realiza desde la derecha
        NodoArbolAVL auxiliar = nodo.hijoDerecho;
        nodo.hijoDerecho = auxiliar.hijoIzquierdo;
        auxiliar.hijoIzquierdo = nodo;
        //Establecemos el valor del FE para nodo y auxiliar
        nodo.fe = Math.max(obtenerFE(nodo.hijoIzquierdo), obtenerFE(nodo.hijoDerecho)) + 1;
        auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho)) + 1;
        return auxiliar;
    }
    //Rotación Doble a la Izquierda
    public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL nodo) {
        NodoArbolAVL temporal;
        nodo.hijoIzquierdo = rotacionDerecha(nodo.hijoIzquierdo);
        temporal = rotacionIzquierda(nodo);
        return temporal;
    }

    //Rotación Doble a la Derecha
    public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL nodo) {
        NodoArbolAVL temporal;
        nodo.hijoDerecho = rotacionIzquierda(nodo.hijoDerecho);
        temporal = rotacionDerecha(nodo);
        return temporal;
    }

    public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL sub) {
        NodoArbolAVL nuevoPadre = sub;//Este será el nuevo nodo raiz del arbol
        if (nuevo.dato < sub.dato) {//Si el nuevo dato ingresado es menor al dato del subarbol
            if (sub.hijoIzquierdo == null) {//Lo insertamos en la izquierda pero si el nodo apunta nulo
                sub.hijoIzquierdo = nuevo;//Reasignamos el valor al nuevo nodo ingresado
            } else {
                //Utilizamos la recursividad para insertar el valor
                sub.hijoIzquierdo = insertarAVL(nuevo, sub.hijoIzquierdo);
                //Verificamos que el FE sea igual a 2
                if (((obtenerFE((sub.hijoIzquierdo))) - (obtenerFE(sub.hijoDerecho))) == 2) {
                    if (nuevo.dato < sub.hijoIzquierdo.dato) {
                        nuevoPadre = rotacionIzquierda(sub);
                    } else {
                        nuevoPadre = rotacionDobleIzquierda(sub);
                    }
                }
            }
        }else if(nuevo.dato>sub.dato){//Si el dato es mayor se inserta por la derecha
            if(sub.hijoDerecho==null){//Si apunta a nulo el derecho
                sub.hijoDerecho=nuevo;//Le asignamos el nuevo nodo
            }else{
                sub.hijoDerecho=insertarAVL(nuevo,sub.hijoDerecho);
                if (((obtenerFE((sub.hijoDerecho))) - (obtenerFE(sub.hijoIzquierdo))) == 2) {
                    if (nuevo.dato > sub.hijoDerecho.dato) {
                        nuevoPadre = rotacionDerecha(sub);
                    } else {
                        nuevoPadre = rotacionDobleDerecha(sub);
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "NODO DUPLICADO", "", JOptionPane.PLAIN_MESSAGE);
        }
        //Actualizando FE
        if((sub.hijoIzquierdo==null)&&(sub.hijoDerecho!=null)){
            sub.fe=sub.hijoDerecho.fe+1;
        }else if((sub.hijoDerecho==null)&&(sub.hijoIzquierdo!=null)){
            sub.fe=sub.hijoIzquierdo.fe+1;
        }else{
            sub.fe=Math.max(obtenerFE(sub.hijoIzquierdo), obtenerFE(sub.hijoDerecho))+1;
        }
        return nuevoPadre;
    }
    //Método para insertar
    public void Insertar(int d){
        NodoArbolAVL nuevo=new NodoArbolAVL(d);
        if(raiz==null){
            raiz=nuevo;
        }else{
            raiz=insertarAVL(nuevo,raiz);
        }
    }
    //Recorridos
     //Recorrido preorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList preOrden() {
        LinkedList rec = new LinkedList();
        preorden(raiz, rec);
        return rec;
    }
    
    public void preorden(NodoArbolAVL aux, LinkedList recorrido) {
        if (aux != null) {
            recorrido.add(aux.getDato());
            preorden(aux.getHijoIzquierdo(), recorrido);
            preorden(aux.getHijoDerecho(), recorrido);
        }
    }

    //Recorrido inorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList inOrden() {
        LinkedList rec = new LinkedList();
        inorden(raiz, rec);
        return rec;
    }
    
    public void inorden(NodoArbolAVL aux, LinkedList recorrido) {
        if (aux != null) {
            inorden(aux.getHijoIzquierdo(), recorrido);
            recorrido.add(aux.getDato());
            inorden(aux.getHijoDerecho(), recorrido);
        }
    }

    //Recorrido postorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList postOrden() {
        LinkedList rec = new LinkedList();
        postorden(raiz, rec);
        return rec;
    }
    public void postorden(NodoArbolAVL aux, LinkedList recorrido) {
        if (aux != null) {
            postorden(aux.getHijoIzquierdo(), recorrido);
            postorden(aux.getHijoDerecho(), recorrido);
            recorrido.add(aux.getDato());
        }
    }
    public boolean agregar(int dato) {
        Insertar(dato);
        return true;
    }
    //Metodo para verificar si hay un nodo en el arbol
    public boolean existe(int dato) {
        NodoArbolAVL aux = raiz;
        while (aux != null) {
            if (dato == aux.getDato()) {
                return true;
            } else if (dato > aux.getDato()) {
                aux = aux.getHijoDerecho();
            } else {
                aux = aux.getHijoIzquierdo();
            }
        }
        return false;
    }
    //Se calcula la altura del arbol
    private void altura(NodoArbolAVL aux, int nivel) {
        if (aux != null) {
            altura(aux.getHijoIzquierdo(), nivel + 1);
            alt = nivel;
            altura(aux.getHijoDerecho(), nivel + 1);
        }
    }

    //Devuleve la altura del arbol
    public int getAltura() {
        altura(raiz, 1);
        return alt;
    }
    
     public JPanel getdibujo() {
        return new ArbolExpresionGrafico(this);
    }
}
