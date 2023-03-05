/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan");
        int Juan, Alberto, Ana, Yo;
        Juan = entrada.nextInt();
        Alberto = (Juan / 3 * 2);
        Ana =(Juan / 3 * 4);
        Yo = Juan + Alberto + Ana;
        System.out.println("Estas son las edades de los 4 hermanos");
        System.out.println("Juan tiene: " + Juan +" años");
        System.out.println("Alberto tiene: " + Alberto +" años");
        System.out.println("Ana tiene: " + Ana +" años");
        System.out.println("La mamá de juan tiene: " + Yo +" años");
        

       
    }//fin
}