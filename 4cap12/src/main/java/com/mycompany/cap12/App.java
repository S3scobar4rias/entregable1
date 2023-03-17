/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cap12;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese la cantidad de horas trabajadas en la semana: ");
        int horas_trabajo = input.nextInt();

        System.out.print("Ingrese el valor recibido por una hora normal de trabajo: ");
        double valor_hora_inicio = input.nextDouble();

        double valorHora_Extra1 = valor_hora_inicio * 2;
        double valorHora_Extra2 = valor_hora_inicio * 3;

        double salario;
        if (horas_trabajo <= 40) {
            salario = horas_trabajo * valor_hora_inicio;
        } else {
            int horasExtras = horas_trabajo - 40;
            if (horasExtras <= 8) {
                salario = 40 * valor_hora_inicio + horasExtras * valorHora_Extra1;
            } else {
                int horasExtras2 = horasExtras - 8;
                salario = 40 * valor_hora_inicio + 8 * valorHora_Extra1 + horasExtras2 * valorHora_Extra2;
            }
        }

        System.out.printf("El trabajador %s recibirá un salario de $%.2f", nombre, salario);
    }
}
