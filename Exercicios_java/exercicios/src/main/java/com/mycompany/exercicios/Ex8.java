/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author gabio
 */
public class Ex8 {
     public static void main(String[] args) {
        
        int idade = 17;
        double saldoConta = 5000.0;
        double rendaMensal = 3000.0;
        
        //Verifique se uma pessoa é elegivel para um emprestimo com base em criterios 
        boolean elegivelEmprestimo = idade >= 18 && saldoConta >= 1000 && rendaMensal >= 2000;
        
        //Calcule o valor maximo do emprestimo com base na renda mensal
        double valorMaxEmprestimo = rendaMensal * 12 * 0.5; //50% da renda mensal 
        
        //Exiba o resultado 
        System.out.println("Elegivel para emprestimo: " + elegivelEmprestimo);
        System.out.println("Valor maximo do emprestimo: " + valorMaxEmprestimo);
    }
}
