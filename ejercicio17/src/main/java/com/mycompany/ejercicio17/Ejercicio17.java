/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio17;

/**
 *
 * @author santi
 */
import java.util.Scanner;
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Ingrese el radio del círculo: ");
        double radio = input.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        double circunferencia = 2 * Math.PI * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + circunferencia);
   }
}
