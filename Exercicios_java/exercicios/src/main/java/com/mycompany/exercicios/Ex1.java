/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex1 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Informe o primeiro número");
       int numero1 = entrada.nextInt();
       
       System.out.println("Informe o segundo número");
       int numero2 = entrada.nextInt();
       
       boolean resultado = numero1 > numero2;
       System.out.printf("%d è maior que %d: %b", numero1, numero2, resultado);
       
       
    }
}
