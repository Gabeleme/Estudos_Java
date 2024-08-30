/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex07cursoFor { // LEIA UM VALOR E MOSTRE A DIVISÃO ENTRE O PRIMEIRO PELO SEGUNDO, SE O VALOR VOR 0 MOSTRE DIVISÃO IMPOSSIVEL

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quandidade de vezes: ");
        int X = entrada.nextInt();

        for (int i = 0; i < X; i++) {
            System.out.println("Informe o valor de A: ");
            int A = entrada.nextInt();
            System.out.println("Informe o valor de B");
            int B = entrada.nextInt();
            
            if (B == 0) {
                System.out.println("Divisão Impossivel");
            } else {
                double div = (double) A / B;
                System.out.printf("%.1f%n", div);
            }

        }

    }
}
