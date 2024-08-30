/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;



/**
 *
 * @author gabio
 */
public class Exercicio4 {
     public static void main(String[] args) {
         int quadros =8;
         double total = 0.0;
         for(int linha = 0; linha < quadros; linha++){
         System.out.println("+------+------+------+------+" +
                               "------+------+------+------+");
            System.out.print("|");
            for (int coluna = 0; coluna < quadros; coluna++) {
                double grao = Math.pow(2, linha + coluna);
                System.out.printf("%5.0f |", grao);
                total += grao;
            }
            System.out.println();
        }
        System.out.println("+------+------+------+------+" +
                           "------+------+------+------+");        
        
        System.out.printf("Valor total a pagar ao alfaiate: R$ %.2f\n",
                           total);
         }
     }
