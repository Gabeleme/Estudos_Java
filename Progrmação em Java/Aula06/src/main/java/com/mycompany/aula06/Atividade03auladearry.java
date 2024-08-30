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
public class Atividade03auladearry {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double vetor[] = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite Sua Nota: ");
            vetor[i] = entrada.nextDouble();
        }

        for (int i = 0; i < 4; i++) {
            System.out.printf("Nota: ", i);
            System.out.println(vetor[i]);

        }
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma = soma + vetor[i];
        }
        double media = soma /4; 
        System.out.println("A média das notas foi de: " + media);
    }
}
