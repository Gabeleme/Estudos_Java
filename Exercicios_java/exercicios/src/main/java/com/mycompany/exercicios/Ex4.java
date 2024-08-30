/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author gabio
 */
public class Ex4 {
     public static void main(String[] args) {
         
         int idade = 18;
         boolean cidadania = true;
         
         boolean elegivelParaVotar = idade >= 18 && cidadania;
         System.out.print("Elegivel para votar:" + elegivelParaVotar);
    }
}
