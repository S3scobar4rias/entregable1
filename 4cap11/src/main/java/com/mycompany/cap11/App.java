/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cap11;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int A = input.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        int B = input.nextInt();

        System.out.print("Ingrese el tercer valor: ");
        int C = input.nextInt();

        int mayor;
        if (A > B && A > C) {
            mayor = A;
        } else if (B > A && B > C) {
            mayor = B;
        } else {
            mayor = C;
        }

        System.out.printf("El valor mayor entre %d, %d, %d, es: %d", A, B, C, mayor);
    }
}
