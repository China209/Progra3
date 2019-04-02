package estructuralibros;

import java.util.Scanner;

public class principal {

    static Lista lista = new Lista();
    static String sTitulo, sAutor, sIsbn;
    static Libro libro;
 //   static Libro libro=new Libro("","","");
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        
        int iOpcion;
        Scanner entrada = new Scanner(System.in);
        do {
            //Menu
            System.out.println("MENÚ\n1.Ingreso de Datos\n2.Mostrar Lista de Datos\n3.Eliminar Datos\n0.Salir");
            iOpcion = entrada.nextInt();//Obtiene el valor del dato numérico ingresado
            switch (iOpcion) {
                case 1://En caso de Ingresod de Datos
                    System.out.println("1.Insertar al inicio\n2.Insertar al final\n3.Insertar en posición n");//Presenta el submenu de Ingreso
                    iOpcion = entrada.nextInt();
                    InsercionDatos(iOpcion,libro);//Llama al método con los parametros de opcion y libro
                    break;
                case 2:
                    //Muestra los datos de la lista
                    System.out.println("Datos del Libro\n" + lista.Listar());
                    break;
                case 3:
                    System.out.println("1.Eliminar al inicio\n2.Eliminar al final\n3.Eliminar en posición n");//Presenta el submenu de Ingreso
                    iOpcion = entrada.nextInt();
                    Eliminar(iOpcion,libro);
                    break;
            }

        } while (iOpcion != 0);//Si la opción es = 0, sale del programa
    }

    public static void InsercionDatos(int iOpcion, Libro libro) {
        Scanner entrada = new Scanner(System.in);
        int iNum;
        switch (iOpcion) {
            case 1://Ingreso en el inicio del nodo
                System.out.println("¿Cuántos datos desea ingresar?");
                iNum = entrada.nextInt();
                for (int i = 0; i < iNum; i++) {
                    System.out.println("Ingrese Datos del Libro #" + (i + 1));
                    IngresoDatos();
                    libro = new Libro(sTitulo, sAutor, sIsbn);
                    lista.insertarPrincipio(libro);
                }
                break;
            case 2://Ingreso al final del nodo
                System.out.println("¿Cuántos datos desea ingresar?");
                iNum = entrada.nextInt();
                for (int i = 0; i < iNum; i++) {
                    System.out.println("Ingrese Datos del Libro #" + (i + 1));
                    IngresoDatos();
                    libro = new Libro(sTitulo, sAutor, sIsbn);
                    lista.insertarFinal(libro);
                }
                break;
            case 3://Ingreso en la posicion n
                int iPos;
                IngresoDatos();
                System.out.println("¿Qué posición desea insertar?");
                iPos = entrada.nextInt();
                libro = new Libro(sTitulo, sAutor, sIsbn);
                lista.insertarDespues(iPos, libro);
                break;

        }

    }
    public static void Eliminar(int iOpcion, Libro libro){
        Scanner entrada = new Scanner(System.in);
        switch(iOpcion){
            case 1:
                lista.eliminaPrincipio();
                System.out.println("Eliminado");
                break;
            case 2:
                lista.eliminarUltimo();
                System.out.println("Eliminado");
                break;
            case 3:
                int iPos;
                System.out.println("¿Qué posición desea eliminar?");
                iPos=entrada.nextInt();
                lista.eliminarLibro(iPos);
                System.out.println("Eliminado");
                break;
                
        }
        
    }

    public static void IngresoDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el título del libro: ");
        sTitulo = entrada.nextLine();
        System.out.print("\nIngrese el autor del libro: ");
        sAutor = entrada.nextLine();
        System.out.print("\nIngrese el isbn del libro: ");
        sIsbn = entrada.nextLine();
    }
}
