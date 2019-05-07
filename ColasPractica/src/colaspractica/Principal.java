
package colaspractica;

import java.util.Scanner;

public class Principal {

    static ColasFunciones cola = new ColasFunciones();
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
            System.out.println("MENÚ\n1.Ingreso de Datos\n2.Mostrar Lista de Datos\n3.Eliminar Datos\n4.¿Cola Vacía?\n5.Número de Datos\n0.Salir");
            iOpcion = entrada.nextInt();//Obtiene el valor del dato numérico ingresado
            switch (iOpcion) {
                case 1://En caso de Ingreso de Datos
                    iOpcion = entrada.nextInt();
                    InsercionDatos(libro);//Llama al método con el parametro de libro
                    break;
                case 2:
                    //Muestra los datos de la cola
                    System.out.println("Datos del Libro\n" + cola.MostrarDatos());
                    break;
                case 3:
                    iOpcion = entrada.nextInt();
                    Eliminar(libro);
                    break;
                case 4://Llamado de la función estaVacia()
                    System.out.println("La cola está vacía: "+cola.estaVacia());
                    break;
                case 5://Retorno de la cantidad de datos
                     System.out.println("Número de datos dentro de la cola: "+cola.contar());
                    break;
                    
            }

        } while (iOpcion != 0);//Si la opción es = 0, sale del programa
    }
    //Llamado de la funcion encolar
    public static void InsercionDatos(Libro libro) {
        Scanner entrada = new Scanner(System.in);
        int iNum;
        System.out.println("¿Cuántos datos desea ingresar?");
        iNum = entrada.nextInt();
        for (int i = 0; i < iNum; i++) {
            System.out.println("Ingrese Datos del Libro #" + (i + 1));
            IngresoDatos();
            libro = new Libro(sTitulo, sAutor, sIsbn);
            cola.Encolar(libro);
        }

    }
    //Llamado de la función desencolar
    public static void Eliminar( Libro libro) {
        cola.Desncolar();
        System.out.println("Eliminado");

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
