/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.curso.java.past2;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex03cursoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor de X");
        int x = entrada.nextInt();
        System.out.println("Informe o valor de Y");
        int y = entrada.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }

            System.out.println("Informe o valor de X");
            x = entrada.nextInt();
            System.out.println("Informe o valor de Y");
            y = entrada.nextInt();
        }
    }
}
