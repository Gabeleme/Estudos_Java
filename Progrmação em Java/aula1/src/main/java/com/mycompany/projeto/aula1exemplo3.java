/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

import java.util.Scanner;

public class aula1exemplo3 {
     public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        
      System.out.printf("Informe a Ac1\n");
      double Ac1 = entrada.nextDouble();
      
      System.out.printf("Informe a Ac2\n");
      double Ac2 = entrada.nextDouble();
      
      System.out.printf("Informe a Ag\n");
      double Ag = entrada.nextDouble();
      
      System.out.printf("Informe a Af\n");
      double Af = entrada.nextDouble(); 
      
      double mediaf = (Ac1 * 0.15) + (Ac2 * 0.30) + (Ag * 0.10) + (Af * 0.45);
      
      System.out.printf("a media final é %.2f\n" ,mediaf);
      
           
  }  
              
}


