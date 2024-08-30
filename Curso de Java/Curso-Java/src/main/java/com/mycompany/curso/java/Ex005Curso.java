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
public class Ex005Curso { // FAÇA UM PROGRAMA QUE CALCULE QUANTO O FUNCIONARIO GANHA 
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        
        int numfuncionario, horas; 
        double hrssalario, salariofinal; 
        
        System.out.println("Insira o número do funcionario: ");
        numfuncionario = entrada.nextInt(); 
        
         System.out.println("Insira o valor ganho por horas trabalhadas: ");
         horas = entrada.nextInt(); 
         
        System.out.println("Insira as horas trabalhadas: ");
        hrssalario = entrada.nextDouble(); 
        
        salariofinal = hrssalario * horas; 
        
        System.out.println("Numero do funcionario: " + numfuncionario);
        System.out.printf("Salario = U$ %.2f%n", salariofinal);
    }
            
}
