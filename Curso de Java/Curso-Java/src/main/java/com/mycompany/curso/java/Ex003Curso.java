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
public class Ex003Curso { // FAÇA UM PROGRAMA QUE CALCULE O RAIO DE UM CIRCULO 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in); 
        
        System.out.printf("Informe o raio do circulo: \n");
        Double raio = entrada.nextDouble();

        Double resultado = raio * raio * 3.14159;

        System.out.printf("Qual a área do circulo: " + resultado);
    }
            
}
