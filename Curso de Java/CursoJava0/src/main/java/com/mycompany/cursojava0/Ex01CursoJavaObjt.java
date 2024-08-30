/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cursojava0;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex01CursoJavaObjt {

    //AQUI VAMOS FAZER UM CÓDIGO SEM UTILIZAR A ORIENTAÇÃO A OBJETO
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;
        System.out.println("Informe os valores do triangulo X: ");
        xA = entrada.nextDouble();
        xB = entrada.nextDouble();
        xC = entrada.nextDouble();

        System.out.println("Informe os valores do triangulo Y: ");
        yA = entrada.nextDouble();
        yB = entrada.nextDouble();
        yC = entrada.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

    }
}
