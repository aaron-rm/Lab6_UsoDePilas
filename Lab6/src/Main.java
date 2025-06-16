//Simulador de Navegacion en un Navegador Web

//utilizar una pila, implementando: INSERTAR(push), ELIMINAR(pop), CIMA y PilaVacia


//se requiere implementar un sistema de navegacion basica:
//  visitar visitar una nueva pagina (push)
//  atras   regresar a la pagina anterior (pop)
//  actual  muestra la pagina web acutal (cima)
//  mostrar_historial   muestra todas las paginas en la pila (de arriba hacia abajo)

//Ejemplo de uso
//visitar("https://..1")
//visitar("https://..2")
//visitar("https://..3")
// actual()
// https://..3
// atras()
// actual()
// https://..2
// mostrar_historial()
// https://..1
// https://..2

//Entregar en formato .txt
// con un archivo README con instruccioness de uso y resumen de lo aprendido

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int MAX = 5, CIMA = 0;
        Scanner scanner = new Scanner(System.in);
        String[] url = new String[MAX];
        String DATO="";
        int opcion;

        do{
            System.out.println("Menu - Historial");
            System.out.println("1- Visitar");
            System.out.println("2- Atras ");
            System.out.println("3- Actual ");
            System.out.println("4- Mostrar Historial");
            System.out.println("5- Salir");
            System.out.print("Elegir una opción: ");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.print("Url a buscar: ");
                    DATO = scanner.nextLine();
                    INSERTAR(url, MAX, CIMA, DATO);
                    System.out.println(CIMA);
                    break;
                }
                case 2: {
                    ELIMINAR(url, CIMA, DATO);
                    break;
                }
                case 3: {
                    mostrarActual(url, CIMA);
                    break;
                }
                case 4: {
                    mostrarHistorial(url, CIMA);
                    break;
                }
            }
            }while (opcion != 5);
        }

    public static void mostrarHistorial(String[] url, int CIMA){

    }

    public static void mostrarActual(String[] url, int CIMA) {

    }

    public static void INSERTAR(String[] url, int MAX, int CIMA, String DATO){
        if (CIMA < MAX){
            CIMA = CIMA + 1;
            url[CIMA] = DATO;
        }else {
            System.err.println("El historial está lleno");
        }
    }

    public static void ELIMINAR(String[] url, int CIMA, String DATO){
        if (CIMA > 0){
            DATO = url[CIMA];
            CIMA = CIMA - 1;
        }else {
            System.err.println("El historial ya está vacio");
        }
    }
}
