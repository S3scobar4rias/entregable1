/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cap10;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero_inscripcion, patrimonio, estrato;
        String nombres;
        int valor_constante = 50000;

        System.out.print("Ingrese número de inscripción: ");
        numero_inscripcion = input.nextInt();

        System.out.print("Ingrese sus nombres: ");
        nombres = input.next();

        System.out.print("Ingrese el patrimonio: ");
        patrimonio = input.nextInt();

        System.out.print("Ingrese su estrato: ");
        estrato = input.nextInt();

        if (patrimonio > 2000000 && estrato > 3) {
            valor_constante += patrimonio * 0.03;
        }

        System.out.println();
        System.out.println("El estudiante con número de inscripción " + numero_inscripcion + " y nombre " + nombres + " debe pagar " + valor_constante);
    }
}