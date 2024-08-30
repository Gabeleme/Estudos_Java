/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava0;

import entities.notas;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Ex06CursoObjnotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        Locale.setDefault(Locale.US); 
        
        notas not = new notas(); 
        
        System.out.print("Informe seu nome: ");
        not.nome = entrada.nextLine(); 
        
        System.out.print("Informe a primeira nota: ");
        not.nota1 = entrada.nextDouble(); 
        
        System.out.print("Informe a segunda nota: ");
        not.nota2 = entrada.nextDouble(); 
        
        System.out.print("Informe a terceira nota: ");
        not.nota3 = entrada.nextDouble(); 
        
        System.out.println();
        
        System.out.printf("Notas finais: %.2f\n", not.notafinal());
        
        if(not.notafinal() < 60){
            System.out.println("NOTA ABAIXO DA MÉDIA ");
            System.out.printf("Faltam %.2f Pontos ", not.faltanota());
        }else {
            System.out.println("VOCÊ ESTÁ APROVADO!!");
        }
                
    }
}
