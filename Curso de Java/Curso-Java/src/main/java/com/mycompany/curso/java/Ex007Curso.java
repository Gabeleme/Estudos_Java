/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.curso.java;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex007Curso { 
    /*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B.
*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("Digite o valor de A: ");
        A = entrada.nextDouble(); 
        
        System.out.println("Digite o valor de B: ");
        B = entrada.nextDouble(); 
        
        System.out.println("Digite o valor de C: ");
        C = entrada.nextDouble();  
        
        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B; 
        retangulo = A * B; 
        
        System.out.printf("Área do Triangulo: %.3f%n", triangulo ); 
        System.out.printf("Área do Circulo: %.3f%n", circulo); 
        System.out.printf("Área do Trapezio: %.3f%n", trapezio); 
        System.out.printf("Área do Quadrado: %.3f%n", quadrado); 
        System.out.printf("Área do Retangulo: %.3f%n", retangulo); 
    }
}
