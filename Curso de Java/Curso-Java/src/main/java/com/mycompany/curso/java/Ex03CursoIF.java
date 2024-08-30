/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.curso.java;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex03CursoIF {

    public static void main(String[] args) {
        /*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente.
         */
        Scanner entrada = new Scanner(System.in);

        int A, B;

        System.out.println("Insira o primeiro valor inteiro: ");
        A = entrada.nextInt();

        System.out.println("Insira o segundo valor inteiro: ");
        B = entrada.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
    }
}
