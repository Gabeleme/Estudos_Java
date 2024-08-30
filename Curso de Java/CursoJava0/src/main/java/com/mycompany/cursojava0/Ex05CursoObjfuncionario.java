/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava0;

import entities.funcionario;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex05CursoObjfuncionario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        Locale.setDefault(Locale.US);
        funcionario func = new funcionario(); 
        
        System.out.print("Nome: ");
        func.nome = entrada.nextLine(); 
        System.out.print("Salário Bruto: ");
        func.salariobruto = entrada.nextDouble(); 
        System.out.print("Imposto: ");
        func.imposto = entrada.nextDouble(); 
        
        System.out.println();
        
        System.out.println("Funcionario: " + func);
        System.out.println();
        System.out.println("Qual a porcentagem de aumento do salário: ");
        double porcentagem = entrada.nextDouble(); 
        func.incrementarsalario(porcentagem);
        
        System.out.println();
        System.out.println("Atualizaçãoes das informações: " + func);
            
    }
}
