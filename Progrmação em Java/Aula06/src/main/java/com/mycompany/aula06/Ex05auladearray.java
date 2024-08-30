/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06;

/**
 *
 * @author gabio
 */
public class Ex05auladearray {
    public static void main(String[] args) {
        String nome[] = {"Pedro", "Ana", "Jorge"}; 
        
        for(int i = 0; i < nome.length; i ++){
            System.out.printf("%d nome: %s\n", (i+1), nome[i]);
        }
    }
}
