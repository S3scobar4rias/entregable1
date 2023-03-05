/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercico5l;

/**
 *
 * @author santi
 */
public class Ejercico5l {

    public static void main(String[] args) {
        double SUMA, X, Y;
        SUMA = 0;
        X = 20;
        SUMA += X;
        Y = 40;
        X += Y*Y;
        SUMA += (double)(X/Y);
        System.out.println("El valor de la suma es: " + SUMA);
        
                
    }
}
