/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14;

/**
 *
 * @author santi
 */
import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        double numero = input.nextDouble();

        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.println("El cuadrado de " + numero + " es " + cuadrado);
        System.out.println("El cubo de " + numero + " es " + cubo);

    }
}
