package Pilas;

public class Pila {

    private Nodo cabeza = null;
    private int longitud = 0;

    private class Nodo {

        //Creación del nodo
        public Libro libro;
        public Nodo siguiente = null;

        public Nodo(Libro libro) {
            this.libro = libro;
        }
    }

    //Inserción del elemento
    public void Push(Libro libro) {
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    //Elimina la Pila
    public void VaciarPila() {
        if (cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente = null;
            primer.siguiente = null;
            cabeza = cabeza;
            longitud--;
        }
    }

    //Elimina el elemento del inicio, desapila
    public void Pop() {
        if (cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
            longitud--;
        }
    }

    //Retorna el valor de la longitud de la pila
    public int Tamaño() {
        return longitud;
    }

    //Verifica si la pila está vacía o no
    public boolean Vacio() {
        return longitud == 0;
    }

    public Libro Obtener() {
        if (cabeza == null) {
            return null;
        } else {
            return cabeza.libro;
        }
    }

    //Muestra el contenido de los datos ingresados
    public String MostrarDatos() throws PilaVaciaException {
        String Dato = " ";
        Nodo aux = cabeza;
        if (aux == null) {
            throw new PilaVaciaException("No hay datos para mostrar la pila está vacía\n");
        } else {

            while (aux != null) {
                Dato += "\nAutor: " + aux.libro.getAutor() + "\nTítulo: " + aux.libro.getTitulo() + "\nISBN: " + aux.libro.getIsbn() + "\n";
                aux = aux.siguiente;
            }
        }
        return (Dato);
    }
    //Devuelve el valor de que se encuentra en la cima de la Pila
    public Libro Top()throws Exception{
        if(cabeza==null){
            throw new Exception("La pila se encuentra vacía");
        }else{
            return cabeza.libro;
        }
    }
    //Obtiene el libro ´por posición
    public Libro obtenerLibro(int n) {
        if (cabeza == null) {
            return null;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            if (contador != n) {
                return null;
            } else {
                return puntero.libro;
            }
        }
    }
}
