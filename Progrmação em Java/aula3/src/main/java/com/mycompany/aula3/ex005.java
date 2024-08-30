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
public class ex005 {

    /*
     Conhecendo-se a quantidade de pessoas de um grupo e suas idades, escrever um algoritmo que indica quantas são maiores de idade 
     referência a 18 anos - e qual a porcentagem desses que têm idade acima de 60 anos.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual a quatidade de pessoas no grupo: ");
        int pessoas = entrada.nextInt();

        int maiordeidade = 0;
        int maiorde60 = 0;

        for (int i = 0; i < pessoas; i++) {
            System.out.printf("Digite a idade da %dª pessoa: ", (i + 1));
            int idade = entrada.nextInt();

            if (idade >= 18) {
                maiordeidade++;
                if (idade > 60) {
                    maiorde60++;
                }
            }
        }
        System.out.println("Quantidade de pessoas maiores de idade: " + maiordeidade);
        double porcentagem = maiorde60 * 100 / maiordeidade;
        System.out.println("Porcentagem de pessoas maiores de 60 anos: " + porcentagem + "%");
    }
}
