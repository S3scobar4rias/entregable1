/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cap18;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el código del empleado: ");
        int codigo = input.nextInt();

        System.out.print("Ingrese el nombre del empleado: ");
        String nombres = input.next();

        System.out.print("Ingrese el número de horas trabajadas al mes: ");
        double horasTrabajadas = input.nextDouble();

        System.out.print("Ingrese el valor hora trabajada: ");
        double valorHora = input.nextDouble();

        System.out.print("Ingrese el porcentaje de retención en la fuente: ");
        double retencion = input.nextDouble();


        double salarioBruto = horasTrabajadas * valorHora;
        double retencionFuente = salarioBruto * (retencion/100);
        double salarioNeto = salarioBruto - retencionFuente;


        System.out.println("Código del empleado: " + codigo);
        System.out.println("Nombre del empleado: " + nombres);
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Salario neto: $" + salarioNeto);
    }
}
