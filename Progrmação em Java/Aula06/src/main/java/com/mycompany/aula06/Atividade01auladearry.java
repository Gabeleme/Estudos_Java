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
public class Atividade01auladearry {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        int vetor[] = new int[5];
        
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número: ");
            vetor[i] = entrada.nextInt();
        }
        
        for(int i = 0; i < 5; i++){
            System.out.printf("Vetor[%d]: ", i);
            System.out.println(vetor[i]);
        }
    }
}
