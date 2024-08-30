/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07matriz;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex04matriz {

    public static void main(String[] args) {
        double matriz[][] = new double[2][5];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Matriz M [2][5]\n");
        System.out.println("Informe os valores");

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                matriz[linha][coluna] = entrada.nextInt();
            }
        }
        System.out.println("\n A matriz ficou \n");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.printf("\t %.2f \t",matriz[linha][coluna]);
            }
            System.out.println();
        }
    }
}
