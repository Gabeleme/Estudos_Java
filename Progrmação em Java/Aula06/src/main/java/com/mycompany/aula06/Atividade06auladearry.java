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
public class Atividade06auladearry {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] media = new double[3];
        int maxmedaluno = 0;
        for (int i = 0; i < 3; i++) {
           
            double soma = 0;
            System.out.println("Nota do aluno " + (i + 1));

            for (int j = 0; j < 4; j++) {
                System.out.println("Digite aqui: ");
                double nota = entrada.nextDouble();
                soma += nota;
            }
            media[i] = soma / 4;
            
            if (media[i] >= 7){
            maxmedaluno++; 
            }
        }
        System.out.println("Médias dos alunos:");
        for (int i = 0; i < 3; i++) {
            System.out.println(media[i]);
        }
        System.out.println("Número de alunos com média maior que 7.0: " + maxmedaluno);
    }
}
