/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06;

/**
 *
 * @author gabio
 */
public class Ex04auladearray {

    public static void main(String[] args) {

        int vetor[] = new int[5];

        for (int i = 0; i < 5; i++) {
            vetor[i] = i;
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("vetor[%d]: ", i);
            System.out.println("vetor[i]");
        }
    }

}
