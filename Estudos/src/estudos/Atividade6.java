/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

import java.util.Scanner;


public class Atividade6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       
       System.out.print("Quantos números vai digitar: "); 
       int n = sc.nextInt(); 
       
       int[] V = new int [n];
       
       for(int i = 0; i < n; i++){
           System.out.print("Informe um valor: "); 
           V[i] = sc.nextInt();
       }
        double maiorNumero = V[0];
        int posicaoMaior = 0;

        for (int i = 1; i < n; i++) {
            if (V[i] > maiorNumero) {
                maiorNumero = V[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("Maior número: %.2f%n", maiorNumero);
        System.out.println("Posição do maior número: " + posicaoMaior);

       
   } 
}
