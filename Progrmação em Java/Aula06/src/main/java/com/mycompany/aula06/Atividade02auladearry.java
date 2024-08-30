/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Atividade02auladearry {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        double vetor[] = new double[10]; 
        
        for (int i = 0; i < 10; i++){
            System.out.println("Informe um número: ");
            vetor[i] = entrada.nextDouble();  
        }
        
       for (int i = 9; i >= 0; i--){
           System.out.println(vetor[i]);
       }
    }
}
