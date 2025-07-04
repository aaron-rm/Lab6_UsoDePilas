

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int opcion;
        int MAX = 5, CIMA =0;
        String DATO = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] url = new String[MAX];

        while (true){
            try {
                do{
                    System.out.println();
                    System.out.println("Menu - Historial - Máximo: " + MAX);
                    System.out.println("1- Visitar");
                    System.out.println("2- Atras ");
                    System.out.println("3- Actual ");
                    System.out.println("4- Mostrar Historial");
                    System.out.println("5- Salir");
                    System.out.print("Elegir una opción: ");
                    opcion = Integer.parseInt(reader.readLine());

                    switch (opcion) {
                        case 1: {
                            if (CIMA < MAX){
                                System.out.print("Visitar: ");
                                DATO = reader.readLine();
                                url[CIMA] = DATO;
                                CIMA += 1;
                            }else System.err.println("El historial está lleno");
                            break;
                        }

                        case 2: {
                            if (CIMA > 0){
                                System.out.println("Url eliminada: "+url[CIMA-1]);
                                CIMA -= 1;
                            }else {
                                System.err.println("El historial ya está vacio");
                            }
                            break;
                        }

                        case 3: {
                            if (CIMA == 0){
                                System.out.println("No se ha ingresado ninguna url");
                            }else System.out.println("Url actual: "+url[CIMA-1]);
                            break;
                        }

                        case 4: {
                            System.out.println();
                            System.out.println("Historial");
                            if (CIMA==0){
                                System.out.println("El historial está vacio");
                            }else for (int i=0;i<CIMA;i++){
                                System.out.printf("Url %d:\t%s\n", i,url[i]);
                            }
                            break;
                        }
                    }
                }while (opcion != 5);
                break;
            }
            catch (IOException e){
                System.err.println("Error: " + e.getMessage());
            }
            catch (RuntimeException e){
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}
