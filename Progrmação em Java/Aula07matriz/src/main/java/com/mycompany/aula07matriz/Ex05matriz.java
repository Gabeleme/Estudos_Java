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
public class Ex05matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas:");
        int linhas = entrada.nextInt();

        System.out.println("Informe a quantidade de colunas:");
        int colunas = entrada.nextInt();

        System.out.println("Quantidade de linhas: " + linhas);
        System.out.println("Quantidade de colunas: " + colunas);
        int matriz[][] = new int[linhas][colunas];

        System.out.println("Matriz");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {

                System.out.printf("\t %d \t", matriz[i][j]);
            }
             System.out.println();
        }
    }
}
