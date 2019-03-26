package lista_enlazadas;

import java.util.Scanner;

public class Lista_Enlazadas {

    public static void main(String[] args) {
        FuncionesListas Lista = new FuncionesListas();
        Scanner entrada = new Scanner(System.in);
        int iOp;
        int iDato;

        do {
            System.out.println("1.Ingresar Lista\n2.Eliminar Datos\n3.Buscar Datos\n4.Tamaño Lista\n");
            iOp = entrada.nextInt();
            switch (iOp) {
                case 1:
                    int iNum;
                    System.out.println("Cuántos datos desea ingresar:");
                    iNum = entrada.nextInt();
                    for (int i = 0; i < iNum; i++) {
                        System.out.println("Ingrese Dato # " + (i + 1));
                        iDato = entrada.nextInt();
                        Lista.InsertarEnPrimero(iDato);
                    }
                    System.out.println(Lista.Listar());
                    break;
                case 2:
                    if (Lista.vacia()==true) {

                        System.out.println("Qué posición desea eliminar:");
                        iDato = entrada.nextInt();
                        Lista.borrarPosicion(iOp);
                        System.out.println(Lista.Listar());
                    }else{
                        System.out.println("Lista Vacía");
                    }
                    break;
                case 3:
                    System.out.println("Qué dato desea buscar:");
                    iDato = entrada.nextInt();
                    System.out.println("El dato buscado existe: " + Lista.Buscar(iDato));
                    break;
                case 4:
                    System.out.println("Tamaño de la Lista: " + Lista.TamañoLista());
                    break;
                case 0:
                    System.out.println("SALIENDO DEL PROGRAMA");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        } while (iOp != 0);
    }

}
