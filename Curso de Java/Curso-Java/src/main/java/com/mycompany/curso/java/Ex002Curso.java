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
public class Ex002Curso { //FAÇA UM PROGRAMA QUE SOME OS DOIS VALORES

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in); 
       
       int A, B, soma; 
       
       System.out.println("Digite o primeiro valor; ");
       A = entrada.nextInt(); 
       
       System.out.println("Digite o segundo valor: "); 
       B = entrada.nextInt(); 
       
       soma = A + B; 
       
       System.out.println("O resultado da soma é: " + soma);
       
    }
}
