/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author gabio
 */
public class Ex5 {
     public static void main(String[] args) {
    
        int estoque = 10;
        double precoMinimo = 50.0;
        
        boolean produtoDisponivel = estoque > 0 && precoMinimo <= 50.0;
        System.out.print("O produto está disponível para compra: " + produtoDisponivel);
     }
     
}
