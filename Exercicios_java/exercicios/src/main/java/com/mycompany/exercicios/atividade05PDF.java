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
public class atividade05PDF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int ladoA, ladoB, ladoC;
        
        System.out.printf("Informe o valor do Primeiro lado:\n");
        ladoA = entrada.nextInt();
        
        System.out.printf("Informe o valor do segundo lado:\n");
        ladoB = entrada.nextInt();
        
        System.out.printf("Informe o valor do Terceiro lado:\n");
        ladoC = entrada.nextInt();
               
        boolean existeTriangulo = ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB;   
        boolean equilatero = existeTriangulo && ladoA == ladoB && ladoB == ladoC;
        boolean isosceles = existeTriangulo && !equilatero && (ladoA == ladoB || ladoB == ladoC && ladoA == ladoC);
        boolean escaleno = existeTriangulo && !equilatero && !isosceles;
        
        System.out.println("O triângulo existe? " + existeTriangulo); //para ser triangulo cada lado deve ser menor que os outros 2
        System.out.println("É equilátero? " + equilatero); // para ser equilatero ele deve ser composto por todos os lados iguais
        System.out.println("É isósceles? " + isosceles); //para ser isosceles ele devee ser composto pot somente 2 lados iguais
        System.out.println("É escaleno? " + escaleno); //para ser escaleno ele deve ser composto por todos os lados sendo diferente 
    }
}
