/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.poo;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua nota da AC1: ");
        double Ac1 = entrada.nextDouble();

        System.out.println("Informe sua nota da AC2: ");
        double Ac2 = entrada.nextDouble();

        System.out.println("Informe sua nota da Ag: ");
        double Ag = entrada.nextDouble();

        System.out.println("Informe sua nota da Af: ");
        double Af = entrada.nextDouble();

        double mediaf = (Ac1 * 0.15) + (Ac2 * 0.30) + (Ag * 0.10) + (Af * 0.45);

        System.out.printf("a media final é %.2f\n", mediaf);
    }
}
