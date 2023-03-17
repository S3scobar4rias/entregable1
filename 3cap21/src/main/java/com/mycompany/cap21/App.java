/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cap21;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer lado del triángulo: ");
        double lado1 = input.nextDouble();

        System.out.println("Ingrese el segundo lado del triángulo: ");
        double lado2 = input.nextDouble();

        System.out.println("Ingrese el tercer lado del triángulo: ");
        double lado3 = input.nextDouble();

        double perimetro = lado1 + lado2 + lado3;

        double semiperimetro = perimetro / 2;

        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
  
        System.out.println("El perímetro del triángulo es: " + perimetro);
        System.out.println("El semiperímetro del triángulo es: " + semiperimetro);
        System.out.println("El área del triángulo es: " + area);
    }
}

