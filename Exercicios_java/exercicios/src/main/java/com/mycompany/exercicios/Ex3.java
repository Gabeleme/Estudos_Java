/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author gabio
 */
public class Ex3 {
     public static void main(String[] args) {
       
       boolean a = true;
       boolean b = false;
       
       boolean result1 = a && b;
       boolean result2 = a || b;
       boolean result3 = !a;
       
       System.out.println("valor de \"a\": " + a);
       System.out.println("valor de \"b\": " + b);
       System.out.println("Operação AND (a && b): " + result1);
       System.out.println("Operação AND (a || b): " + result2);
       System.out.println("Operação AND (!a): " + result3);
    }
}
