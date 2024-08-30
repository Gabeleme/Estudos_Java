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
public class Ex004Curso { //FAÇA UM PROGRAMA QUE SOME O RESTO DE 4 VALORES 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = entrada.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = entrada.nextInt();

        System.out.println("Digite o valor de C: ");
        int C = entrada.nextInt();

        System.out.println("Digite o valor de D: ");
        int D = entrada.nextInt();
        
        int diferença = (A * B - C * D);
        
        System.out.println("A diferença é: " + diferença); 
    }
}
