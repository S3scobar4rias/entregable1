/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;

/**
 *
 * @author santi
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        int horas_semana, razon_hora;
        horas_semana = 48;
        razon_hora = 5000;
        double total = horas_semana *razon_hora;
        double retencion = 0.125 * total;
        double salario_N = total - retencion;
        System.out.println("El salario bruto del trabajor es de: "+ total + "$");
        System.out.println("La retencion en la fuente es de: "+ retencion+ "$");
        System.out.println("El salario neto del trabajador es de: "+ salario_N+ "$");
        
           
        
    }
}
