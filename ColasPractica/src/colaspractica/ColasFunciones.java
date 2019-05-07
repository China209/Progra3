package colaspractica;

public class ColasFunciones {

    private Nodo cabeza = null;
    private int longitud = 0;
    //Crear el nodo de la cola
    private class Nodo {
        //Variable tipo libro
        public Libro libro;
        //Referencia apunta a siguiente
        public Nodo siguiente = null;

        public Nodo(Libro libro) {
            this.libro = libro;
        }
    }
    //Insertar en la parte final el nuevo nodo
    public void Encolar(Libro libro) {
        Nodo nodo = new Nodo(libro);
        if (cabeza == null) {
            cabeza = nodo;//Si cabeza es igual a nulo, entonces cabeza será igual al nodo nuevo insertado
        } else {//Si existe un dato o mas de uno
            Nodo puntero = cabeza;
            while (puntero.siguiente != null) {//Avanza en la lista de nodos
                puntero = puntero.siguiente;//Si el siguiente no apunta a nulo entonces este será el último nodo
            }
            puntero.siguiente = nodo;//Apuntamos el siguiente al nuevo nodo insertado
        }
        longitud++;//Aumenta la variable longitud para contabilizar el numero de nodos
    }

    public void Desncolar() {
        if (cabeza != null) {//Si cabeza no es igual a nulo, ya que si esta vacio no habrá nada que eliminar
            Nodo primer = cabeza;//Igualamos en nodo primer a cabeza
            cabeza = cabeza.siguiente;//Cabeza pasará a ser igual al nodo que le continuaba
            primer.siguiente = null;//El primero apunta a nulo, es decir, se elimina
            longitud--;//Reduce la variable longitud
        }
    }

    public int contar() {
        return longitud;//Retorna el valor de la variable longitud
    }

    public boolean estaVacia() {
        return cabeza == null;//retorna la verificación de false o true si la cola está vacía
    }
    public String MostrarDatos()
	{   //Muestra los datos, y los retorna en una cadena
		String Dato=" ";
		Nodo aux=cabeza;
		while (aux!=null)
		{
			Dato+="\nAutor: " + aux.libro.getAutor() + "\nTítulo: "+aux.libro.getTitulo()+"\nISBN: "+aux.libro.getIsbn()+"\n";
			aux=aux.siguiente;
		}
		return(Dato);
	}
}
