/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07matriz;

import java.util.Random;

/**
 *
 * @author gabio
 */
public class Ex03matriz {

    public static void main(String[] args) {
        Random gerador = new Random(); //criando a classe random que é o gerador de número aleatorio 
        int matriz[][] = new int[3][3];
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[linha][coluna] = gerador.nextInt(100); //gera número entre 0 e 100
            }
        }
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("\t%d\t",matriz[linha][coluna]);
            }
            System.out.println();
        }
    }
}
