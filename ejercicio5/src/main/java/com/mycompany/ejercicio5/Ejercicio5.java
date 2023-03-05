/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author santi
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        short SUMA, X, Y;
        SUMA = 0;
        X = 20;
        SUMA += 20;
        Y = 40;
        X += X*X;
        SUMA += (short)(X/Y);
        System.out.println("El valor de la suma es: " + SUMA);
        
                
    }
}
