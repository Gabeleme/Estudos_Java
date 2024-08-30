/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07matriz;

/**
 *
 * @author gabio
 */
public class Ex02matriz {

    public static void main(String[] args) {

        int matriz1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int matriz2[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        System.out.println("Matriz 1:");
        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1.length; coluna++) {
                System.out.printf("\t%d\t", matriz1[linha][coluna]);
            }
            System.out.println();
        }
        System.out.println("Matriz 2:");
        for (int linha = 0; linha < matriz2.length; linha++) {
            for (int coluna = 0; coluna < matriz2.length; coluna++) {
                System.out.printf("\t%d\t", matriz2[linha][coluna]);
            }
            System.out.println();
        }
        System.out.println("Soma das Matrizes:");
        for (int linha = 0; linha < matriz2.length; linha++) {
            for (int coluna = 0; coluna < matriz2.length; coluna++) {
                int soma = matriz1[linha][coluna] + matriz2[linha][coluna];
                System.out.printf("\t%d\t", soma);
            }
            System.out.println();
        }
    }
}
