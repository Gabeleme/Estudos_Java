/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex2 {
     public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Informe o primeiro número");
       int numero1 = entrada.nextInt();
       
       System.out.println("Informe o segundo número");
       int numero2 = entrada.nextInt();
       
       boolean resultado1 = numero1 > numero2;
       boolean resultado2 = numero1 < numero2;
       boolean resultado3 = numero1 == numero2;
       boolean resultado4 = numero1 != numero2;
       
       System.out.printf("%d é maior que %d: %b \n", numero1, numero2, resultado1);
       System.out.printf("%d é menor que %d: %b \n", numero1, numero2, resultado2);
       System.out.printf("%d é igual que %d: %b \n", numero1, numero2, resultado3);
       System.out.printf("%d é diferente de %d: %b \n", numero1, numero2, resultado4);
       
    }
}
