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
public class Ex05cursoFor {

    public static void main(String[] args) {
        /*
        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de valores que deseja digitar: ");
        int N = entrada.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Informe os valores: ");
            int X = entrada.nextInt();
            if (X >= 10 && X >= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
