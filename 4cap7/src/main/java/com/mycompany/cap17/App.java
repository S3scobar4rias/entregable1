/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cap17;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el valor de A: ");
        double A = input.nextDouble();

        System.out.println("Ingrese el valor de B: ");
        double B = input.nextDouble();

        if (A > B) {
            System.out.println(A + " es mayor que " + B);
        } else {
            System.out.println(B + " es mayor que " + A);
        }

    }
}
