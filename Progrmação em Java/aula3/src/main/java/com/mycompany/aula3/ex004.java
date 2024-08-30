/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class ex004 {

    /*
      A média final de uma disciplina é calculada pela média aritmética simples de três provas. 
      Escreva um programa que, dado o número de alunos de uma turma e suas notas de provas, calcule para cada um deles sua média final. 
      Indique se cada aluno está aprovado ou reprovado, considerando que para ser aprovado a média deve ser maior ou igual a 6.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de aluno: ");
        int alunos = entrada.nextInt();

        for (int i = 0; i < alunos; i++) {

            System.out.printf("Digite a Primeira nota: \n");
            double nota1 = entrada.nextDouble();

            System.out.printf("Digite a Segunda nota: \n");
            double nota2 = entrada.nextDouble();

            System.out.printf("Digite a Terceira nota: \n");
            double nota3 = entrada.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            if (media >= 6) {
                System.out.printf("Aprovado \n");
            } else {
                System.out.printf("Reprovado \n");
            }
        }
    }
}
