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
public class Ex09cursoFor { // Ler um número inteiro N e calcular todos os seus divisores

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Informe um valor inteiro:");
        int N = entrada.nextInt();        
        
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
                
            }
        }
    }
}
