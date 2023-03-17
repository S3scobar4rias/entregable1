/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.capo19;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Obtener el valor del lado del triángulo
        System.out.print("Ingrese el valor del lado del triángulo equilátero: ");
        double lado = input.nextDouble();
  
        double perimetro = 3 * lado;

        double altura = Math.sqrt(3) / 2 * lado;

        double area = (altura*lado)/2;

        System.out.println("Perímetro del triángulo: " + perimetro);
        System.out.println("Altura del triángulo: " + altura);
        System.out.println("Área del triángulo: " + area);
    }
}
