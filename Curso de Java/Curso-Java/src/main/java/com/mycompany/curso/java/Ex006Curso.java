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
public class Ex006Curso { // FAÇA UM CÓDIGO QUE PEÇA  QUANTIDADE E VALOR E SOME QUANTO VAI PAGAR 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quant1, quant2;
        double valor1, valor2, valorfinal;

        System.out.println("Informe a quantidade de peças: ");
        quant1 = entrada.nextInt();

        System.out.println("Informe o valor unitario de cada peça: ");
        valor1 = entrada.nextDouble();

        System.out.println("Informe a quantidade de peças: ");
        quant2 = entrada.nextInt();

        System.out.println("Informe o valor unitario de cada peça: ");
        valor2 = entrada.nextDouble(); 
        
        valorfinal = valor1 * quant1 + valor2 * quant2; 
        
        System.out.printf ("valor a pagar: R$: %.2f%n ", valorfinal); 

    }
}
