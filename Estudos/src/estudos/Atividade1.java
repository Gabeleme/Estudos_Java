/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudos;

import java.util.Scanner;

/**
 *
 * @author gabio
 */
public class Atividade1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Informe um inteiro: ");
        int quant = sc.nextInt(); 
        
        double[] V = new double[quant]; 
        double soma = 0;
        
        
        for(int i =0; i < quant; i++){
            System.out.println("Informe a altura: "); 
            V[i] = sc.nextDouble(); 
            soma += V[i]; 
        }
        
        double media = soma / quant; 
        
        for(int i = 0; i < quant; i++){
            System.out.println("As alturar inseridas foram " + V[i]); 
        }
        System.out.print("---------------");
        System.out.printf("A média das alturas foram é: %.2f%n", media); 
    }
    
}
