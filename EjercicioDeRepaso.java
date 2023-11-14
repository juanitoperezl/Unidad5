/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioderepaso;

/**
 *
 * @author Usuario
 */
public class EjercicioDeRepaso {

    
    public static void main(String[] args) {
   
      int[][] consumoDeAgua = {
            {100, 50, 30, 120,60},
            {32, 122, 46, 80,90},
            {45,100,56,26,36},
            {60,110,72,33,40},
        };
        EjercicioDeRepaso.consumoDeAguaporcasa(consumoDeAgua);
        EjercicioDeRepaso.consumoDeAguapordia(consumoDeAgua);
       
    }

    
    public static void consumoDeAguaporcasa(int[][] consumoDeAgua) {
        
        System.out.println("total de consumo de agua por casas ");        
        for (int i = 0; i < consumoDeAgua.length; i++) {
            int suma = 0;
            for (int j = 0; j < consumoDeAgua[i].length; j++) {
                suma += consumoDeAgua[i][j];
            }
            
            System.out.println("consumoDeAguapordia " + (i + 1) + ": " + suma);
        }
        System.out.println();
    }

   
    public static void consumoDeAguapordia(int[][] consumoDeAgua) {
        System.out.println("total de consumo de agua por dia:");
        for (int j = 0; j < consumoDeAgua[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < consumoDeAgua.length; i++) {
                suma += consumoDeAgua[i][j];
            }
            
            System.out.println("Total de agua " + (j + 1) + ": " + suma);           
        }
        System.out.println();
    }
}   




    

