/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.curso.java.past2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex07cursoDoWhile {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = entrada.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = entrada.next().charAt(0);
        } while (resp != 'n');
    }
}
