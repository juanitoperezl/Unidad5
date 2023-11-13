
package piramide2;

import java.util.Scanner;


public class Piramide2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Menú
            System.out.println("Menu:");
            System.out.println("1. Piramide de Asteriscos");
            System.out.println("2. Piramide de Letras");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Pirámide de Asteriscos
                    System.out.print("Ingrese el Numero de filas que desea: ");
                    int filasAsteriscos = scanner.nextInt();
                    dibujarPiramideAsteriscos(filasAsteriscos);
                    break;

                case 2:
                    // Pirámide de Letras
                    System.out.print("Ingrese el Numero de filas que desea: ");
                    int filasLetras = scanner.nextInt();
                    dibujarPiramideLetras(filasLetras);
                    break;

                case 0:
                    // Salir del programa
                    System.out.println("Saliendo del programa. ¡Hasta luego! ^_____^");
                    break;

                default:
                    System.out.println("Opcion invalida. Intentelo de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    //  pirámide de asteriscos
    private static void dibujarPiramideAsteriscos(int filas) {
        for (int i = 0; i <= filas; i++) {
            System.out.print("");
            for (int j = 0; j <= filas-i; j++) {
            }
            for (int k = 0; k < 1*i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // piramide de letras y numeros 
    private static void dibujarPiramideLetras(int filas) {
         
       int valorNumero = 1;
       char valorLetra = 'A';
       for (int i = 1; i <= filas; i++) {
       for (int j = 0; j < i; j++) {
         if (i % 2 == 1) {                   
         System.out.print(valorNumero++);                       
           } else {                 
          System.out.print(valorLetra++);                      
               }             
 }                       
       System.out.println();     
   }                 
                    
        }
    }

    


