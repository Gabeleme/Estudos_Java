/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Atividade04auladearry {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira um número inteiro: ");
            vetor[i] = entrada.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma = soma + vetor[i];
        }
        System.out.println("A soma é: " + soma);
        
        int mult = 1;
        for (int i = 0; i < 5; i++) {
            mult = mult * vetor[i];
        }
        System.out.println("A multiplicação é: " + mult);
        
        System.out.println("Os números escolhidos foram: ");
        for (int i = 0; i < 5; i++) {
           
            System.out.print(vetor[i] + " ");
        }
         
    }
}
