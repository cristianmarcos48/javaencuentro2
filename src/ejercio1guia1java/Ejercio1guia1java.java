/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio1guia1java;

import java.util.Scanner;

/**
 * Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 * @author Juan
 */
public class Ejercio1guia1java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
 Scanner leer = new Scanner(System.in);
 int num1;
 int num2;
        System.out.println("ingrese primer valor");
 num1 = leer.nextInt();
        System.out.println("ingrese el segundo valor");
 num2 = leer.nextInt();
 int suma = num1 + num2;
        System.out.println("la suma es: " + suma);
        
        System.out.println("la suma es: " + (num1 + num2));
         
 
         
 
 
    }
    
}
