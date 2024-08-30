/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cursojava;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex01cursoFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        
       System.out.println("Quantos números deseja digitar: ");
       int N = entrada.nextInt(); 
       int soma = 0; 
       for(int i =0; i < N; i++ ){
           System.out.println("Insira o número: ");
           int x = entrada.nextInt();
           soma += x;
       }
       System.out.println("O resultado da Soma deu: "+ soma);
    }
}
