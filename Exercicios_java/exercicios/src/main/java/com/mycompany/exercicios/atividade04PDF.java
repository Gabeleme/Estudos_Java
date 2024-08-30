/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class atividade04PDF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int ladoA, ladoB, ladoC;
        
        System.out.printf("Informe o valor do Primeiro lado:\n");
        ladoA = entrada.nextInt();
        
        System.out.printf("Informe o valor do segundo lado:\n");
        ladoB = entrada.nextInt();
        
        System.out.printf("Informe o valor do Terceiro lado:\n");
        ladoC = entrada.nextInt();
        
        boolean escaleno = ladoA != ladoB && ladoB != ladoC && ladoA != ladoC; //para ser escaleno ele deve ser composto por todos os lados sendo diferente 
        
        System.out.print("O triangulo é escaleno? " + escaleno);
        
               
                
    }
            
            
            
}
