/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class atividade05PDFif {
        
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ladoA, ladoB, ladoC;

        System.out.printf("Informe o valor do Primeiro lado:\n");
        ladoA = entrada.nextInt();

        System.out.printf("Informe o valor do segundo lado:\n");
        ladoB = entrada.nextInt();

        System.out.printf("Informe o valor do Terceiro lado:\n");
        ladoC = entrada.nextInt();

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) { // cada lado deve ser menor que a soma dos outros dois.
            System.out.printf("è um triangulo\n");

            if (ladoA == ladoB && ladoB == ladoC) {            //Um triângulo equilátero é composto por todos os lados iguais
               System.out.printf("è um triangulo equilatero\n");

            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) { //composto por somente dois lados iguais.
                System.out.printf("é um triangulo isósceles\n");

            } else {                                                       
                System.out.printf("è um triangulo escaleno\n");  //composto por todos os lados sendo diferentes.
            }
            } else {
                System.out.printf("Não é um triângulo\n"); 
            }

           
        }
    }


