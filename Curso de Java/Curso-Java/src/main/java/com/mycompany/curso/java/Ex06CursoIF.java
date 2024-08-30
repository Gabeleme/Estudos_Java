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
public class Ex06CursoIF {

    public static void main(String[] args) {
        /*
        Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
        seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
        nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
        */
        Scanner entrada = new Scanner(System.in);

       int valor;
        System.out.println("Insira um valor inteiro: ");
        valor = entrada.nextInt();
        if (valor < 0 || valor > 100) {
            System.out.println("Fora do intervalo");
        } else if (valor <= 25) {
            System.out.println("Intervalo entre (0 e 25) ");
        } else if (valor <= 50) {
            System.out.println("Intervalo entre (15 e 50) ");
        } else if (valor <= 75) {
            System.out.println("Intervalo entre (50 e 75)");
        } else {
            System.out.println("Intervalo entre (75 e 100)");
        }
    }
}
