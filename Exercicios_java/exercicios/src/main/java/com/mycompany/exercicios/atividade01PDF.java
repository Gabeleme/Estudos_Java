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
public class atividade01PDF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int ladoA, ladoB, ladoC;
        
        System.out.printf("Informe o valor do Primeiro lado:\n");
        ladoA = entrada.nextInt();
        
        System.out.printf("Informe o valor do segundo lado:\n");
        ladoB = entrada.nextInt();
        
        System.out.printf("Informe o valor do Terceiro lado:\n");
        ladoC = entrada.nextInt();
        
        boolean existeTriangulo = ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB; //para ser triangulo cada lado deve ser menor que os outros 2
        
        System.out.print("Os lados formam um trianagulo? " + existeTriangulo);
    }
    
}
