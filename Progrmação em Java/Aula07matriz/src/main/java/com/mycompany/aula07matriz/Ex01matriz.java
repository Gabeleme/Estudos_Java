/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aula07matriz;

/**
 *
 * @author gabio
 */
public class Ex01matriz {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int contador = 0;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[linha][coluna] = contador;
                contador++; 
            }
        }
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("\t %d \t", matriz[linha][coluna]);
            }
            System.out.println();
        }
    }
}
