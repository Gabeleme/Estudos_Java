/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava0;

import entities.triangulo;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex02CursoObjTriangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        triangulo x;
        triangulo y;
        x = new triangulo();
        y = new triangulo();

        System.out.println("Informe os valores do triangulo X: ");
        x.a = entrada.nextDouble();
        x.b = entrada.nextDouble();
        x.c = entrada.nextDouble();

        System.out.println("Informe os valores do triangulo Y: ");
        y.a = entrada.nextDouble();
        y.b = entrada.nextDouble();
        y.c = entrada.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

    }
}
