package lista_enlazadas;

public class FuncionesListas {

    Nodo Primero;
        int iTamaño;
	public FuncionesListas()
	{
		Primero=null;
                iTamaño=0;
	}
	public boolean vacia()
	{
		if (Primero==null)
		{
			return(true);
		} else
		{
			return(false);
		}
	}
	public void InsertarEnPrimero(int Dato)
	{
		Nodo Temporal=new Nodo(Dato); //Crea el nodo temporal
		Temporal.siguiente=Primero; //corre al primero
		Primero=Temporal;   //lo coloca de primero
                iTamaño++;
	}
	public void borrarPrimero()
	{
		Primero=Primero.siguiente;
	}
	public String Listar()
	{
		String Dato=" ";
		Nodo aux=Primero;
		while (aux!=null)
		{
			Dato+="-" + aux.iInfo;
			aux=aux.siguiente;
		}
		return(Dato);
	}
	public void borrarUltimo()
	{
		Nodo anterior=Primero;
		Nodo actual=Primero;
		while (actual.siguiente!=null)
		{
			anterior=actual;
			actual=actual.siguiente;
		}
		anterior.siguiente=null;
	}
	public void borrarPosicion(int pos)
	{
		Nodo anterior=Primero;
		Nodo actual=Primero;
		int k=0;
		if (pos>0)
		{
			while (k!=pos && actual.siguiente != null)
			{
				anterior=actual;
				actual=actual.siguiente;
				k++;
				System.out.println("K       "+k);
			}
			anterior.siguiente=actual.siguiente;
		}
	}
        public int TamañoLista(){
            return iTamaño;
        }
        public boolean Buscar(int iBuscar){
            Nodo aux=Primero;
            boolean bEncontrado=false;
            while(aux!=null&&bEncontrado!=true){
                if(iBuscar==aux.getValor()){
                    bEncontrado=true;
                }else{
                    aux=aux.getSiguiente();
                }
            }
            return bEncontrado;
        }

}
