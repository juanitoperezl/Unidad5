
package practica2u4.pkg5;

import java.util.Scanner;

/**
 *
 * @author Jazzy :) (❁´◡`❁)
 */
public class Practica2U45 {
    
       
    
   
    public static double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    
    public static double restar(double numero1, double numero2) {
        return numero1-numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    
    public static double dividir(double numero1, double numero2) {
       
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; 
        }
    }

    public static void main(String[] args) {
       
          Scanner numeros= new Scanner (System.in);
    
         System.out.println("Ingresa un numero");
         double numero1=numeros.nextDouble();
         System.out.println("Ingresa otro numero");
         double numero2=numeros.nextDouble();
         
        double resultadoSuma = sumar(numero1,numero2);
        double resultadoResta = restar(numero1,numero2);
        double resultadoMultiplicacion = multiplicar(numero1,numero2);
        double resultadoDivision = dividir(numero1,numero2);

        
        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicacion: " + resultadoMultiplicacion);
        System.out.println("Division: " + resultadoDivision);
    }
}



