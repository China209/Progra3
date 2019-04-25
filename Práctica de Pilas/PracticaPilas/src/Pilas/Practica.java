package Pilas;

import java.util.Scanner;

public class Practica {

    static Pila pila = new Pila();
    static String sTitulo, sAutor, sIsbn;
    static Libro libro;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        try {
            int iOpcion;
            Scanner entrada = new Scanner(System.in);
            do {
                //Menu
                System.out.println("MENÚ\n1.Ingreso de Datos\n2.Mostrar Lista de Datos\n3.Eliminar Datos\n4.Lista Vacia\n5.Vaciar Pila\n6.Cima\n0.Salir");
                iOpcion = entrada.nextInt();//Obtiene el valor del dato numérico ingresado
                switch (iOpcion) {
                    case 1://En caso de Ingreso de Datos
                        InsercionDatos(libro);//Llama al método con paramametro libro
                        break;
                    case 2:
                        //Muestra los datos de la lista
                        System.out.println("Datos del Libro\n" + pila.MostrarDatos());
                        break;
                    case 3:
                        Eliminar(libro);
                        break;
                    case 4:
                        System.out.println("La pila está vacía: " + pila.Vacio());
                        break;
                    case 5:
                        pila.VaciarPila();
                        System.out.println("Vaciado");
                        break;
                    case 6:
                        System.out.println("La cima es: " + pila.Top());
                        break;
                }

            } while (iOpcion != 0);//Si la opción es = 0, sale del programa
        } catch (PilaVaciaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("PROGRAMA DE PILAS CON EXCEPCIONES PERSONALIZADAS");
        }

    }

    public static void InsercionDatos(Libro libro) {
        Scanner entrada = new Scanner(System.in);
        int iNum;
        System.out.println("¿Cuántos datos desea ingresar?");
        iNum = entrada.nextInt();
        for (int i = 0; i < iNum; i++) {
            System.out.println("Ingrese Datos del Libro #" + (i + 1));
            IngresoDatos();
            libro = new Libro(sTitulo, sAutor, sIsbn);
            pila.Push(libro);
        }
    }

    public static void Eliminar(Libro libro) {
        pila.Pop();//Elimimar Datos de la pila
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
