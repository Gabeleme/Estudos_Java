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
public class Ex02CursoIF { //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("INPAR");
        }

    }
}
