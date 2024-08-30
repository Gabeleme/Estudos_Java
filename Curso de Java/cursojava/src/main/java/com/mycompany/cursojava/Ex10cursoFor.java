/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex10cursoFor {

    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
        exemplo.
        */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor positivo: ");
        int N = entrada.nextInt();

        for (int i = 1; i <= N; i++) {

            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;

            System.out.printf("%d %d %d%n ", primeiro, segundo, terceiro);

        }
    }

}
