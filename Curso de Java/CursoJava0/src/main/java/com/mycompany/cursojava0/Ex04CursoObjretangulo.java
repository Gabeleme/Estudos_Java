/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava0;

import entities.retangulo;
import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex04CursoObjretangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
            
        retangulo ret = new retangulo(); 
        
        System.out.println("Insira a altura e a largura do retângulo: ");
        ret.altura = entrada.nextDouble(); 
        ret.largura = entrada.nextDouble(); 
        
        System.out.printf("AREA = %.2f\n", ret.area());
        System.out.printf("PERIMETRO = %.2f\n", ret.perimetro());
        System.out.printf("DIAGONAL = %.2f\n", ret.diagonal());
        
        
                
            
    }
}
