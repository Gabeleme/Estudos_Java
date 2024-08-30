/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex06cursoFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe a quantidade de casos que vc deseja: ");
        int X = entrada.nextInt();
        for (int i = 0; i < X; i++) {
            System.out.println("Digite o primeiro valor:");
            double A = entrada.nextDouble();

            System.out.println("Digite o segundo valor:");
            double B = entrada.nextDouble();

            System.out.println("Digite o terceiro valor:");
            double C = entrada.nextDouble();

            double media = (A * 2.0 + B * 3.0 + C * 5.0) / 10.0;
            System.out.printf("%.1f%n", media);

        }
    }
}
